package src.oops_07;

public class Lab113 {
    public static void main(String[] args) {
        // What a Function
        // Function can do some Task.

        // How to create a Function?
        // 1. Definition
        // 2. Call the function

        //    accessModifier returnType methodName(parameterList) {
       // method body
       //    }

        sayHello4times();
        sayHello4times();

        double d = Math.pow(2,3);
        System.out.println(d);
    }

     static void sayHello4times(){
         for (int i = 0; i < 4; i++) {
             System.out.println("Hello");
         }
    }
}
