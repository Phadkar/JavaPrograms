package src.basics_03;

import java.util.Scanner;

public class Lab049 {
    public static void main(String[] args) {

// Take three input from user and give max out of two number
        // a,b  a>b -> a, else b

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();


        if(a>b){
            System.out.println("A is greater than B " +a);
        }else{
            System.out.println("B is greater than A " );
        }

        // concatenation - combine two or more things

    }
}
