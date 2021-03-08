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
public class CabinRental {
    
    private Integer cabana;
    private Double tarifa;

    public CabinRental(Integer cabana) {
        this.cabana = cabana;
        if(cabana==1 || cabana==2 || cabana==3){
            this.tarifa=950.00;
        }else{
            this.tarifa=150.00;
        }
    }
    
    public CabinRental(Integer cabana, Double recargo) {
        this.cabana = cabana;
        if(cabana==1 || cabana==2 || cabana==3){
            this.tarifa=950.00+recargo;
        }else{
            this.tarifa=1100.00+recargo;
        }
    }

    public Integer getCabana() {
        return cabana;
    }

    public Double getTarifa() {
        return tarifa;
    }
}
