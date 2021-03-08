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
public class Candle {
    
    private String color;
    private Integer altura;
    private Integer precio;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
        this.precio= altura*2;
    }

    public Integer getPrecio() {
        return precio;
    }
    
    
}
