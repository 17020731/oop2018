package Task2;

public class Rectrangle extends Shape {
    double width = 1.0, length = 1.0;

    public Rectrangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectrangle() {
    }

    public Rectrangle(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){

    }

    public double getPerimeter(){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
