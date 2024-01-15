package src.oops_13Jan2024.Assignment.Polymorphism.Overriding;

public class RC {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Animal a = new Animal();
        a.sound();

        Animal a1 = new Dog();
        a1.sound();
    }
}
