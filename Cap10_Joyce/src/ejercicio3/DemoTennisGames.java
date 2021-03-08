/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author felipe
 */
public class DemoTennisGames {
    
    public static void main(String[] args) {
        TennisGame juego1= new TennisGame();
        DoublesTennisGame juego2= new DoublesTennisGame();
        
        juego1.setPlayer1("Angel");
        juego1.setPlayer2("Jose");
        juego1.setPuntacion1(3);
        juego1.setPuntacion2(4);
        
        juego2.setPlayer1("Angel","Rodrigo");
        juego2.setPlayer2("Jose","Eduardo");
        juego2.setPuntacion1(0);
        juego2.setPuntacion2(2);
        
        System.out.println(juego1.toString());
        System.out.println(juego2.toString());
    }
}
