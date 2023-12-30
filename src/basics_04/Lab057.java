package src.basics_04;

import java.util.Locale;
import java.util.Scanner;

public class Lab057 {
    public static void main(String[] args) {

        // Switch - Condition based - Multiple Condition
       Scanner sc = new Scanner (System.in);
        System.out.println("Enter which browser you want to execute");
        String browserName = sc.nextLine();

        switch(browserName.toUpperCase()){
            case "CHROME":
                System.out.println("Execute Chrome browser");
                break;
            case "EDGE":
                System.out.println("Execute Edge browser");
                break;
            case "SAFARI":
                System.out.println("Execute Safari browser");
                break;
            case "FIREFOX":
                System.out.println("Execute Firefox browser");
                break;
            default:
                System.out.println("Entered browser not installed");


        }
    }
}
