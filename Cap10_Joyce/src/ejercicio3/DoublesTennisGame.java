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
public class DoublesTennisGame extends TennisGame{
    
     private String player11;
    private String player22;

    public void setPlayer2(String player2, String player22) {
        super.setPlayer2(player2); //To change body of generated methods, choose Tools | Templates.
        this.player22=player22;
    }

    public void setPlayer1(String player1, String player11) {
        super.setPlayer1(player1); //To change body of generated methods, choose Tools | Templates.
        this.player11=player11; 
    }
    
    @Override
    public String toString(){
        return "Equipo 1: "+super.getPlayer1()+" "+ player11+"\nEquipo 2: "+super.getPlayer2()+" "+player22+"\nScore: "+super.getPuntfinal1()+"-"+super.getPuntfinal2();
    }
}
