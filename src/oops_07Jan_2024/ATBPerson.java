package src.oops_07Jan_2024;

public class ATBPerson {
    String name;
    Long mobilenumber;
    String email;
    boolean isMarried;

    //Default constructor
    ATBPerson(){
        name = "Priyanka";
        System.out.println("I am called");
    }

    ATBPerson(String name){
        this.name = name;
        System.out.println("I am called");
    }
    void talk(){
        System.out.println("Lets talk!!!");
    }

    void printDetails(){
        System.out.println(name);
        System.out.println(mobilenumber);
        System.out.println(email);
        System.out.println(isMarried);
    }
}
