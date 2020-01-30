package Stack;

public class StackOfStack {
    public static void main(String args[]) {
        MyStack<MyStack<Car>> stackofStacks = new MyStack<MyStack<Car>>(10);
        MyStack<Car> stackOfCars = new MyStack<>(5);
        int maxsize_stackOfCars = stackOfCars.max_Size();

        while (stackofStacks.isEmpty()){
        stackofStacks.push(stackOfCars);
            for (int j =1;j<=maxsize_stackOfCars;++j) {
                Car car = new Car(j);
                stackOfCars.push(car);
                System.out.println( "Pushing car id " +car.id() +" into Stack " + stackofStacks.current_size());
            }
        }
                System.out.println("*****************************************");
                System.out.println("Size of stackOfstack = " + stackofStacks.current_size() );
                System.out.println("Size of stackOfcars = " + stackOfCars.current_size());
                System.out.println("*****************************************");
            while (stackOfCars.current_size() != 0) {
                Car car= stackOfCars.pop();
                System.out.println( "Popping car id " +car.id() +" from Stack " + stackofStacks.current_size());
            }
        }
    }
