package src.oops_14thJan2024.exceptions;

public class Lab162 {
    public static void main(String[] args) {
        try{
            String name = null;
            name.trim();
            System.out.println("I am Priyanka");
        }catch(Exception e){
            System.out.println("You are trying to trim null value");
        }
        System.out.println("End of the method");
    }
}


//Exception -->
// event that occurs during the execution of the program
// that disrupts the normal flow of instructions