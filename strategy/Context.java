/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author rakoto
 */
public class Context {
    
    private IStrategy strategy;
    
    public Context(){
        this.strategy=new DefaultStrategy();
    }
    
    public void process(){
        System.out.println("Etape 1 de l'algorithme");
        strategy.applyStrategy();
        System.out.println("Etape finale de l'algorithme");
    }
    
    public void setStrategy(IStrategy strategy){
        this.strategy=strategy;
    }
}
