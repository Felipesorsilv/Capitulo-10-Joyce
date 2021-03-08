/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamezone2;

/**
 *
 * @author felipe
 */
public class Die {
    
    protected  Integer numero;

    public Die() {
        this.lanzar();
    }

    public void lanzar(){
        this.numero = ((int)(Math.random() * 100) % 6 + 1);
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Die{" + "numero=" + numero + '}';
    }
}
