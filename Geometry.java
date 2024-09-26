import java.util.Scanner;

public class Geometry {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Teilaufgabe 1: Berechnung der Fläche eines Kreises
        
        double radius = -1;
        while (radius <= 0) {
            System.out.println("Bitte den Radius des Kreises eingeben (größer als 0):");
            radius = scanner.nextDouble();

            if (radius <= 0) {
                System.out.println("Der Radius muss größer als 0 sein. Bitte erneut eingeben.");
            }
        }

        // Berechnung der Kreisfläche
        double flaecheKreis = Math.PI * (radius * radius);
        System.out.printf("Die Fläche des Kreises beträgt: %.2f\n\n", flaecheKreis);


        // Teilaufgabe 2: Berechnung der Fläche eines Rechtecks


        double laenge = -1;
        while (laenge <= 0) {
            System.out.println("Bitte die Länge des Rechtecks eingeben (größer als 0):");
            laenge = scanner.nextDouble();

            if (laenge <= 0) {
                System.out.println("Die Länge muss größer als 0 sein. Bitte erneut eingeben.");
            }
        }

        double breite = -1;
        while (breite <= 0) {
            System.out.println("Bitte die Breite des Rechtecks eingeben (größer als 0):");
            breite = scanner.nextDouble();

            if (breite <= 0) {
                System.out.println("Die Breite muss größer als 0 sein. Bitte erneut eingeben.");
            }
        }

        // Berechnung der Rechteckfläche
        double flaecheRechteck = laenge * breite;
        System.out.printf("Die Fläche des Rechtecks beträgt: %.2f\n", flaecheRechteck);


    }
}