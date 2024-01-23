package src.JavaPrograms;

import java.util.Scanner;

public class pyramidPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows do you want in pyramid?");
        int noOfrows = sc.nextInt();
        int rowCount = 1;
        System.out.println("Here is the pyramid:");
        for (int i = noOfrows; i >0 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=rowCount ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
