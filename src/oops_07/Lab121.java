package src.oops_07;

import java.util.Scanner;

//Number swap with temp variable
public class Lab121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a: ");
        int a = sc.nextInt();
        System.out.println("Enter the b: ");
        int b = sc.nextInt();

        System.out.println("Before swapping value of a: " + a);
        System.out.println("Before swapping value of b: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping value of a: " + a);
        System.out.println("After swapping value of b: " + b);


    }
}
