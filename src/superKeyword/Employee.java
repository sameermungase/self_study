package superKeyword;

public class Employee extends Person {
    int age = 30;
/*    void printAge(){
        int age = 25;
        System.out.println("Method Age is "+ age);
        System.out.println("Global Age is "+ this.age);

//        Person p = new Person();
        System.out.println(super.age);

        Employee p2 = new Employee();
        System.out.println(p2.age);
    }*/

    public static void main(String args[]){

        Employee e = new Employee();
//        ((Employee) e).printAge();


    }
}
