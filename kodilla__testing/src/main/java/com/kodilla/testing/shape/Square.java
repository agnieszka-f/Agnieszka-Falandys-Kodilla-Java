package com.kodilla.testing.shape;

public class Square implements Shape{
    Double a;
    public String getName(){ return "Square"; }
    public Double getField() { return a*a;}
    public void setSide(Double a) { this.a = a; }
}
