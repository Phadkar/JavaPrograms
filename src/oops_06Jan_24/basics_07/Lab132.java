package src.oops_06Jan_24.basics_07;

public class Lab132 {
    public static void main(String[] args) {
        String s1 = "Priyanka";
        String s2 = new String("Priyanka");
        String s3 = new String("priyanka");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

    }
}
