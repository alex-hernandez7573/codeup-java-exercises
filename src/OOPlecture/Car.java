package OOPlecture;

import java.util.Scanner;

public class Car {
    public static Scanner scanner = new Scanner (System.in);
    public String model;
    public int year;
    public String color;
    public void run () {
        System.out.println("the Car is runnin!");
    }

    public static void main(String[] args) {
        Car car1 = new Car ();
        System.out.println(car1);

        car1.color = "Black";
        car1.year  = 2020;
        car1.model = "Toyota Camry";

        System.out.println(car1.color);

        Car car2= new Car();

        car2.color = "blue";
        car2.year = 2020;
        car2.model = "Kia Forte";
        car2.run();

        System.out.println(car2);


    }
}
