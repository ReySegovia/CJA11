/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CJA11;

/**
 *
 * @author reysegovia
 */
public class Circle {
    public static final double PI = 3.141592;
    protected double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return PI * getDiameter();
    }
}
