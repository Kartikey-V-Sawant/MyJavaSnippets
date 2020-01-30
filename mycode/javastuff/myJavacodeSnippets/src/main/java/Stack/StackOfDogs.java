package Stack;

public class StackOfDogs {
public  static void main(String args[]) {
    MyStack<Dog> stackOfDogs = new MyStack<>(10);
    int max_items = stackOfDogs.max_Size();
    for (int i = 1; i <= max_items; ++i) {
        Dog newdog = new Dog(i);
        stackOfDogs.push(newdog);
        System.out.println("Dog " + stackOfDogs.top().id() + " Pushed in to the stack");
        System.out.println("Dog " + stackOfDogs.pop().id() + " Popped out from stack");
    }
}
}
