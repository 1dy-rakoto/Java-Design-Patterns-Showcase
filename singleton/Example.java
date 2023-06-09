/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author rakoto
 */
public class Example {
    private static final Example singleton;
    private int compte;
    static{
        singleton=new Example();
    }
    private Example(){
        this.compte=5;
    }
    public static Example getInstanciation(){
        return singleton;
    }
    public  int getCompte(){
        return compte;
    }
    public  void setCompte(int compte){
        this.compte=compte;
    }
}
