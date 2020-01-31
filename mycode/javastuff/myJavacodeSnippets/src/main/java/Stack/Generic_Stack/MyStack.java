package Stack.Generic_Stack;

public class MyStack<I> {
  private I[] m_stack;
  private int m_top_element ;
  private int maxsize;

  //Constructor for our class which is taking stack size as argument.
  public MyStack(int initial_size) {

    maxsize=initial_size;
    m_stack = (I[]) new Object[initial_size];
    m_top_element=-1;
    }
  public void push(I item){

    m_stack[++m_top_element]= item;


  }

  //method for removing item from stack
  public I pop(){

    I item = m_stack[m_top_element--];

    return item;  }

  //method to show element at top.
  public I top(){
    if(m_top_element <0)

      return null;
    return m_stack[m_top_element]; }


  //method for checking whether stack is empty or not
  public boolean isEmpty() {
    return (m_top_element < 0); }

  //method for checking current size
  public int current_size () {return m_top_element+1; }

  //method for checking  that stack is full or not.
  public boolean isFull() {
    return m_top_element ==maxsize-1;
  }

  public int max_Size(){
    return maxsize;
  }



}
