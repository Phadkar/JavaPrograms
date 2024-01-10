package src.oops_07Jan_2024.inheritance.multilevel;

public class Java extends Programming{
    String newFeature;

    Java(){
        System.out.println("Java DC");
    }

    Java(String feature){
        this.newFeature = feature;
    }

    @Override
    void printInfo() {
        System.out.println("Feature is -->" +this.newFeature);
    }
}
