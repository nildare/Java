package Inheritance;

class Vehicle {

    private String brand;
    private int year;

    public Vehicle(String brand,int year){
        this.brand=brand;
        this.year=year;
        }

    public void displayDetails(){
            System.out.println("The brand is " + brand + " The year is " + year );
        }
    public void startEngine(){
            System.out.println("Engine Started.");
        }
    }

    class Car extends Vehicle{
    private int numDoors;

    public Car(String brand, int year, int numDoors){
        super(brand, year);
        this.numDoors=numDoors;
    }

    @Override
        public void startEngine(){
        System.out.println("Car Engine Started!");
    }
        public void honk(){
            System.out.println("Beep Beep!");
        }

    }

    class Bike extends Vehicle{
    private boolean kickStart;

    public Bike(String brand,int year,boolean kickStart){
        super(brand, year);
        this.kickStart=kickStart;
    }

    @Override
        public void startEngine(){
        System.out.println("Bike Engine Started");
    }

    public void ringBell(){
        System.out.println("Ring Ring!");
    }
    }

public class Main{
    public static void main(String[] args) {
    Car car = new Car("Suzuki", 2005,6);
    car.displayDetails();
    car.startEngine();
    car.honk();

    Bike bike = new Bike("Honda",2022,true);
    bike.displayDetails();
    bike.startEngine();
    bike.ringBell();
    }
}