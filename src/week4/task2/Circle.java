package Task2;

public class Circle extends Shape {
    double radius = 1.0;
    final double PI = 3.14;
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*PI;
    }

    public double getPerimeter(){
        return 2*this.radius*PI;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
