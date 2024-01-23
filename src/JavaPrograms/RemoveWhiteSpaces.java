package src.JavaPrograms;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String inputString = sc.nextLine();
        String stringWithoutSpace = inputString.replaceAll("\\s+","");
        System.out.println("Input String: "+inputString);
        System.out.println("String without spaces: "+stringWithoutSpace);
    }
}
