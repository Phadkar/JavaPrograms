package src.oops_07;

import java.util.Scanner;

//Take user input as  array
public class Lab124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] int_array = new int[n];

        System.out.println("Enter the elements");

        for (int i = 0; i < n; i++) {
            int_array[i] = sc.nextInt();
        }

        System.out.println("-----OUTPUT---");

        for (int i = 0; i < n; i++) {
            System.out.println(int_array[i]);
        }
    }
}
