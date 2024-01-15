package src.oops_13Jan2024.Assignment.Inheritance.Multilevel;

public class RC_Multilevel {
    public static void main(String[] args) {
        Child child = new Child();
        child.chat();
        child.speak(); //Grandparent class
        child.talk(); //Parent class
    }
}
