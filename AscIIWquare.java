package com.btcag.bootcamp;

import java.util.Scanner;

public class AscIIWquare {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groesse = 0;


        while (groesse <= 0) {
            System.out.print("Bitte gib eine ganze Zahl größer als 0 ein: ");
            groesse = scanner.nextInt();
        }

        //Quadrat
        int zeile = 0;          // Äußere Schleife für die Zeilen
        while (zeile < groesse) {

            int spalte = 0;     // Innere Schleife für die Sterne in jeder Zeile
            while (spalte < groesse) {
                System.out.print("* ");
                spalte++;
            }
            System.out.println(); // Neue Zeile nach jeder Reihe von Sternen
            zeile++;

            //Dreieck
            int zeile2 = 1;              // Äußere Schleife für die Zeilen
            while (zeile2 <= groesse) {

                int spalte2 = 0;         // Innere Schleife für die Sterne in jeder Zeile
                while (spalte2 < zeile) {
                    System.out.print("* ");
                    spalte2++;
                }
                System.out.println(); // Neue Zeile nach jeder Reihe von Sternen
                zeile2++;
            }
        }
    }
}
