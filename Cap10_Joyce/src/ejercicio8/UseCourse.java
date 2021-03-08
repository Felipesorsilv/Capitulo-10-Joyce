/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author felipe
 */
public class UseCourse {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre de materia");
        String mat = leer.nextLine();
        System.out.println("Introduzca el número de clase");        
        int num_mat = leer.nextInt();
        System.out.println("Introduzca los créditos de la materia");
        int num_cre = leer.nextInt();
        System.out.println("");
        
        if ((mat.toUpperCase().equals("BIO"))||(mat.toUpperCase().equals("CHM"))||(mat.toUpperCase().equals("CIS"))||(mat.toUpperCase().equals("PHY"))) {
            LabCourse course = new LabCourse(mat, num_mat, num_cre);
            System.out.println(course.display());
        }else{
            CollegeCourse course = new CollegeCourse(mat, num_mat, num_cre);
            System.out.println(course.display());
        }
        
    }
}
