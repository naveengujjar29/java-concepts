/**
 * Create a class Car with properties make, model, and year.
 * Provide multiple constructors: one that accepts all three properties,
 * one that accepts only make and model, and one that accepts no arguments.
 *
 */

public class Car {

    private String make;

    private String model;

    private int  year;

    // Constructor Overloading
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Constructor Chaining - How to call a constructor from another constructor
    public Car(String make, String model) {
        this(make, model, 1990);
    }

    // this keyword
    public Car(String make) {
        this(make, "UNKNOWN");
    }




    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Car marutiCar = new Car("Maruti");
        System.out.println(marutiCar);


    }

    // Constructor Chaining
    // How it
    // 1 Parameter - 3 value ( 2 with default ones)
    // 2  - 3 values ( 1 with default one)
    // 3 - all the 3 values are set



}
