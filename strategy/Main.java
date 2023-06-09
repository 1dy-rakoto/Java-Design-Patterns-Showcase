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
public class Main {
    public static void main(String[] args){
       Context context= new Context();
       context.process();
       context.setStrategy(new StrategyImpl1());
       context.process();
       context.setStrategy(new StrategyImpl2());
       context.process();
       context.setStrategy(new StrategyImpl3());
       context.process();
       context.setStrategy(new StrategyImpl1());
       
      
    }
}
