package src.oops_07;

import java.util.Scanner;
//Number swap without temp variable

public class Lab123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a: ");
        int a = sc.nextInt();
        System.out.print("Enter the b: ");
        int b = sc.nextInt();

        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("After swapping value of a: " + a);
        System.out.println("After swapping value of b: " + b);
    }
}
