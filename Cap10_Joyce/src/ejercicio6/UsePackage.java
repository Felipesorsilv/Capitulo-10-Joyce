/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author felipe
 */
public class UsePackage {
    
     public static void main(String[] args) {
        Package pack1 = new Package(10, Envio.AIR);
        InsuredPackage pack2 = new InsuredPackage(20, Envio.TRUCK);
        Package pack3 = new Package(40, Envio.MAIL);
        
        System.out.println(pack1.display());
        System.out.println(pack2.display());
        System.out.println(pack3.display());
    }
}
