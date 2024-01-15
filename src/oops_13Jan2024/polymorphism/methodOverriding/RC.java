package src.oops_13Jan2024.polymorphism.methodOverriding;

// Method Overriding means when two or more methods having same name and same argument types
public class RC {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();

        Dog d1 = new Hound();
        d1.bark();

        Hound h = new Hound();
        h.bark();
    }
}
