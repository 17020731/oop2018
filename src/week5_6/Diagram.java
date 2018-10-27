package week5_6;

import java.util.ArrayList;

public class Diagram {
    public void deleteCircle(Layer layer){
        for(int i = 0 ; i < layer.shapeList.size(); i++) {
            if(layer.shapeList.get(i) instanceof Circle){
                layer.shapeList.remove(i);
            }
    }


    }
    public static void toString(Layer layer){
        for(int i  =0 ; i < layer.shapeList.size(); i++) {
            System.out.println(layer.shapeList.get(i).toString());
        }

    }

    public static void main(String [] args){
        Diagram diagram = new Diagram();
        Layer layer = new Layer();
        diagram = layer;
        Circle circle = new Circle(1.0);
        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3,4,5);
        layer.shapeList.add(circle);
        layer.shapeList.add(triangle);
        layer.shapeList.add(rectangle);
        layer.shapeList.add(square);

        System.out.println("BAN DAU!!!");
        toString(layer);
        System.out.println("After delete Triangle!!!");
        layer.deleteAllTriangle();
        toString(layer);
        System.out.println("After delete Circle!!!");
        diagram.deleteCircle(layer);
        toString(layer);

    }
}
