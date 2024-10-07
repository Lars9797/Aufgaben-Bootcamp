package com.btcag.bootcamp;
import java.util.Scanner;

public class VierGewinnt {

    private static char[][] spielfeld = new char[6][7]; // 6 Reihen und 7 Spalten
    private static final char LEER = ' ';
    private static final char SPIELER1_SYMBOL = 'O';
    private static final char SPIELER2_SYMBOL = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initialisiereSpielfeld();

        // Spieler-Namensabfrage
        System.out.print("Bitte gib den Namen für Spieler 1 (O) ein: ");
        String spieler1Name = scanner.nextLine();

        System.out.print("Bitte gib den Namen für Spieler 2 (X) ein: ");
        String spieler2Name = scanner.nextLine();

        boolean spieler1IstDran = true;
        boolean gewonnen = false;
        int zuege = 0;

        //#################################################################################

        // Spielfeld anzeigen und Spiel starten
        while (!gewonnen && zuege < 42) {    //maximal Zuege
            spielfeldAnzeigen();
            char aktuellerSpielerSymbol = spieler1IstDran ? SPIELER1_SYMBOL : SPIELER2_SYMBOL;
            String aktuellerSpielerName = spieler1IstDran ? spieler1Name : spieler2Name;

            System.out.println(aktuellerSpielerName + " ist am Zug.");

            // Spalteneingabe
            int spalte;
            do {
                System.out.print("In welche Spalte (0-6) möchtest du setzen? ");
                spalte = scanner.nextInt();
            } while (spalte < 0 || spalte > 6 || !steinSetzen(spalte, aktuellerSpielerSymbol));

            // Gewinnprüfung
            gewonnen = pruefeGewinn(aktuellerSpielerSymbol);
            if (gewonnen) {
                spielfeldAnzeigen();
                System.out.println(aktuellerSpielerName + " hat gewonnen!");
            }

            spieler1IstDran = !spieler1IstDran; // Spieler wechseln
            zuege++;
        }

        if (!gewonnen) {
            System.out.println("Unentschieden! Das Spielfeld ist voll.");
        }
        scanner.close();
    }



    // Funktion zur Initialisierung des Spielfelds
    private static void initialisiereSpielfeld() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                spielfeld[i][j] = LEER;
            }
        }
    }



    // Funktion, um das Spielfeld anzuzeigen
    private static void spielfeldAnzeigen() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("|" + spielfeld[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("---------------------"); // Untere Linie des Spielfeldes
    }

    // Funktion, um einen Stein zu setzen
    private static boolean steinSetzen(int spalte, char spielerSymbol) {
        for (int i = 5; i >= 0; i--) {
            if (spielfeld[i][spalte] == LEER) {
                spielfeld[i][spalte] = spielerSymbol;
                return true;
            }
        }
        return false; // Spalte ist voll
    }

    // Funktion zur Gewinnprüfung
    private static boolean pruefeGewinn(char symbol) {
        // Horizontal
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (spielfeld[i][j] == symbol && spielfeld[i][j + 1] == symbol &&
                        spielfeld[i][j + 2] == symbol && spielfeld[i][j + 3] == symbol) {
                    return true;
                }
            }
        }

        // Vertikal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (spielfeld[i][j] == symbol && spielfeld[i + 1][j] == symbol &&
                        spielfeld[i + 2][j] == symbol && spielfeld[i + 3][j] == symbol) {
                    return true;
                }
            }
        }

        // Diagonal von links nach rechts
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (spielfeld[i][j] == symbol && spielfeld[i + 1][j + 1] == symbol &&
                        spielfeld[i + 2][j + 2] == symbol && spielfeld[i + 3][j + 3] == symbol) {
                    return true;
                }
            }
        }


        // Diagonal von rechts nach links
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 7; j++) {
                if (spielfeld[i][j] == symbol && spielfeld[i + 1][j - 1] == symbol &&
                        spielfeld[i + 2][j - 2] == symbol && spielfeld[i + 3][j - 3] == symbol) {
                    return true;
                }
            }
        }

        return false;
    }
}
