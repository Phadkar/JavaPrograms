package src.basics_06;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];
        System.out.print("Enter first subject marks: ");
        marks[0]=sc.nextFloat();
        System.out.print("Enter second subject marks: ");
        marks[1]=sc.nextFloat();
        System.out.print("Enter third subject marks: ");
        marks[2]=sc.nextFloat();
        System.out.print("Enter fourth subject marks: ");
        marks[3]=sc.nextFloat();
        System.out.print("Enter fifth subject marks: ");
        marks[4]=sc.nextFloat();

        for (int i = 0; i < marks.length ; i++) {
            if(marks[i]<30){
                System.out.println("You are fail in this subject" +marks[i]);
            }
            System.out.println(marks[i]);
        }

        sc.close();
    }
}
