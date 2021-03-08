/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamezone2;

/**
 *
 * @author felipe
 */
public class LoadedDie extends Die {

    public LoadedDie() {
        super();
    }
    
    @Override
    public void lanzar(){
        int num;
        do {
             num = ((int)(Math.random() * 100) % 6 + 1);
        } while (num==1);
        
        this.numero = num;
        
        
    }

}