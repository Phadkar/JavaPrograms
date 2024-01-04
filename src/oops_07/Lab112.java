package src.oops_07;

public class Lab112 {
    public static void main(String[] args) {
       int c = sum(3,4);
       int c1 = sum1();
       int c2 = sum2(67);

        System.out.println(c); // 2 arguments
        System.out.println(c1); // No arguments
        System.out.println(c2);  // 1 argument
        sayHello();   // Call to the function
    }

    static int sum(int input_1,int input_2){  // Definition of the Function
        return input_1+input_2;
    }


    static int sum1(){
        return 34;
    }

    static int sum2(int input1){
        return input1;
    }

    static void sayHello(){
        System.out.println("Say Yes");
    }
}
