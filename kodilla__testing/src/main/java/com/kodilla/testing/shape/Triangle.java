package com.kodilla.testing.shape;

public class Triangle implements Shape{
    Double a;
    Double h;
    public String getName(){ return "Triangle"; }
    public Double getField(){ return 0.5*a*h;}
    public void setSide(Double a) {this.a = a; }
    public void setHeight(){ this.h = h; }
}
