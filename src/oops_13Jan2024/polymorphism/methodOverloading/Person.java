package src.oops_13Jan2024.polymorphism.methodOverloading;

public class Person {
    //Method overloading --> Multiple methods with same name but different arguments

    void gift(int a){
        System.out.println("a is a int"+a);
    }

    void gift(String a){
        System.out.println("a is a String"+a);
    }

}
