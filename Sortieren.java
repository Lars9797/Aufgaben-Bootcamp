package com.btcag.bootcamp;

public class Sortieren {
    public static void main(String[] args) {
        int[] zahlen = {5, 3, 8, 4, 2};

        // Bubble Sort
        for (int i = 0; i < zahlen.length - 1; i++) {
            for (int j = 0; j < zahlen.length - 1 - i; j++) {
                if (zahlen[j] > zahlen[j + 1]) {
                    // Vertauschen
                    int temp = zahlen[j];
                    zahlen[j] = zahlen[j + 1];
                    zahlen[j + 1] = temp;
                }
            }
        }

        // Ausgabe des sortierten Arrays
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }
    }
}
