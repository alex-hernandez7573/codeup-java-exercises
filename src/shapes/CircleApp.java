package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("what is the radius of said circle?");
        Input circleInput = new Input();
        Circle circle = new Circle(circleInput.getDouble());
        System.out.println("THE AREA OF CIRCLE :: "+circle.getArea());
        System.out.println("THE CIRCUMFERENCE :: "+circle.getCircumference());
    }
}
