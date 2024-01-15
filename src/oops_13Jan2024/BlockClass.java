package src.oops_13Jan2024;

import org.w3c.dom.ls.LSOutput;

public class BlockClass {
    {
        //Instance initialization block
        System.out.println("IIB");
    }
    BlockClass(){
        System.out.println("I am DC");
    }

    static {
        //SIB
        System.out.println("I am SIB");
    }

}
