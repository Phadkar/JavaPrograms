package src.oops_14thJan2024.interview;

public class Abstract01 {
}

abstract class Person01{
    abstract void say();
    void eat(){
        System.out.println("I am eating");
    }
}

abstract class flower extends Person01{
abstract void m2();
}

class ricky extends flower{

    @Override
    void say() {

    }

    @Override
    void m2() {

    }
}
