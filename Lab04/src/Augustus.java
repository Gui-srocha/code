public class UseQueue {


    public static void main(String[] args) {
        int Guests = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        CS112QueueInterface myQ = new CS112Queue();

        for (int x = 1; x <= Guests; x++) {
            myQ.enqueue(x);
        }
        while (!myQ.isEmpty()) {
            for (int x = 1; x <= n; x++) {
                if (x == n) {
                    int temp = myQ.dequeue();
                    if (myQ.isEmpty()) {
                        System.out.println(temp + " wins the coin!");
                        break;
                    }
                    System.out.println("Guest " + temp + " is out.");
                } else {
                    int value = myQ.peek();
                    myQ.dequeue();
                    myQ.enqueue(value);
                }
            }
        }
    }


}
