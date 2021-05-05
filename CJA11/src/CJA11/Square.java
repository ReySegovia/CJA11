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
public class Square implements Shape {
    protected double sideLengthSquare;
    public Square(double sideLengthSquare) {
        this.sideLengthSquare = sideLengthSquare;
    }

    public void setSideLengthSquare(double sideLengthSquare) {
        this.sideLengthSquare = sideLengthSquare;
    }

    public double getSideLengthSquare() {
        return sideLengthSquare;
    }

    public double getArea() {
        return sideLengthSquare * sideLengthSquare;
    }

    public double getPerimeter() {
        return sideLengthSquare * 4;
    }
}
