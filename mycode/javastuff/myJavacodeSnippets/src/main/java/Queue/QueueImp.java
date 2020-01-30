package Queue;

import Queue.*;
public class QueueImp {
    public static void main(String args[]){
        MyQueue<String> queue = new MyQueue(4);
        queue.Enqueue("Scala");
        queue.Enqueue("java");
        queue.Enqueue("Hadoop");
        queue.Enqueue("c");


        while (!queue.isEmpty()){
            System.out.println("Is the queue full? "+queue.isFull());
            System.out.println("Queue capacity is ="+queue.getCapacity());
            System.out.println("Element at front="+queue.getFront());
            System.out.println("Element at Rear="+queue.getRear());
            System.out.println("Current  Size="+queue.Size());
            System.out.println("Removing element from front="+queue.getFront());
            queue.Dequeue();
            System.out.println("Size After Removing element ="+queue.Size());
            System.out.println("");

        }
    }

}
