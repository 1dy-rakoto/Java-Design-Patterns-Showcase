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
public class StrategyImpl1 implements IStrategy {

    @Override
    public void applyStrategy() {
        System.out.println("Etape intermédiaire de l' algo avec la strategie 1");
    }
    
}
