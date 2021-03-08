/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author felipe
 */
public class UseYear {
     public static void main(String[] args) {
        Year anio= new Year();
        LeapYear anio2= new LeapYear();
        
        System.out.println(anio.getDays());
        anio.daysElapsed(3, 3);
        System.out.println(anio2.getDays());
        anio2.daysElapsed(3, 3);
    }
}
