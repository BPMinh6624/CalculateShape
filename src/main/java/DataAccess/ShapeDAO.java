/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import Common.Library;
import Model.Circle;
import Model.Rectangle;
import Model.Triangle;

public class ShapeDAO {
    private static ShapeDAO instance = null;
    private Library library = new Library();
    
    public static ShapeDAO Instance() {
        if (instance == null){
            synchronized (ShapeDAO.class) {
                if (instance == null){
                    instance = new ShapeDAO();
                }
            }
        }
        return instance;
    }
    
    public void display(Triangle trigle, Rectangle rectangle, Circle circle) {
        rectangle.printResult();
        circle.printResult();
        trigle.printResult();
    }
    
    public Triangle inputTriangle() {
        while (true) {
            System.out.print("Please input side A of Triangle: ");
            double a = library.checkInputDouble();
            System.out.print("Please input side B of Triangle: ");
            double b = library.checkInputDouble();
            System.out.print("Please input side C of Triangle: ");
            double c = library.checkInputDouble();
            if (a + b > c && b + c > a && a + c > b) {
                return new Triangle(a, b, c);
            } else {
                System.out.println("Re-input");
            }
        }

    }

    public Rectangle inputRectangle() {
        System.out.print("Please input side width of Rectangle: ");
        double width = library.checkInputDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = library.checkInputDouble();
        return new Rectangle(width, length);
    }

    public Circle inputCircle() {
        System.out.print("Please input radius of Circle: ");
        double radius = library.checkInputDouble();
        return new Circle(radius);
    }
}
