/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author felipe
 */
public class DinnerEventDemo {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        List<DinnerEvent> lista = new ArrayList<DinnerEvent>();

        int n = 0, ev_ty = 0;
        String event = "", phone = "";
        DinnerEvent evento = null;

        for (int i = 0; i < 3; i++) {

            System.out.println("Evento " + (i + 1));

            System.out.println("Introduzca el Numero de evento");
            event = leer.nextLine();
            if (event.length() != 4) {
                event = "A000";
            }
            if (((event.charAt(0) >= 65) && (event.charAt(0) <= 90)) && (event.length() == 4)) {
                if (((event.charAt(1) >= 48) && (event.charAt(1) <= 57))) {
                    if (((event.charAt(2) >= 48) && (event.charAt(2) <= 57))) {
                        if (((event.charAt(3) >= 48) && (event.charAt(3) <= 57))) {

                        } else {
                            event = "A000";
                        }
                    } else {
                        event = "A000";
                    }
                } else {
                    event = "A000";
                }
            } else {
                event = "A000";
            }
            event = event.toUpperCase();

            do {
                System.out.println("Introduzca el numero de invitados");
                n = leer.nextInt();
                leer.nextLine();
                if ((n >= 5) && (n <= 100)) {
                    break;
                }
            } while (true);

            System.out.println("Intoduzca el número telefónico");
            phone = leer.nextLine();

            System.out.println("Introduzca el tipo de evento (1,2,3,4,5)");
            ev_ty = leer.nextInt();

            leer.nextLine();
            
            System.out.println("Introduzca la entrada (0-2)");
            Integer en = leer.nextInt();
            
            System.out.println("Introduzca el side dish 1");
            Integer si1 = leer.nextInt();
            
            System.out.println("Introduzca el side dish 2");
            Integer si2 = leer.nextInt();
            
            System.out.println("Introdzuca el postre");
            Integer de = leer.nextInt();
            
            evento = new DinnerEvent(event, n, en, si1, si2, de);
            evento.setPhoneNumber(phone);
            evento.setEventType(ev_ty);
            lista.add(evento);
        }

        do {

            System.out.println("Por qué elemento desea ordenar?");
            System.out.println("Numero de evento = 1");
            System.out.println("Número de invitados = 2");
            System.out.println("Tipo de evento = 3");
            System.out.println("Salir = 4");
            int resp = leer.nextInt();

            if (resp == 4) {
                break;
            }
            
            evento.comparaciones(resp, evento);

            Collections.sort(lista);

            for (DinnerEvent event1 : lista) {
                System.out.println(event1.toString());
                event1.getMenu();
            }

        } while (true);

    }
}
