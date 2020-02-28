package edu.uh.trentontelge.shapes;

public class Circle extends Shape2D {
    double r;
    public Circle(double radius){
        this.r = radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI*Math.pow(r, 2);
    }
}
