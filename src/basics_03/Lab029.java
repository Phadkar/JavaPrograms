package src.basics_03;

public class Lab029 {
    public static void main(String[] args) {
       String s1 = "Pramod";
       //SCP - String constant Pool

        String s2= new String("Pramod");
        System.out.println(s2);
        System.out.println(new String("Pramod"));
    }
}
