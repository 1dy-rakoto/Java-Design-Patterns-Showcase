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
public class Cercle extends Figure {

    public Cercle(Point p1, Point p2) {
        super(p1, p2);
    }

    @Override
    public double surface() {
        double r=p1.distance(p2);
        return Math.PI*r*r;
    }
    @Override
    public String toString(){return "Cercle [ "+super.toString()+"]";};
}
