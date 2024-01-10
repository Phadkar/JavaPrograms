package src.oops_07Jan_2024.inheritance.multilevel;

public class Programming {
    int version;
    String author;

    Programming(){
        System.out.println("Program -- DC");
    }
    Programming(String author, int version){
        this.author = author;
        this.version= version;
    }

    void printInfo(){
        System.out.println("Print details of author: "+this.author +" Print details of version: " +this.version);
    }

    void car(){
        System.out.println("Lambo");
    }

    void bhk3(){
        System.out.println("3BHK");
    }
}
