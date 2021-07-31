import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;

public class RBTester {

    public static void main (String[] args) {

	if (args.length != 1) { showUsageAndExit(); }

	RedBlackTree<Integer> rbt = new RedBlackTree<Integer>();
	Scanner                sc = null;
        try {
            sc = new Scanner(new File(args[0]));
        } catch (FileNotFoundException e) {
            System.err.printf("ERROR: Could not open file %s\n", args[0]);
            System.exit(1);
        }

	// Read instructions until there are no more.
	int line = 0;
	while (sc.hasNext()) {

	    line = line + 1;
	    int    value = 0;
	    try {
		value = sc.nextInt();
	    } catch (InputMismatchException e) {
		System.err.printf("ERROR: Could not read value on line %d\n", line);
		System.exit(1);
	    }
            String  color = sc.next();
            boolean red   = false;;
            if (color.equalsIgnoreCase("red")) {
                red = true;
            } else if (!color.equalsIgnoreCase("black")) {
                System.err.printf("ERROR: Unknown color %s on line %d\n", color, line);
                System.exit(1);
            }
            
            rbt.insert(value, red);
            
	}

        System.out.printf("Is it valid? %b\n", isRBTree(rbt));

    }

    
    private static void showUsageAndExit () {
	
	System.err.printf("USAGE: java RBTester <input pathname>\n");
	System.exit(1);

    }


    private static boolean isRBTree (RedBlackTree<Integer> rbt) {

	RBNode<Integer> root = rbt.root;
	//1. Each node is colored red or black.
        //2. The root note is black.
        if (root.red == true){
            return false;
        }
        //3. Each null leaf is black.
        else if(!nullChecker(root)){
            return false;
        }
        //4. A red node can have only black children.
        else if(!redChildChecker(root)){
            return false;
        }
        //5. At each node, the path to each null leaf must traverse an equal number of black nodes.
        else if(equalChecker(root) == -1){
            return false;
        }
        // COMPLETE THIS METHOD.  YOU MAY/SHOULD USE HELPER METHODS.
	return true;
    }


    private static boolean nullChecker(RBNode<Integer> node){
        if (node.isNullLeaf()){
            if (node.red == true){
                return false;
            }
        }
        nullChecker(node.left);
        nullChecker(node.right);

        return true;
    }

    private static boolean redChildChecker(RBNode<Integer> node){
        if (node.red == true){
            if (node.left != null){
                if (node.left.red == true){
                    return false;
                }
            }
            if (node.right != null){
                if (node.right.red == true){
                    return false;
                }
            }
        }
        redChildChecker(node.left);
        redChildChecker(node.right);

        return true;
    }

    private static int equalChecker(RBNode<Integer> node){
        if (node.isNullLeaf()){
            return 0;
        }
        int leftCount = equalChecker(node.left);
        int rightCount = equalChecker(node.right);

        if (leftCount != rightCount){
            return -1;
        }
         else if (leftCount != -1){
             if (node.red== false){
                 return leftCount +1;
             }
             else {
                 return leftCount;
             }
        }
         return -1;
    }


} // class RBTest
