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
public class TennisGame {
    
    
    private String player1;
    private String player2;
    private Integer puntuacion1;
    private Integer puntuacion2;
    private String puntfinal1;
    private String puntfinal2;
    

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public void setPuntacion1(Integer puntacion1) {
        if (puntacion1 < 0 || puntacion1 > 4){//|| (puntacion1==4 && puntuacion2==4)) {
            this.puntuacion1 = 0;
            this.puntfinal1 = "ERROR";
        } else {
            this.puntuacion1 = puntacion1;
            setPuntfinal1();
        }
    }

    public void setPuntacion2(Integer puntacion2) {
        if (puntacion2 < 0 || puntacion2 > 4){// || (puntuacion1==4 && puntacion2==4)) {
            this.puntuacion2 = 0;
            this.puntfinal2 = "ERROR";
        } else {
            this.puntuacion2 = puntacion2;
            setPuntfinal2();
        }
    }
    
    private void setPuntfinal1(){
        switch(puntuacion1){
            case 0:
                this.puntfinal1 ="love";
                break;
            case 1:
                this.puntfinal1 ="15";
                break;
            case 2:
                this.puntfinal1 ="30";
                break;
            case 3:
                this.puntfinal1 ="40";
                break;
            case 4:
                this.puntfinal1 ="game";
                break;
            default:
                break;
        }
    }
    
    private void setPuntfinal2(){
        switch(puntuacion2){
            case 0:
                this.puntfinal2 ="love";
                break;
            case 1:
                this.puntfinal2 ="15";
                break;
            case 2:
                this.puntfinal2 ="30";
                break;
            case 3:
                this.puntfinal2 ="40";
                break;
            case 4:
                this.puntfinal2 ="game";
                break;
            default:
                break;
        }
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public Integer getPuntuacion1() {
        return puntuacion1;
    }

    public Integer getPuntuacion2() {
        return puntuacion2;
    }

    public String getPuntfinal1() {
        return puntfinal1;
    }

    public String getPuntfinal2() {
        return puntfinal2;
    }
    
    @Override
    public String toString(){
        return "Player 1: "+getPlayer1()+"\nPlayer 2: "+getPlayer2()+"\nScore: "+getPuntfinal1()+"-"+getPuntfinal2();
    }
}
