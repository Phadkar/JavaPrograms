package src.oops_13Jan2024;

public class IV1 {

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.a);
        Person p1 = new Person(23);
        System.out.println(p1.a);
        Person p2 = new Person(32, true);
        System.out.println(p.b);
        p.a = 99;
        System.out.println(p.a);
    }

}

class Person{
    int a;
    boolean b;

    Person(){
        this.a = 10;
    }
    Person (int b ){
        this.a = b;
    }

    Person (int b, boolean a){
        this.a = b;
        this.b = a;
    }

}
