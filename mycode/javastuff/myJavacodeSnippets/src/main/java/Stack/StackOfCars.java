package Stack;

import Stack.Generic_Stack.MyStack;

public class StackOfCars {
    public static void main(String[] a)
    {
        MyStack<Car> stackOfCars = new MyStack<>(10);
        int max_items = stackOfCars.max_Size();

        // push items into stack
        for (int i = 1; i <= max_items; ++i) {
            Car car = new Car(i);
            System.out.println("Pushed car id " + car.id() + " from stack");
            stackOfCars.push(car);
        }

        System.out.println("----------------------------------");

        // pop items from stack
        while (stackOfCars.current_size() != 0) {
            Car car = stackOfCars.pop();
            System.out.println("Popped car id " + car.id() + " from stack");
        }
    }
}

