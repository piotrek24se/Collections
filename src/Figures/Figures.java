package Figures;

public class Figures {

    public static void main(String[] args) {

        // zadanie 1 (linia o długosci 10 - *)

        System.out.println("Zadanie 1 - linia");
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("-----------------------");

        // zadanie 2 (kwadrat o boku 10 - *)

        System.out.println("Zadanie 2 - kwadrat");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        System.out.println("-----------------------");

        // zadanie 3 (kwadrat o boku 10 pusty w srodku - *)

        System.out.println("Zadanie 3 - kwadrat pusty");
        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 9) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println("");
            } else {
                for (int j = 0; j < 10; j++) {
                    if (j == 0 || j == 9) {
                        System.out.print("*" + " ");
                    } else System.out.print(" " + " ");
                }
                System.out.println("");
            }
        }
        System.out.println("-----------------------");

        // zadanie 4 (trojkat prostokatny o podstawie 10 - *)

        System.out.println("Zadanie 2 - kwadrat");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        System.out.println("-----------------------");
    }




}


