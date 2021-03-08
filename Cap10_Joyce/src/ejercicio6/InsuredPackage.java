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
public class InsuredPackage extends Package{
    
    public InsuredPackage(double w, Envio s){
        super(2,s);
        precioNuevo();
    }
    
    public void precioNuevo(){
        if ((super.getPrice() >= 0)&&(super.getPrice() <= 1)) {
            super.setPrice(super.getPrice()+2.45);
        }else if ((super.getPrice() >= 1.01)&&(super.getPrice()<= 3)) {
            super.setPrice(super.getPrice()+3.95);
        }else if ((super.getPrice() >= 3.01)) {
            super.setPrice(super.getPrice()+3.95);
        }
    }
}