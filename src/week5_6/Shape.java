package week5_6;

public abstract class Shape {
    protected String Color = "red";
    protected boolean filled = true;
    protected Point point ;

    public Shape(String color, boolean filled) {
        Color = color;
        this.filled = filled;
    }

    public Shape() {

    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String toString(){
        return  "Color: " + this.Color + "Filled: " + this.filled;
    }

}
