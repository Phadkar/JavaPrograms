package src.oops_14thJan2024.innerclass;


import src.oops_13Jan2024.Assignment.Inheritance.Single.Child;

public class Lab158 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        child c = new child();
       parent = c;
       //c=parent;

        Parent hello = new child();
        Parent hello2 = new Parent();
        //child hai = hello;
        child hai = (child) hello;
        child hai1 = (child) hello2;


    }

}

class Parent{}
class child extends Parent{}
