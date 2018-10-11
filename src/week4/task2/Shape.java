package Task2;

public class Shape {
    private String Color = "red";
    private boolean filled = true;

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

    public String toString(){

    }
}
