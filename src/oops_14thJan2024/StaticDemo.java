package src.oops_14thJan2024;

public class StaticDemo {
    public static String college_name = "TheTestingAcadeemy";

    public int  version= 3;
    public static void printMe(){
        int a =10;
        System.out.println("College Name: "+college_name);
        //You cannot call instance variable into a static method
        // System.out.println("Version is: " +version);
        System.out.println(a);
    }

    //Non Static method
    public void printVersion(){
        System.out.println("Version is: " +version);
        System.out.println("College Name: "+college_name);
    }

}
