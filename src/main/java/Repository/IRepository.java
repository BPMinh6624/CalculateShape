/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Circle;
import Model.Rectangle;
import Model.Triangle;

public interface IRepository {
    
    void display(Triangle trigle, Rectangle rectangle, Circle circle);   
    
    Triangle inputTriangle();
    
    Rectangle inputRectangle();
    
    Circle inputCircle();
}
