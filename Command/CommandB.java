/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author rakoto
 */
public class CommandB implements Command {

   private RecepteurImpl1 recepteur;
    public CommandB(RecepteurImpl1 recepteur){
        this.recepteur=recepteur;
    }

    @Override
    public void executer() {
        recepteur.action2();
    }
    
}
