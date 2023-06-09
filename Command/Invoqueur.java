/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author rakoto
 */
public class Invoqueur {
    private Map<String,Command> commandes=new HashMap<>();
    
    public void addNewCommand(String ref, Command cmd){
        commandes.put(ref,cmd);
    }
    
    public void invoquer(String ref){
        Command cmd=commandes.get(ref);
        
        if(cmd!=null) cmd.executer();
    }
}
