/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamezone1;

/**
 *
 * @author felipe
 */
public class Alien {
    
      protected Integer numberEyes;
    protected Integer nLives;
    protected Integer nPower;
    
    public Alien(Integer numberEyes, Integer nLives, Integer nPower){
        this.numberEyes = numberEyes;
        this.nLives = nLives;
        this.nPower = nPower;
    }
    
    public String toString(){
        return ("El número de ojos: "+this.numberEyes+"\nEl número de vidas: "+this.nLives+"\nEl nivel de poder que tiene es:"+this.nPower);
    }
}
