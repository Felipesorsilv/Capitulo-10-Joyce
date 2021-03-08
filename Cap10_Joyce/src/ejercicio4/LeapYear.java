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
public class LeapYear  extends Year{
    
    public LeapYear(){
        super(366);
    }
    
    @Override
    public void daysElapsed(Integer dia,Integer mes){
        if(!validaFecha(dia,mes)){
            Integer dias=0;
            for (int i = 1; i <=mes; i++) {
                if (i == mes) {
                    dias+=dia;
                } else {
                    dias += diasMes(i);
                }
            }
            System.out.println("Han transcurrido: "+dias);
        }else{
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
                return 29;
            default:
                return -1;

        }
    }
    
    private Boolean validaFecha(Integer d, Integer m) {
        return (d > diasMes(m)) || (d < 1) || (m > 12) || (m < 1);
  }
}

