package org.gestore.eventi.java;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concert extends Event {
    /*
    Creare una classe Concerto che estende Evento, che ha anche gli attributi :
● ora: LocalTime
● prezzo: BigDecimal
Aggiungere questi attributi nel costruttore e implementarne getter e setter
Aggiungere i metodi per restituire data e ora formattata e prezzo formattato (##,##€)
Fare l’ override del metodo toString() in modo che venga restituita una stringa del tipo: data e ora formattata - titolo - prezzo formattato
     */
    //attributi
    private LocalTime time;
    private BigDecimal price;
    //costruttore
    public Concert(String title, LocalDate date, int totalSeat, LocalTime time, BigDecimal price){
        super(title, date, totalSeat);
        this.time = time;
        this.price = price;
    }
    //getter e setter


    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    /*
    LocalDate date = LocalDate.now();
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
  String text = date.format(formatter);
  LocalDate parsedDate = LocalDate.parse(text, formatter);
     */
    String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = getDate().format(formatter);
        return formattedDate;
    }

    //Aggiungere i metodi per restituire data e ora formattata e prezzo formattato (##,##€)
    //public LocalDateTime dateAndTime(){

    //}

    public BigDecimal reservationPrice(int numberOfTickets){
        BigDecimal reservationPrice = BigDecimal.valueOf(numberOfTickets).multiply(price);
        return reservationPrice;
    }

    /*public static String format(BigDecimal num) {
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
        return df.format(num);
*/
    public String getFormattedPrice(){
        DecimalFormat formatter = new DecimalFormat("0.00");
        return formatter.format(price);
    }


    @Override
    public String toString(){
        return getFormattedDate() + " - " + time + " - " + getTitle() + " - " + getFormattedPrice() + "$";
    }
}
