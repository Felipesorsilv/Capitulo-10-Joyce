/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author felipe
 */
public class DemoCandles {
    
    public static void main(String[] args) {
        
        Candle vela= new Candle();
        ScentedCandle vela2= new ScentedCandle();
        
        vela.setColor("Rojo");
        vela.setAltura(5);
        
        vela2.setColor("Verde");
        vela2.setAltura(5);
        
        System.out.println("Vela 1 :"+vela.getColor()+vela.getAltura()+vela.getPrecio());
        System.out.println("Vela 2 :"+vela2.getColor()+vela2.getAltura()+vela2.getPrecio());
    }
}
