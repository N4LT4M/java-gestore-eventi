package org.gestore.eventi.java;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1. Creare una classe Main di test, in cui si chiede all’utente di inserire un nuovo evento con tutti i parametri.
2. Dopo che l’evento è stato istanziato, chiedere all’utente se e quante prenotazioni vuole fare e provare ad effettuarle, implementando opportuni controlli e gestendo eventuali eccezioni.
3. Stampare a video il numero di posti prenotati e quelli disponibili
4. Chiedere all’utente se e quanti posti vuole disdire
5. Provare ad effettuare le disdette, implementando opportuni controlli e gestendo eventuali eccezioni
6. Stampare a video il numero di posti prenotati e quelli disponibili
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("event name ?");
        String eventTitle = scanner.nextLine();
        System.out.println("when is the event?");
        String eventDate = scanner.nextLine();
        System.out.println("how many total seats?");
        int eventTotalSeat = scanner.nextInt();
        try {
            Event event = new Event(eventTitle, LocalDate.parse(eventDate), eventTotalSeat);
            System.out.println(event);
        }catch (RuntimeException exception){
            System.out.println("errore");
            System.out.println(exception.getMessage());
        }
    }
}
