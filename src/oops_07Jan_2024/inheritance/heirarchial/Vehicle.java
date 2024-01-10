package src.oops_07Jan_2024.inheritance.heirarchial;

public class Vehicle {
    Vehicle(){
        System.out.println("DC Vehicle");
    }

    void vehicleHasTopSpeed(){
        System.out.println("Yeah from "+getClass().getSimpleName());
    }
}
