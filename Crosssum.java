import java.util.Scanner;

public class Crosssum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Teilaufgabe 1: Lese die Zahl als Ganzzahl ein
        System.out.print("Gebe eine ganze Zahl ein (Ganzzahl): ");
        long zahl = scanner.nextLong();
        long originalZahl = zahl;  // Speichere die originale Zahl zur Ausgabe

        // Berechnung der Quersumme der Ganzzahl
        long quersummeGanzzahl = 0;
        while (zahl != 0) {
            quersummeGanzzahl += zahl % 10; // Nimm die letzte Ziffer der Zahl
            zahl /= 10; // Entferne die letzte Ziffer der Zahl
        }

        System.out.println("Die Quersumme der Ganzzahl " + originalZahl + " ist: " + quersummeGanzzahl);

        // Teilaufgabe 2: Lese die Zahl als Zahlenkette (String) ein
        scanner.nextLine(); // Puffer leeren
        System.out.print("Gebe eine Zahl als Zahlenkette ein: ");
        String zahlenkette = scanner.nextLine();

        // Berechnung der Quersumme der Zahlenkette
        int quersummeZahlenkette = 0;
        int index = 0;
        while (index < zahlenkette.length()) {
            // Hole den aktuellen Charakter und wandle ihn in eine Ziffer um
            char ziffer = zahlenkette.charAt(index);
            if (Character.isDigit(ziffer)) { // Sicherstellen, dass es sich um eine Ziffer handelt
                quersummeZahlenkette += Character.getNumericValue(ziffer);
            }
            index++; // Gehe zur nächsten Ziffer
        }

        System.out.println("Die Quersumme der Zahlenkette \"" + zahlenkette + "\" ist: " + quersummeZahlenkette);
    }
}