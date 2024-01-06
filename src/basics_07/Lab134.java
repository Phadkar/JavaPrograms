package src.basics_07;

public class Lab134 {
    public static void main(String[] args) {
        // Immutable in nature (that can't be changed)
        String password = "pass@123";

        // 1000 times I am going to change the password value
        // should I use the Sb, sb OR String

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("Priyanka");
        password2.append(" Hadkar");
        System.out.println(password2);
    }
}
