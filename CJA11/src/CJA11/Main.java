/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CJA11;
import java.util.Scanner;

/**
 *
 * @author reysegovia
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seleccionar figura: ");
        System.out.println("1.Circulo");
        System.out.println("2.Cuadrado");
        System.out.println("3.Triangulo");
        System.out.println("0.Salir");
        
        int option = input.nextInt(); 
        while (option > 0) {
            if (option < 1 || option > 3) {
                System.err.println("Teclea una opción válida:");
                System.err.println("1.Circulo");
                System.err.println("2.Cuadrado");
                System.err.println("3.Triangulo");
                System.err.println("0.Salir");
                if (input.hasNextInt()) 
                    option = input.nextInt();
            } 
            
            else if (option == 1) {
                System.out.println("Radio del circulo: ");
                double radius = input.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area = "+circle.area());
                System.out.println("Perimetro = "+circle.perimeter());
                System.out.println("Presiona 0 para salir o selecciona una nueva figura: ");
                System.out.println("1.Circulo");
                System.out.println("2.Cuadrado");
                System.out.println("3.Triangulo");
                if (input.hasNextInt()) 
                    option = input.nextInt();
            }
            
            else if (option == 2) {
                System.out.println("Lado del cuadrado: ");
                double sideLengthSquare = input.nextDouble();
                Square square = new Square(sideLengthSquare);
                System.out.println("Area = "+square.getArea());
                System.out.println("Perimetro = "+square.getPerimeter());
                System.out.println("Presiona 0 para salir o selecciona una nueva figura: ");
                System.out.println("1.Circulo");
                System.out.println("2.Cuadrado");
                System.out.println("3.Triangulo");
                if (input.hasNextInt()) {
                    option = input.nextInt();
                }
            }
            
            else if (option == 3) {
                System.out.println("Lado del Triangulo: ");
                double sideLengthTriangle = input.nextDouble();
                EquilateralTriangle triangle = new EquilateralTriangle(sideLengthTriangle);
                System.out.println("Area = " +triangle.getArea());
                System.out.println("Perimetro = "+triangle.getPerimeter());
                System.out.println("Presiona 0 para salir o selecciona una nueva figura: ");
                System.out.println("1.Circulo");
                System.out.println("2.Cuadrado");
                System.out.println("3.Triangulo");
                if (input.hasNextInt()) {
                    option = input.nextInt();
                }
            }
        }
    }
}