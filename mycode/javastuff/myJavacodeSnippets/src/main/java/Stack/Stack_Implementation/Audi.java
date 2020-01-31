package Stack.Stack_Implementation;

import Stack.Generic_Stack.MyStack;
import Stack.Stack_Interface.Vehicle;

public class Audi implements Vehicle {


    private int m_id;

    public Audi(int i) {
        this.m_id=i;
    }


    public int id() {
        return m_id;
    }



}
