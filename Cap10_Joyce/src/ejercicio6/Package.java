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
public class Package {
    private double weight;
    private Envio shipmentMethod;
    private double price;
    
    public Package(double w, Envio s){
        this.weight = w;
        this.shipmentMethod = s;    
        calculatePrice();
    }

    public void setPrice(double price) {
        this.price = price;
    }        

    public void calculatePrice(){
        if ((this.weight>=1)&&(this.weight<=8)) {
            if (this.shipmentMethod==Envio.AIR) {
                this.price = 2;
            }else if (this.shipmentMethod==Envio.TRUCK) {
                this.price = 1.5;
            }else if (this.shipmentMethod==Envio.MAIL) {
                this.price = 0.5;
            }
        }else if ((this.weight>=9)&&(this.weight<=16)) {
            if (this.shipmentMethod==Envio.AIR) {
                this.price = 3;
            }else if (this.shipmentMethod==Envio.TRUCK) {
                this.price = 2.53;
            }else if (this.shipmentMethod==Envio.MAIL) {
                this.price = 1.5;
            }
        }else if ((this.weight>=17)) {
            if (this.shipmentMethod==Envio.AIR) {
                this.price = 4.5;
            }else if (this.shipmentMethod==Envio.TRUCK) {
                this.price = 3.25;
            }else if (this.shipmentMethod==Envio.MAIL) {
                this.price = 2.15;
            }
        }
    }
    
    public double getPrice() {
        return price;
    }
        
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Envio getShipmentMethod() {
        return shipmentMethod;
    }

    public void setShipmentMethod(Envio shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }
    
    public String display() {
        return "Package{" + "weight=" + weight + ", shipmentMethod=" + shipmentMethod + ", price=" + price + '}';
    }    
    
}