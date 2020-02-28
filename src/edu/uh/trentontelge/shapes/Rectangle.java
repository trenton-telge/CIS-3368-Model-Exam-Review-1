package edu.uh.trentontelge.shapes;

public class Rectangle extends Shape2D {
    double h, w;
    public Rectangle(double height, double width){
        this.h = height;
        this.w = width;
    }
    @Override
    public double calculateArea(){
        return h*w;
    }
}
