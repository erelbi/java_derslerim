/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalitim92;

/**
 *
 * @author xc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employess employe = new Employess("Ergün Elvan","Bilişim",5000);
        employe.showInfo();
        Manager manager =new Manager ("sjkdhsjh","ndksjhdj", 997);
        manager.showInfo();
    }
    
}
