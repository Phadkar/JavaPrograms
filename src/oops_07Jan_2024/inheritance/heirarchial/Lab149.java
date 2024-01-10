package src.oops_07Jan_2024.inheritance.heirarchial;

public class Lab149 {
    public static void main(String[] args) {
        Car c = new Car();
        Truck t = new Truck();
        Vehicle v = new Vehicle();

        Vehicle v1 = new Car();
        //Car c2 = new Vehicle();
        //Truck t1 = new Vehicle();
        // Car c3 = new Truck();
    }
}
