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
public class LessonWithRentalDemo {
     public static void main(String[] args) {
        Rental.logo();
        
        LessonWithRental n= new LessonWithRental("e436",102,1);
        n.mostrar();
        System.out.println(n.getInstructor());
    }
}
