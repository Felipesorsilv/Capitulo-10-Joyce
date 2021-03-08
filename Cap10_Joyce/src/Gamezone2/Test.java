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
public class Test {
    public static void main(String[] args) {
        Die dado1 = new Die();
        LoadedDie dado2 = new LoadedDie();
        
        int num_d1 = 0, num_d2 = 0;
        
        for (int i = 0; i < 1000; i++) {
            dado1.lanzar();
            dado2.lanzar();
            
            if (dado1.getNumero()>dado2.getNumero()) {
                num_d1++;
            }else if (dado1.getNumero()<dado2.getNumero()) {
                num_d2++;
            }                        
        }
        
        System.out.println("Victorias dado normal: "+num_d1+"\nVictorias dado trucado: "+num_d2);
        
        
        
    }
    
}
