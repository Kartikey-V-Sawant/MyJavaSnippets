package Stack.Stack_Implementation;

import Stack.Car;
import Stack.Generic_Stack.MyStack;
import Stack.Stack_Interface.Vehicle;

public class BMW implements Vehicle {


   private int m_id;

    public BMW(int i) {
        this.m_id=i;
    }




    public int id() {
        return m_id;
    }








}
