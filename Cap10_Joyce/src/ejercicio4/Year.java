/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author felipe
 */
public class Year {
 
    private Integer days;

    public Year() {
        this.days = 365;
    }

    public Year(Integer days) {
        this.days = days;
    }

    public Integer getDays() {
        return days;
    }

    public void daysElapsed(Integer dia, Integer mes) {
        if (!validaFecha(dia, mes)) {
            Integer dias = 0;
            for (int i = 1; i <= mes; i++) {
                if (i == mes) {
                    dias+=dia;
                } else {
                    dias += diasMes(i);
                }
            }
            System.out.println("Han transcurrido: "+dias);
        } else {
            System.out.println("ERROR\nFecha incorrecta");
        }
    }

    private Integer diasMes(Integer mes) {
        switch (mes) {
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
                return 28;
            default:
                return -1;

        }
    }

    private Boolean validaFecha(Integer d, Integer m) {
        if ((d > diasMes(m)) || (d < 1) || (m > 12) || (m < 1)) {
            return true;
        } else {
            return false;
        }
    }
}
