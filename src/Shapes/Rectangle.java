package Shapes;

public class Rectangle {
    protected double length;
    protected double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle () {

    }

    public double getArea () {
        return length * width;
    }

    public double getPerimeter () {
        return this.length+this.length+this.width+this.width;
    }


}
