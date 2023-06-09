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
public class Main {
    public static void main (String[] args){
        Figure f1= new Cercle(new Point(10,10),new Point(20,20));
        Figure f2= new Rectangle(new Point(30,30),new Point(40,40));
        
        System.out.println("Surface de f1"+f1+" est:"+f1.surface());
        System.out.println("Surface de f2"+f2+" est:"+f2.surface());
    }
    
}
