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
public class CollegeCourse {
       private String dep;
    private int num;
    private int credits;
    private double fee;
    
    public CollegeCourse(String d, int n, int c){
        this.dep = d;
        this.num = n;
        this.credits = c;
        calcularFee();
    }
    
    public String display() {
        return "CollegeCourse{" + "dep=" + dep + ", num=" + num + ", credits=" + credits + ", fee=" + fee + '}';
    }
    
    public void calcularFee(){
        this.fee = this.credits*120;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
}
