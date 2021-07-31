import java.lang.Math;

public class MazeGenerator {
	UnionFind sets = new UnionFind();

	public void run(int n) {

		Cell[][] mazeMap = new Cell[n][n];
		initializeCells(mazeMap);

		Wall[] walls = getWalls(mazeMap);

		createMaze(walls, mazeMap);

		printMaze(mazeMap);

	}

	public void createMaze(Wall[] walls, Cell[][] mazeMap) {
		makeSets(mazeMap);
		exits(mazeMap);
		createLoop(walls);
	}

	private void exits(Cell[][] mazeMap){
		mazeMap[0][0].left.visible = false;
		mazeMap[mazeMap.length-1][mazeMap[0].length-1].right.visible = false;
	}


	private void arrayAdjuster(Wall[] walls, int index, int size){
		Wall temp = walls[index];
		walls[index] = walls[size-1];
		walls[size-1] = temp;
	}

	private void createLoop(Wall[] walls){
		int actualSize = walls.length-2;
		while (sets.numSets() > 1) {
			int randomWallIndex = (int) (Math.random() * actualSize);
			Wall wallToDelete = walls[randomWallIndex];
			if (checkCycleRule(wallToDelete)) {
				removeWall(wallToDelete);
			}
			arrayAdjuster(walls, randomWallIndex, actualSize);
			actualSize--;
		}
	}


	private void removeWall(Wall wall){
		wall.visible = false;
		sets.union(wall.first, wall.second);
	}


	private boolean checkCycleRule(Wall wall){
		Cell c1 = wall.first;
		Cell c2 = wall.second;
		if (c1 == null || c2 == null) return false;
		return sets.find(c1) != sets.find(c2);
	}

	private void makeSets(Cell[][] mazeMap){
		for (int i = 0; i < mazeMap.length; i++) {
			for (int j = 0; j < mazeMap[i].length; j++) {
				sets.makeSet(mazeMap[i][j]);
			}
		}
	}


    public void printMaze(Cell[][] maze) {
	for(int i = 0; i < maze.length; i++) {
	    // print the up walls for row i
	    for(int j = 0; j < maze.length; j++) {
		Wall up = maze[i][j].up;
		if(up != null && up.visible) System.out.print("+--");
		else System.out.print("+  ");
	    }
	    System.out.println("+");

	    for(int j = 0; j < maze.length; j++) {
		Wall left = maze[i][j].left;
		if(left != null && left.visible) System.out.print("|  ");
		else System.out.print("   ");
	    }

	    //print the last wall on the far right of row i
	    Wall lastRight = maze[i][maze.length-1].right;
	    if(lastRight != null && lastRight.visible) System.out.println("|");
	    else System.out.println(" ");
	}

	// print the last row's down walls
	for(int i = 0; i < maze.length; i++) {
	    Wall down = maze[maze.length-1][i].down;
	    if(down != null && down.visible) System.out.print("+--");
	    else System.out.print("+  ");
	}
	System.out.println("+");


    }

    public void initializeCells(Cell[][] maze) {
	for(int i = 0; i < maze.length; i++) {
	    for(int j = 0; j < maze[0].length; j++) {
		maze[i][j] = new Cell();
	    }
	}
    }

    public Wall[] getWalls(Cell[][] mazeMap) {

	int n = mazeMap.length;

	Wall[] walls = new Wall[2*n*(n+1)];
	int wallCtr = 0;

	// each "inner" cell adds its right and down walls
	for(int i = 0; i < n; i++) {
	    for(int j = 0; j < n; j++) {
		// add down wall
		if(i < n-1) {
		    walls[wallCtr] = new Wall(mazeMap[i][j], mazeMap[i+1][j]);
		    mazeMap[i][j].down = walls[wallCtr];
		    mazeMap[i+1][j].up = walls[wallCtr];
		    wallCtr++;
		}
		
		// add right wall
		if(j < n-1) {
		    walls[wallCtr] = new Wall(mazeMap[i][j], mazeMap[i][j+1]);
		    mazeMap[i][j].right = walls[wallCtr];
		    mazeMap[i][j+1].left = walls[wallCtr];
		    wallCtr++;
		}
	    }
	}

	// "outer" cells add their outer walls
	for(int i = 0; i < n; i++) {
	    // add left walls for the first column
	    walls[wallCtr] = new Wall(null, mazeMap[i][0]);
	    mazeMap[i][0].left = walls[wallCtr];
	    wallCtr++;

	    // add up walls for the top row
	    walls[wallCtr] = new Wall(null, mazeMap[0][i]);
	    mazeMap[0][i].up = walls[wallCtr];
	    wallCtr++;

	    // add down walls for the bottom row
	    walls[wallCtr] = new Wall(null, mazeMap[n-1][i]);
	    mazeMap[n-1][i].down = walls[wallCtr];
	    wallCtr++;

	    // add right walls for the last column
	    walls[wallCtr] = new Wall(null, mazeMap[i][n-1]);
	    mazeMap[i][n-1].right = walls[wallCtr];
	    wallCtr++;
	}


	return walls;
    }


    public static void main(String [] args) {
	if(args.length > 0) {
	    int n = Integer.parseInt(args[0]);
	    new MazeGenerator().run(n);
	}
	else new MazeGenerator().run(5);
    }

}