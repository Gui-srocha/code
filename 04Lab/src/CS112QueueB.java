public class CS112QueueB implements CS112QueueInterface {
    //Guilherme Santos Rocha
    private int[] theQ;
    private int front;
    private int back;
    private int count;

    public CS112QueueB(int initialSize) {
        theQ = new int[initialSize];
        front = 0;
        back = -1;
        count = 0;
    }

    public CS112QueueB() {
        this(4);
    }

    public void writeQueue() {

        if (front < back) {
            System.out.println("___________ Writing Queue Info_______");
            System.out.println("front: " + front);
            System.out.println("back : " + back);
            System.out.println("count: " + count);
            for (int x = front; x <= back; x++) {
                System.out.print(theQ[x] + " ");
            }
            System.out.println();
            System.out.println("_____________________________________________");
            System.out.println();
        } else if (back < front) {
            System.out.println("___________ Writing Queue Info_______");
            System.out.println("front: " + front);
            System.out.println("back : " + back);
            System.out.println("count: " + count);
            for (int x = front; x != back; x = (x + 1) % theQ.length) {
                System.out.print(theQ[x] + " ");
                if (x == front) {
                    break;
                }
            }
            System.out.println();
            System.out.println("_____________________________________________");
            System.out.println();
        }
    }

    public void writeArray() {
        System.out.println("___________ Writing Queue Array Info_______");
        System.out.println("front: " + front);
        System.out.println("back : " + back);
        System.out.println("count: " + count);

        for (int i = 0; i < theQ.length; i++)
            System.out.print(theQ[i] + " ");
        System.out.println();
        System.out.println("_____________________________________________");
        System.out.println();

    }

    public void enqueue(int toBeAdded) {
        if (full()) {
            expand();
        } else if (bumped()) {
            shiftBack();
            back = (back + 1) % theQ.length;
            theQ[back] = toBeAdded;
            count = count + 1;
        } else {
            back = (back + 1) % theQ.length;
            theQ[back] = toBeAdded;
            count = count + 1;
        }

    }

    private void shiftBack() {
        int temp = 0;
        for (int x = front; x < theQ.length; x++) {
            if (x >= theQ.length - front) {
                theQ[temp] = theQ[x];
                temp++;
                theQ[x] = 0;
            } else {
                theQ[temp] = theQ[x];
                temp++;
            }
        }
        back = back - front;
        front = 0;
    }

    private void expand() {
        int[] newQ = new int[theQ.length * 2];
        for (int i = 0; i < theQ.length; i++)
            newQ[i] = theQ[i];
        theQ = newQ;
    }

    private boolean bumped() {
        return back == theQ.length - 1;
    }

    private boolean full() {
        return count == theQ.length;
    }


    public int dequeue() {
        if (isEmpty()) {
            return -978;
        } else {
            int toR = theQ[front];
            front = (front + 1) % theQ.length;
            count = count - 1;
            return toR;
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -978;
        } else {
            return theQ[front];

        }
    }


    public boolean isEmpty() {
        return count == 0;
    }
}
