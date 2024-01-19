package src.oops_14thJan2024;

public class Lab150 {
    public static void main(String[] args) {
        System.out.println(StaticDemo.college_name);
        StaticDemo.printMe();

        StaticDemo s1 = new StaticDemo();
        s1.version = 15;
        s1.printVersion();

        StaticDemo s2 = new StaticDemo();
        s2.version = 245;
        s2.printVersion();
    }
}
