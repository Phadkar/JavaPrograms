package src.oops_06Jan_24.basics_07;

import java.util.Scanner;

//Palidrome using StringBuilder
public class Lab137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check Palidrome or not: ");
        String user_input = sc.next();

        boolean result = isPalidrome(user_input);
        if(result){
            System.out.println("Is Palidrome");
        }else{
            System.out.println("Not a Palidrome");
        }
    }

    static boolean isPalidrome(String userInput) {
        String org_String = userInput;
        StringBuilder sb = new StringBuilder(userInput);
        String rev_String = sb.reverse().toString();
        return org_String.equalsIgnoreCase(rev_String);
    }


}
