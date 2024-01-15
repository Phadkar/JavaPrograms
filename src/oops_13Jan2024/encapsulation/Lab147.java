package src.oops_13Jan2024.encapsulation;

public class Lab147 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";
        s1.name = "Pramod";

        //Getter and setter
        //They should be hidden

        PersonS p = new PersonS();
        p.id = 1;
        p.id= 99;
         p.id = -1;
        p.bankBal = 100000;

    }
}
