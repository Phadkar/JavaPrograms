package src.oops_14thJan2024;

public class Lab151 {
    public static void main(String[] args) {
        P01 p01 = new P01();
        p01.m1();
        p01.m2();

        P01 p03=null;
        //p03.m1();
        p03.m2();

    }
}

class P01{
    static{
        System.out.println("SIB");
    }
    {
        System.out.println("IIB");
    }
    int a =12;
    static int b = 23;
    void m1(){
        System.out.println("m1");
        System.out.println(a);
        System.out.println(b);
    }
    public static void m2(){
        //System.out.println(a);
        System.out.println(b);
    }
}
