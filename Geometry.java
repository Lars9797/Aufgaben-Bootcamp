import java.util.Scanner;

public class Geometry {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte eine Zahl größer als Null eingeben; Kreis berechnen");
        double radius = scanner.nextDouble();

        double flaeche = Math.PI * (radius * radius); // Fläche des Kreises berechnen

        // Das Formatierungszeichen %f für Gleitkommazahlen hinzufügen
        System.out.printf("Die Fläche des Kreises beträgt: %.2f", flaeche);


    }

}
