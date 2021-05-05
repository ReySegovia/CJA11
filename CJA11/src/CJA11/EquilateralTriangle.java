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
public class EquilateralTriangle implements Shape {
    private double sideLengthTriangle;   // cm
    private double heightLengthTriangle; // cm
    public EquilateralTriangle(double sideLengthTriangle) {
        this.sideLengthTriangle = sideLengthTriangle;
        this.heightLengthTriangle = calculateHeightLengthTriangle();
    }

    public void setSideLengthTriangle(double sideLengthTriangle) {
        this.sideLengthTriangle = sideLengthTriangle;
        this.heightLengthTriangle = calculateHeightLengthTriangle();
    }

    public double getSideLengthTriangle() {
        return sideLengthTriangle;
    }

    public double getHeightLengthTriangle() {
        return heightLengthTriangle;
    }

    public double getArea() {
        return (sideLengthTriangle * heightLengthTriangle) / 2.0;
    }

    public double getPerimeter() {
        return sideLengthTriangle * 3.0;
    }

    private double calculateHeightLengthTriangle() {
        return (Math.sqrt(3.0) * this.sideLengthTriangle) / 2.0;
    }
}
