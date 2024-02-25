package src.JavaPrograms;

public class sumOfAllDigits {

    static void sumofDigits(int inputNumber){
        int copyofInputNumber = inputNumber;
        int sum = 0;
        while(copyofInputNumber !=0){
            int lastDigit = copyofInputNumber%10;
            sum = sum+lastDigit;
            copyofInputNumber= copyofInputNumber/10;
        }
        System.out.println("Sum of all Digits in " +inputNumber +"is: " +sum);
    }

    public static void main(String[] args) {
        sumofDigits(34325);
        sumofDigits(34353246);
        sumofDigits(4353453);
        sumofDigits(45462312);
        sumofDigits(978979);
    }
}
