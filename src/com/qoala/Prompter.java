package com.qoala;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prompter {
    int decks;




    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Welcome to Blackjack! How many decks would you like to play with? : ");
    String s = br.readLine();
    this.decks = Integer.parseInt(br.readLine());


//
    while (this.decks != null && decks > 0) {
         this.decks = reader.nextInt();
    }
    reader.close();
}
