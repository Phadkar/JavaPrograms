package src.basics_03;

public class Lab027 {
    public static void main(String[] args) {
        //Casting-Mold
        //Widening is a process of converting lower type to higher type (Safe conversion)

        byte b = 10;
        int a = b; //Implicit casting
        int a1= (int)b; //Explicit casting -JVM

        //Narrowing is a process of converting higher type to lower type
        int a2= 300;
        // byte b1= a2; //Invalid implicit
        byte b1 = (byte)a2;
        System.out.println(b1);
    }
}
