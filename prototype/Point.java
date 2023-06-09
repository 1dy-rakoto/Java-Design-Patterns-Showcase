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
public class Point {
    protected int x;
    protected int y;
    
    public Point (int x, int y){
        this.x=x;
        this.y=y;
    }
    public double distance(Point p){
        int a=p.x-this.x;
        int b=p.y-this.y;
        return Math.sqrt(a*a+b*b) ;
    }
    @Override
    public String toString(){return "Point [x= "+x+" y="+y+"]";};
}
    

