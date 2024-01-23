package src.JavaPrograms;

import java.util.Scanner;

public class pyramidPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows pyramid do you want?");
        int noOfrows = sc.nextInt();
        int rowsCount = 1;
        System.out.println("here is your pyramid:");
        for (int i = noOfrows; i >0; i--) {
            for (int j = 1; j < i*2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=rowsCount ; j++) {
                System.out.print(j+ " ");
            }
            for (int j = rowsCount-1; j >=1 ; j--) {
                System.out.print(j+ " ");
            }
            System.out.println();
            rowsCount++;
        }
    }
}
