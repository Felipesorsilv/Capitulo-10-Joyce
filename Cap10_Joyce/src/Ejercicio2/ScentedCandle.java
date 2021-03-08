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
public class ScentedCandle {
    
     private Integer precio;
    
    @Override
    public void setAltura(Integer altura) {
        super.setAltura(altura); 
        this.precio=altura*3;
    }
    
    @Override
    public Integer getPrecio(){
        return precio;
    }
}
