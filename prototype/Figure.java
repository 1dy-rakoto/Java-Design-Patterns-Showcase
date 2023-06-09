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
abstract public class Figure {
   protected Point p1;
   protected Point p2;
   
   public Figure(Point p1,Point p2){
       this.p1=p1;
       this.p2=p2;
   }
   @Override
   public Figure clone() throws CloneNotSupportedException{
       Figure f=(Figure)super.clone();
       return f;
   }
   abstract public double surface();
   @Override
    public String toString(){return "Figure [p1= "+p1+" p2="+p2+"]";};
}
