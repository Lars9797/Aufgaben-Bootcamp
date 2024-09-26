import java.util.Scanner;

public class Schaltjahr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jahr;
        System.out.println("Gebe bitte ein Jahr ein:");
        jahr = scanner.nextInt();


        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    System.out.println(jahr + " ist ein Schaltjahr.");
                } else {
                    System.out.println(jahr + " ist kein Schaltjahr.");
                }
            } else {
                System.out.println(jahr + " ist ein Schaltjahr.");
            }
        } else {
            System.out.println(jahr + " ist kein Schaltjahr.");
        }

        scanner.close(); // Scanner schließen
    }
}
