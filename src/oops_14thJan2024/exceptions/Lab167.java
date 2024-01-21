package src.oops_14thJan2024.exceptions;

public class Lab167 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int x = 10 / a;
        }catch(Exception e){
            System.out.println("Exit");
            System.exit(0); //Asking JVM to stop due to which finally block will not execute
        }
        finally {
            System.out.println("I am final");
        }
    }
}
