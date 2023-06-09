/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author rakoto
 */
public class Rectangle extends Figure{

    public Rectangle(Point p1, Point p2) {
        super(p1, p2);
    }

    @Override
    public double surface() {
        int L=p1.x-p2.y;
        int H=p1.x-p2.y;
        
        return L*H;
    }
    @Override
    public String toString(){return "Rectangle [ "+super.toString()+"]";}
    
}
