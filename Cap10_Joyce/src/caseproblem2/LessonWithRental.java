/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem2;

/**
 *
 * @author felipe
 */
public class LessonWithRental extends Rental{
    private final static String INSTRUCTOR[]={"Mani", "Carolina", "Antonio", "Marco", 
                                        "Felix", "Luis", "Pedro", "Alfonso"};
    
    private Boolean leccion; //true=obligatorio  false=opcional
    private String instructor;

    public LessonWithRental(String contrato, Integer min, Integer tipo) {
        super(contrato, min, tipo);
        setLeccion(tipo);
    }
    
    private void setLeccion(Integer tipo){
        if((tipo==1)||(tipo==2)){
            this.leccion=true;
        }else{
            this.leccion=false;
        }
    }
    
    public String getInstructor(){
        String n="";
        for (int i = 0; i < INSTRUCTOR.length; i++) {
            n=n+"Renta: "+Rental.TIPO[i]+" "+INSTRUCTOR[i];
            if(i==0 || i==1){
                n=n+" requiere una leccion\n";
            }else{
                n=n+" no requiere una leccion\n";
            }
        }
        return n;
    }{
    
}
