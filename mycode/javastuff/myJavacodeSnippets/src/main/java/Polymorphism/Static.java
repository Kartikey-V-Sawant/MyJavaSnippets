package Polymorphism;
class Example{


    int a,b;
    public Example(int a, int b) {
        System.out.println("this is parameterized contstructor");
     this.a = a;
     this.b = b;
    }

    public Example() {


    }
    void add(double a, double b){

         a -=2;
    }

}
    public class Static {
    public static void main(String[] args){
        Example eg = new Example();

        double a=15,b=12;
        eg.add(a,b);

        System.out.println(a);

        Example example = new Example(100,2);
        System.out.println("A="+example.a+"B="+example.b);

    }
}

