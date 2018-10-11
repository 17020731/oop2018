package Task2;

public class Square extends Rectrangle {

    public Square(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    public Square(double side){
        super(side, side);
    }
    public Square() {
    }
    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

