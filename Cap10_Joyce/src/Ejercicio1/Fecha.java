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
public class Fecha {
    private Integer dia;
    private Integer mes;
    private Integer anio;

    public Fecha() {
        inicializar();
    }

    public Fecha(Integer d, Integer m, Integer a) {
        setDia(d);
        setMes(m);
        setAnio(a);
    }

    public void inicializar() {
        setDia((Integer) 1);
        setMes((Integer) 1);
        setAnio((Integer) 2000);
    }

    private Boolean validaFecha(Integer d, Integer m, Integer a) {
        if ((d > diasMes()) || (d < 1) || (m > 12) || (m < 1) || (a.toString().length() != 4)) {
            return true;
        } else {
            return false;
        }
    }

    public void setFecha(Integer d, Integer m, Integer a) {
        if (validaFecha(d, m, a)) {
            System.out.println("Fecha invalida");
        } else {
            setDia(d);
            setMes(m);
            setAnio(a);
        }
    }

    public void imprimir() {
        System.out.println(String.format("%d/%d/%d", getDia(), getMes(), getAnio()));
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", getDia(), getMes(), getAnio());
    }

    public void aumentar() {
        setDia((Integer) (getDia() + 1));
        if (getDia() > diasMes()) {
            setDia((Integer) 1);
            setMes((Integer) (getMes() + 1));
            if (getMes() > 12) {
                setMes((Integer) 1);
                setAnio((Integer) (getAnio() + 1));
            }
        }
    }

    private Integer diasMes() {
        switch (getMes()) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return getAnio() % 4 == 0 ? 29 : 28;
            /*if( anio % 4 == 0){
                    return 29;
                }else{
                    return 28;
                }*/
            default:
                return -1;

        }
    }

    public void mayorFecha(Fecha uno) {
        if (this.getAnio() == uno.getAnio()) {
            if (this.getMes() == uno.getMes()) {
                if (this.getDia() > uno.getDia()) {
                    System.out.println("Esta fecha es menor");
                } else if (this.getDia() < uno.getDia()) {
                    System.out.println("Esta fecha es mayor");
                } else {
                    System.out.println("Nacieron el mismo dia");
                }
            } else if (this.getMes() > uno.getMes()) {
                System.out.println("Esta fecha es menor");
            } else {
                System.out.println("Esta fecha es mayor");
            }
        } else if (uno.getAnio() > this.getAnio()) {
            System.out.println("Esta fecha es mayor");
        } else {
            System.out.println("Esta fecha es menor");
        }
    }

    /**
     * @return the dia
     */
    public Integer getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(Integer dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public Integer getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(Integer mes) {
        this.mes = mes;
    }

    /**
     * @return the anio
     */
    public Integer getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public int comparar(Fecha f1) {
        int diferencia = this.anio - f1.anio;
        if (diferencia == 0) {
            diferencia = this.mes - f1.mes;
            if (diferencia == 0) {
                diferencia = this.dia - f1.dia;
            }
        }
        return diferencia;
    }
}
