package Polymorphism;
class A{
    void run(){

        System.out.println("Run A");
    }
}

public class B extends A {
    void run(){
        System.out.println("Run B");
    }
    public static void main(String[] args) {

       // A a = new A();
        //a.run();

        A b = new B();
        b.run();

        //B c = new B();
        //c.run();


    }
}
