package src.JavaPrograms;

import java.util.Scanner;

public class pyramidPattern2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("How many rows pyramid do you want?");
        int noOfrows = sc.nextInt();
        int rowCount = 1;
        System.out.println("Here is your Pyramid");
        for (int i = noOfrows; i >0 ; i--) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
