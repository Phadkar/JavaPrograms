package src.oops_14thJan2024.exceptions;

public class Lab169 {
    public static void main(String[] args) {
        extracted02();
        System.out.println("Main execute");

    }

    public static void extracted02(){
        extracted01();
        System.out.println("I will be printed");

    }
    public static void extracted01(){
        extracted();
        System.out.println("Extracted01 execute");
    }

    public static void extracted(){
        try {
            String name = null;
            name.length();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
