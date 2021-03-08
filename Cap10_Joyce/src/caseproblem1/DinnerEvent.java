/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem1;

/**
 *
 * @author felipe
 */
public class DinnerEvent {
    
    public class DinnerEvent extends Event implements Comparable <Event>{
    private final String[] ENTREE = {"SOPA", "ENSALADA", "CAMARONES"};
    private final String[] SIDE_DISH = {"PASTA", "PURE", "VERDURAS"};
    private final String[] DESSERT = {"HELADO", "PASTEL", "CAFE"};
    private Integer entree;
    private Integer sideDish1;
    private Integer sideDish2;
    private Integer dessert;
    private Integer comparaciones;            
    
    public DinnerEvent(String eventNumber, Integer numberGuests, Integer en, Integer si1, Integer si2, Integer de){
        super(eventNumber, numberGuests);
        this.entree = en;
        this.sideDish1 = si1;
        this.sideDish2 = si2;
        this.dessert = de;
    }
    
    public String getMenu(){
        return ("Entree: "+this.ENTREE[this.entree]+"\nSide Dish 1: "+this.SIDE_DISH[this.sideDish1]+"\n Side Dish 2: "+ this.SIDE_DISH[this.sideDish2]+"\nDessert: "+this.DESSERT[this.dessert]);
    }
    

    public void comparaciones(int n, DinnerEvent o){
        switch (n) {
            case 1:
                this.comparaciones = this.getEventNumber().compareTo(o.getEventNumber());
                break;
            case 2:
                this.comparaciones = this.getNGuests().compareTo(o.getNGuests());
                break;
            case 3:
                this.comparaciones = this.getEventTypes().compareTo(o.getEventTypes());
                break;
        }
    }
    
    
    
    @Override
    public int compareTo(Event o) {
        return this.comparaciones;
    }
}
