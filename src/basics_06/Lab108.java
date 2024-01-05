package src.basics_06;

public class Lab108 {
    public static void main(String[] args) {
        //Leap year

        int year = 1900;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
