package Stack;

import Stack.Generic_Stack.MyStack;
import Stack.Stack_Implementation.StackImp1;
import Stack.Stack_Interface.StackInterface;

public class StackOfStack {

    public static void main(String args[]) {
        MyStack<MyStack<Car>> stackofStacks = new MyStack<MyStack<Car>>(10);
        int maxsize_stackOfstacks = stackofStacks.max_Size();
        StackInterface car = null;
        for (int i =1;i<=maxsize_stackOfstacks;++i) {
            car = new StackImp1(i);

            System.out.println("Pushing Stack of cars  into stack"+car.id());
            stackofStacks.push(car.Carstack());

            System.out.println("Current size of Stack of Stack ="+stackofStacks.current_size());
        }
    }


    }
