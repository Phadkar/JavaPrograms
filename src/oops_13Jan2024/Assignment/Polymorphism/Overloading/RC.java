package src.oops_13Jan2024.Assignment.Polymorphism.Overloading;

public class RC {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println("Sum of int: " + c1.add(2,4));
        System.out.println("Sum of double: " + c1.add(2.566, 565.343));
    }
}
