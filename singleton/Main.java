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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* for(int i=1;i<=5;i++){
            Singleton s=Singleton.getInstance();
            s.traiter("T"+i);
        }*/
        Example a=Example.getInstanciation();
        Example c=Example.getInstanciation();
        Example b=Example.getInstanciation();
        a.setCompte(7);
        System.out.println(a.getCompte());
        System.out.println(b.getCompte());
        System.out.println(c.getCompte());
        
    }
    
}
