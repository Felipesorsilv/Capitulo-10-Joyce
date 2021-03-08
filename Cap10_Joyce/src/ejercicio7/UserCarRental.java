/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author Alexandra
 */
public class UserCarRental {
     public static void main(String[] args) {
        CarRental car1 = new CarRental("Pedro", 20321, Tamaño.ECONOMY, 10);
        LuxuryCarRental car2 = new LuxuryCarRental("Pedro", 20321, Tamaño.ECONOMY, 10);
        
        System.out.println(car1.display());
        System.out.println(car2.display());
    }
}
