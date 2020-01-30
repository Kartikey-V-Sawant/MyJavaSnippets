package Queue;

public class MyQueue<Q_Object extends Object>{
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
    public Q_Object Enqueue(Q_Object element){
        rear=rear+1;
        current_size++;
        return m_queue[rear]=element;

    }
    public Q_Object Dequeue(){

        front =(front+1)%capacity;
        current_size--;
        return m_queue[front];
    }
    public boolean isEmpty(){
        return (rear==front);
    }
    public int Size(){
        return current_size;
    }
    public Q_Object getFront(){
        return m_queue[front];
    }
    public Q_Object getRear(){return  m_queue[rear];}
    public int getCapacity(){
        return capacity;
    }
    public boolean isFull(){
        return (capacity==current_size);
    }






}
