/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Circle;
import Model.Rectangle;
import Model.Triangle;
import Repository.IRepository;
import Repository.ShapeRepository;
import View.Menu;

public class ShapeManager extends Menu<String>{
    static String[] mc = {"Shape Manager", "Exit"};    
    
    private IRepository shapeRepository; 
    
    public ShapeManager() {
        super("===================== Calculator Shape Program =====================", mc);
        shapeRepository = new ShapeRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:      
                Rectangle rectangle = shapeRepository.inputRectangle();
                Circle circle = shapeRepository.inputCircle();
                Triangle trigle = shapeRepository.inputTriangle();
                shapeRepository.display(trigle, rectangle, circle);
                break;            
            case 2:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }
}
