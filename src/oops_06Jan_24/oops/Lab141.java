package src.oops_06Jan_24.oops;

public class Lab141 {
    public static void main(String[] args) {
        // Person - class blueprint
        // p - ref variable
        // new Person() - Object Real
        // OOPs concept

        Person p = new Person();
        p.name = "Priyanka";
        System.out.println(p.name);

        Person p1 = new Person();
        p1.name = "Siya";
        System.out.println(p1.name);

        new Person(); // object -> new Object
        // Person(); -> Method or Function
        Person p3 = null;
        System.out.println("End of the Program");


    }
}
