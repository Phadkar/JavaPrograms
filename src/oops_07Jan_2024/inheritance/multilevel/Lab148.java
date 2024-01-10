package src.oops_07Jan_2024.inheritance.multilevel;

public class Lab148 {
    public static void main(String[] args) {
        GrandFather g = new GrandFather();
        Father f = new Father();
        Son s = new Son();

        GrandFather g1 = new Son();
        Father f1 = new Son();
        // Son s1  = new GrandFather();
        //Son s = new Father();
        Son s1 = new Son();

        GrandFather g2 = new Son();
        g2.bhk3();

        Son s2 = new Son();
        s2.bhk1();
        s2.bhk2();
        s2.bhk3();

    }
}
