/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author felipe
 */
public class DemoCabinRental {
    
     public static void main(String[] args) {
        
        CabinRental cabana= new CabinRental(2);
        HolidayCabinRental cabana2= new HolidayCabinRental(4);
        
        System.out.println("Cabaña No. "+cabana.getCabana()+"\n Precio: "+cabana.getTarifa());
        System.out.println("Cabaña No. "+cabana2.getCabana()+"\n Precio: "+cabana2.getTarifa());
       
    }
}
