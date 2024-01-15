package src;

public class Ex03 {
    public static void main(String[] args) {
        Ex3 p1 = new Ex3("John", 30);
        Ex3 p2 = new Ex3("John", 30);
        System.out.println(p1.hashCode()); // prints a number
        System.out.println(p2.hashCode());

    }
}
