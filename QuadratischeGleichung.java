package com.btcag.bootcamp;

import java.util.Scanner;

public class QuadratischeGleichung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Koeffizienten a, b und c
        System.out.println("Gebe den Koeffizienten a ein (ungleich 0):");
        double a = scanner.nextDouble();

        // Sicherstellen, dass a nicht 0 ist
        while (a == 0) {
            System.out.println("a darf nicht 0 sein. Geben Sie den Koeffizienten a erneut ein:");
            a = scanner.nextDouble();
        }

        System.out.println("Gebe den Koeffizienten b ein:");
        double b = scanner.nextDouble();

        System.out.println("Gebe den Koeffizienten c ein:");
        double c = scanner.nextDouble();

        // Berechnung der Diskriminante
        double discriminant = b * b - 4 * a * c;

        // Bestimmen der Anzahl der Lösungen
        if (discriminant > 0) {
            System.out.println("Die Gleichung hat 2 Lösungen.");
        } else if (discriminant == 0) {
            System.out.println("Die Gleichung hat 1 Lösung.");
        } else {
            System.out.println("Die Gleichung hat keine Lösung.");
        }

        scanner.close(); // Scanner schließen
    }
}
