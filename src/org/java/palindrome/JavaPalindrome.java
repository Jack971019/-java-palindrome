package org.java.palindrome;

import java.util.Scanner;

// Consegna: scrivere un programma che chiede all’utente di inserire una parola e gli risponde se è una parola palindroma oppure no
public class JavaPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usernameword;
        String inverseWordsArray;

        System.out.println("inserisci una parola");
        usernameword = scanner.nextLine();

        char[]usernamewordarray = usernameword.toCharArray();

        for (int i = usernamewordarray.length - 1; i >= 0 ; i--) {
            System.out.println(usernamewordarray[i]);
        }












        scanner.close();
    }
}
