package org.gestore.eventi.java;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Prova {
    public static void main(String[] args) {
        Concert concert = new Concert("avenged sevenfold", LocalDate.parse("2023-10-10"), 30000, LocalTime.parse("22:30"), new BigDecimal("499.99"));
        System.out.println(concert);
    }
}
