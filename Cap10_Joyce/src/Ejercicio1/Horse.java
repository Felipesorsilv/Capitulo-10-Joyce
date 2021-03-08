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
public class Horse {
    private String nombre;
    private String color;
    private Fecha nacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Integer d, Integer m, Integer a) {
        this.nacimiento = new Fecha(d,m,a);
    }
     
}
