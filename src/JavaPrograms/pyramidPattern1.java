package src.JavaPrograms;

import java.util.Scanner;

public class pyramidPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in Pyramid");
        int noOfRows = sc.nextInt();
        int rowCount = 1;
        System.out.println("Here is you pyramid:");
        for (int i = noOfRows; i >0 ; i--) 
        {
            for (int j = 0; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=rowCount ; j++) {
                System.out.print(rowCount+" ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
