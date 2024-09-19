package com.btcag.bootcamp;

import java.util.Scanner;


public class Backwards {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print ("Gib Zahl");
        String UserString = scanner.nextLine();

        System.out.println (UserString);
        System.out.println (UserString.charAt(1));
        System.out.println (UserString.length());

        int length = UserString.length();
        String result = "";

        while (length > 0) {
            result = result + UserString.charAt(length);

            length = length -1;

        }
        System.out.println(result);

    }
}
