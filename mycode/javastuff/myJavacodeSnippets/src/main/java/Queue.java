public class Queue {
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
class MyQueue<Q_Object extends Object>{
    private Q_Object[] m_queue;
    private int front;
    private int rear;
    private int capacity;
    private int current_size;

    public MyQueue(int initial_size){
        m_queue =(Q_Object[]) new Object[initial_size];
        front=0;
        rear=-1;
        capacity=initial_size;
        current_size=0;
    }
    Q_Object Enqueue(Q_Object element){
        rear=rear+1;
        current_size++;
        return m_queue[rear]=element;

    }
    Q_Object Dequeue(){

        front =(front+1)%capacity;
        current_size--;
        return m_queue[front];
    }
    boolean isEmpty(){
        return (rear==front);
    }
    int Size(){
        return current_size;
    }
    Q_Object getFront(){
        return m_queue[front];
    }
    Q_Object getRear(){return  m_queue[rear];}
    int getCapacity(){
        return capacity;
    }
    boolean isFull(){
        return (capacity==current_size);
    }






}