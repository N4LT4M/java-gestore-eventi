package org.gestore.eventi.java;

import java.time.LocalDate;

public class Event {
    /*
    creare una classe Evento che abbia le seguenti proprietà:
● titolo
● data (localDate)
● numero di posti in totale
● numero di posti prenotati
Quando si istanzia un nuovo evento questi attributi devono essere tutti valorizzati nel costruttore , tranne posti prenotati che va inizializzato a 0.
Inserire il controllo che la data non sia già passata e che il numero di posti totali sia positivo. In caso contrario sollevare opportune eccezioni.
Aggiungere metodi getter e setter in modo che:
● titolo sia in lettura e in scrittura
● data sia in lettura e scrittura
● numero di posti totale sia solo in lettura
● numero di posti prenotati sia solo in lettura
Vanno inoltre implementati dei metodi public che svolgono le seguenti funzioni:
1. prenota : aggiunge un certo numero di posti prenotati. Se l’evento è già passato o non ha posti disponibili deve sollevare un’eccezione.
2. disdici : riduce di un certo numero i posti prenotati. Se l’evento è già passato o non ci sono prenotazioni deve sollevare un’eccezione.
3. l’override del metodo toString() in modo che venga restituita una stringa contenente: data formattata - titolo
Aggiungete eventuali metodi (public e private) che vi aiutino a svolgere le funzioni richieste.
     */
    //attributi
    private String title;
    private LocalDate date;
    private int totalSeat;
    private int reservedSeats;

    //costruttore
    public Event(String title, LocalDate date, int totalSeat) throws RuntimeException {
        //fare le validazioni
        if (totalSeat < 0) {
            throw new RuntimeException("total seats must be greater than zero");
        }
        if (date.isBefore(LocalDate.now())) {
            throw new RuntimeException("the date can't be before today");
        }
        this.title = title;
        this.date = date;
        this.totalSeat = totalSeat;
        this.reservedSeats = 0;
    }

    //getter e setter


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTotalSeat(){
        return totalSeat;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    //metodi
    public int reservedSeats(){
        int reservedSeats;

    }


    @Override
    public String toString(){
        return title + " - " + date;
    }

}
