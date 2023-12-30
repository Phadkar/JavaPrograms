package src.basics_05;

import java.util.Scanner;

public class Lab068 {
    public static void main(String[] args) {
        //  3/ x^2 + y^2 - |z|
        // A --> x^2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = sc.nextDouble();
        System.out.println("Enter y: ");
        double y = sc.nextDouble();
        System.out.println("Enter z: ");
        double z = sc.nextDouble();

        double result;
        result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);

        sc.close();
    }
}
