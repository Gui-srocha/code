public class UseQueue {


    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        CS112QueueB myQ = new CS112QueueB(size);

        myQ.enqueue(1);
        myQ.writeQueue();

        myQ.enqueue(2);
        myQ.writeQueue();

        myQ.enqueue(7);
        myQ.writeQueue();

        myQ.enqueue(18);
        myQ.writeQueue();
        myQ.dequeue();
        myQ.writeQueue();
        myQ.dequeue();
        myQ.writeQueue();
        // this will throw an exception until you fix the Queue implementation
        myQ.enqueue(9);
        myQ.writeQueue();
        myQ.enqueue(19);
        myQ.writeQueue();
        myQ.enqueue(91);
        myQ.writeQueue();
        myQ.dequeue();
        myQ.writeQueue();
        myQ.dequeue();
        myQ.writeQueue();
        myQ.enqueue(17);
        myQ.writeQueue();
        myQ.enqueue(88);
        myQ.writeQueue();
        myQ.enqueue(15);
        myQ.writeQueue();
        myQ.enqueue(44);
        myQ.writeQueue();
        myQ.dequeue();
        myQ.writeQueue();
    }


}
