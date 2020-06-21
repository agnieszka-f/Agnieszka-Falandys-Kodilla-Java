package com.kodilla.testing.shape;
import java.util.*;

public class ShapeCollector {
    List<Shape> list;

    public ShapeCollector(){
        list = new ArrayList<>();
    }
    public boolean addShape(Shape shape){

        return list.add(shape);
    }
    public boolean removeShape(Shape shape){

        return list.remove(shape);
    }
    public Shape getShape(int index){

        if((index + 1) <= list.size()){
            return list.get(index);
        } else {
            return null;
        }
    }
    public void showShapes(){
        for(Shape s: list){
            System.out.println(s.getName());
        }
    }
}
