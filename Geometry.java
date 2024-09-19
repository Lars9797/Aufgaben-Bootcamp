package com.btcag.bootcamp;

import java.util.Scanner;

public class Geometry {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("bitte eine Zahl groeßer Null eingeben; Kreis berechnen");
        double radius = scanner.nextDouble();

        double flaeche = Math.PI * (radius*radius); //fläche des kreises berrechnen

        System.out.printf("Die Fläche des Kreises beträgt: ", flaeche);


    }

}
