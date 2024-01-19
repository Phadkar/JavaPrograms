package src.oops_14thJan2024.innerclass;

public class Lab154 {
    public static void main(String[] args) {
        creative cre = new creative();
        creative.iPad pie= cre.new iPad();
        pie.waiting();
    }

}

class creative{
    int age = 23;
    void say(){
        System.out.println("I am eating");
    }
    class iPad{
        void waiting(){
            System.out.println("I am waiting");
            System.out.println(age);
        }
    }
}
