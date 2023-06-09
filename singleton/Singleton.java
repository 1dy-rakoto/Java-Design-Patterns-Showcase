/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rakoto
 */
public class Singleton {
    private static final Singleton singleton;
    private int compteur;
    static{
        singleton =new Singleton();
    }
    private Singleton(){
    System.out.println("Instanciation du singleton");
    };
    public static Singleton getInstance(){
        return singleton;
    }
    public void traiter(String taskName){
        System.out.println("...Traitement de la tache "+taskName);
        for (int i=1;i<=5;i++){
            ++compteur;
            System.out.println(".."+compteur);
            try { 
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Fin du traitment de la tache "+taskName+" compteur="+compteur);
    }
    
}
