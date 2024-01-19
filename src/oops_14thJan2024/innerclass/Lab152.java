package src.oops_14thJan2024.innerclass;

public class Lab152 {
    public static void main(String[] args) {
        Car c = new Car("Lambo");
        Car.Engine e = c.new Engine("400cc");
        e.start();
        c.drive();
    }
}

class Car{

    String make;


    public Car(String make) {
        this.make = make;
    }
    void drive(){
        System.out.println("You are the driver of car");
    }

    public class Engine{
        String horsePower;
        public Engine(String horsePower) {
            this.horsePower = horsePower;
        }
        void start(){
            System.out.println("Engine Started!!!!");
        }
    }
}
