package src.oops_07;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

//Prime Number
public class Lab127 {
    public static void main(String[] args) {
        int i = 0;
        int flag = 0;
        int m = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        m = n / 2;

        if (n == 0 || n == 1) {
            System.out.println("Not a prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("Not a prime number: " +n);
                    flag = 1;
                    break;
                }
            }

        }

        if(flag == 0) {
            System.out.println("Prime number: " +n);
        }
    }
}
