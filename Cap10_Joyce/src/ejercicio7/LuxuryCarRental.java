/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author Alexandra
 */
public class LuxuryCarRental extends CarRental{
    private char chofer;
    Scanner leer = new Scanner(System.in);
    

    public LuxuryCarRental(String n, int z, Tamaño s, double l) {        
        super(n, z, s, l);
        setDailyFee(79.99);
        calcularPrecio();
        agregarPrecio();
    }
    
    @Override
    public void calcularPrecio(){
        this.setPriceFee(this.getDailyFee()*this.getLengthtFee());
    }
    
    public boolean chofer(){
        System.out.println("Desea chofer? (y/n)");
        char resp = leer.nextLine().charAt(0);
        if (resp == 'y') {
            this.chofer = 'y';
            return true;
        }else{
            this.chofer = 'n';
            return false;
        }
    }
    
    public void agregarPrecio(){
        if (chofer()) {
            setPriceFee(getPriceFee()+200);
        }else{
            
        }
    }
    
    @Override
    public String display() {
        return "CarRental{" + "nombreRentador=" + getNombreRentador() + ", zipCode=" + getZipCode() + ", sizeCar=" + getSizeCar() + ", lengthtFee=" + getLengthtFee() + ", dailyFee=" + getDailyFee() + ", priceFee=" + getPriceFee() + ", Chofer="+this.chofer + '}';
    } {
    
}
