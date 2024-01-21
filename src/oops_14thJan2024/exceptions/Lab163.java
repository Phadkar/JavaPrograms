package src.oops_14thJan2024.exceptions;

public class Lab163 {
    public static void main(String[] args) {
        String sh = args[0]; //1. --> ArrayIndexOutOfBoundsException
        int x = Integer.parseInt(sh); //NumberFormatException (if we try to convert"Pramod" to int)
        int a = x/10; //Arithmetic exception (if x we try to divide by 0)
        System.out.println(x);
        System.out.println(a);
    }
}


//JVM will be initialised
//Creates and Starts the main thread

//main thread will do the following tasks
//1. collects the command line arguments
//2. Create String array with cla
//3. Calls the main method by passing String array as Parameter
//Lab163.main(str[] args);
//Now main control will be transferred from main thread to main method

//Control will be back to main thread in two ways
//A) when problem comes in main it will be given to JVM (if you dont handle)
//And the task of JVM is to just create the object of identified exception class
//If it is arithmetic then it will give arithmetic exception,
// if it is null pointer it will give null pointer
