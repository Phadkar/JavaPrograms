package src.basics_04;

import java.util.Scanner;

public class Lab058 {
    public static void main(String[] args) {
//TO check whether the word is vowel or not
        // Switch - Condition based - Multiple Condition
       Scanner sc = new Scanner (System.in);
        System.out.println("Enter the word: ");
        char word = sc.next().toUpperCase().toCharArray()[0];

        switch(word){
            case 'A':
                System.out.println("Is a Vowel");
                break;
            case 'E':
                System.out.println("Is a Vowel");
                break;
            case 'I':
                System.out.println("Is a Vowel");
                break;
            case 'O':
                System.out.println("Is a Vowel");
                break;
            case 'U':
                System.out.println("Is a Vowel");
                break;
            default:
                System.out.println("Not a Vowel");


        }
        sc.close();
    }
}
