package Stack;

import Stack.Generic_Stack.MyStack;
import Stack.Stack_Implementation.Audi;
import Stack.Stack_Interface.Vehicle;

public class StackOfStack {

    public static void main(String args[]) {
        MyStack<MyStack<Vehicle>> stackOfStacks = new MyStack<>(1);
        MyStack<Vehicle> stackOfVehicles = new MyStack<>(5);

        int max_item_stackOfVehicle = stackOfVehicles.max_Size();
        int max_item_stackOfStack = stackOfStacks.max_Size();
        for (int j=1;j<=max_item_stackOfStack;++j) {
            stackOfStacks.push(stackOfVehicles);
            for (int i = 1; i <= max_item_stackOfVehicle; ++i) {
                Vehicle newCar = new Audi(i);
                System.out.println( "Pushed car Audi with id "+newCar.id()+"  into stack id ");
                stackOfVehicles.push(newCar);
            }

            }
        }


    }
