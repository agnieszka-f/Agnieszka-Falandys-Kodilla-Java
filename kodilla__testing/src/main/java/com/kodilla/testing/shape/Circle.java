package com.kodilla.testing.shape;
import static java.lang.Math.PI;

public class Circle implements Shape {
    Double r;
    public String getName(){ return "Circle"; }
    public void setRedius(Double r){ this.r = r; }
    public Double getField(){ return Math.PI*r*r; }
}
