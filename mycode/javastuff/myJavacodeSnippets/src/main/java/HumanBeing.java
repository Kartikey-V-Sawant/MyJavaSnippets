public class HumanBeing {
    public static void main(String args[]){
        Human human = new Human("23",23);
        System.out.println(human.getName());
        System.out.println(human.getAge());
        System.out.println(human.walk());
        System.out.println(human.run());
        System.out.println(human.Dance());

    }

}
class Human{
     String Name;
     int age ;
     public Human(String h_name,int h_age){
        age=h_age;
        Name=h_name;

    }
     String getName(){
        return Name;
    }
     int getAge(){
        return age;
     }
     boolean Dance(){
        return true;
     }
     boolean walk(){
        return true;
     }
     boolean run(){
        return  true;
    }
     boolean sing(){
        return true;
    }
}


