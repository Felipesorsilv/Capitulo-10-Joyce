/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author felipe
 */
public class DemoHorses {
    
     public static void main(String[] args) {
        RaceHorse caballo= new RaceHorse();
        caballo.setColor("Azul");
        caballo.setNacimiento(20, 3, 2001);
        caballo.setNombre("Potranca");
        caballo.setCarreras(20);
        
        System.out.println(caballo.getNombre()+caballo.getColor()+caballo.getNacimiento()+caballo.getCarreras());
    }
}
