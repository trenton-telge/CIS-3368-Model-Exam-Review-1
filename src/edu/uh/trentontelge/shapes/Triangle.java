package edu.uh.trentontelge.shapes;

public class Triangle extends Shape2D {
    double h, b;
    public Triangle(double base, double height){
        this.b = base;
        this.h = height;
    }
    @Override
    public double calculateArea(){
        return b*h/2;

    }
}
