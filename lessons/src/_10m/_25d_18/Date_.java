package _10m._25d_18;

import java.util.Date;

//deprecated (zavrhovaná, nepodporovaná) třída. Používat raději java.util.Calendar.
//používat pouze pro uložení data a času s přesností na milisekundy.
//ms = 1.1.1970. Dobrá spolupráce s metodou System.currentTimemillis()
public class Date_ {
    public static void main(String[] args) {
        Date d1 = new Date ();
        Date d2 = new Date (System.currentTimeMillis()+2000);
    }
}
