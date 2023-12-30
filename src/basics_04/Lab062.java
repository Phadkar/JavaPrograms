package src.basics_04;

import java.util.Scanner;

public class Lab062 {
    public static void main(String[] args) {
// Take user input and print the information
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter you salary: ");
        double salary = sc.nextDouble();

        System.out.println(name + " " + age + " " + salary);
        }
   }


