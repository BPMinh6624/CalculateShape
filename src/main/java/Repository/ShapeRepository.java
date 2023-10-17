/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.ShapeDAO;
import Model.Circle;
import Model.Rectangle;
import Model.Triangle;

public class ShapeRepository implements IRepository{

    public ShapeRepository() {

    }

    @Override
    public void display(Triangle trigle, Rectangle rectangle, Circle circle) {
        ShapeDAO.Instance().display(trigle, rectangle, circle);
    }   

    @Override
    public Triangle inputTriangle() {
        return ShapeDAO.Instance().inputTriangle();
    }

    @Override
    public Rectangle inputRectangle() {
        return ShapeDAO.Instance().inputRectangle();
    }

    @Override
    public Circle inputCircle() {
        return ShapeDAO.Instance().inputCircle();
    }
    
}
