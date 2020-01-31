package Stack.Stack_Implementation;

import Stack.Car;
import Stack.Generic_Stack.MyStack;

public class StackImp1  {

    private int m_id;
    public StackImp1(int m_id){
        this.m_id=m_id;
    }
    public int id () {
        return m_id;
    }

    public MyStack Carstack() {
        MyStack<Car> stackOfCars = new MyStack<>(5);
        int max_items = stackOfCars.max_Size();
        for (int i = 1; i <= max_items; ++i) {
            Car car = new Car(i);
            System.out.println("Pushing cars in stack id "+car.id());
            stackOfCars.push(car);


        }
        return stackOfCars;

    }


}
