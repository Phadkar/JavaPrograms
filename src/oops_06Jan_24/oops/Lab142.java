package src.oops_06Jan_24.oops;

public class Lab142 {
    public static void main(String[] args) {
        // Person - class blueprint
        // p - ref variable
        // new Person() - Object Real
        // OOPs concept

        Dog p = new Dog();
        p.name = "Sheru";
        System.out.println(p.name);

        Dog p1 = new Dog();
        p1.name = "Billuuu";
        System.out.println(p1.name);

        new Dog(); // object -> new Object
        // Person(); -> Method or Function
        Dog p3 = null;
        System.out.println("End of the Program");


    }
}
