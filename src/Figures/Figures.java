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

        System.out.println("Zadanie 4 - trojkat prostokatny o podstawie 10");
        int length = 10;
        int counter = length + 1;
        for (int i = 0; i < 10; i++) {
            counter--;
            for (int j = 0; j < counter; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        System.out.println("-----------------------");

        // zadanie 5 (trojkat rownoramienny o podstawie 11 - *) - dokonczyć (nie dziala prawidlowo)

        System.out.println("Zadanie 5 - trojkat rownoramienny o podstawie 11");
        int length1 = 11;
        int counter2 = length1 + 1 / 2;
        for (int i = 0; i < 11; i++) {
            if (i == 10) {
                for (int j = 0; j < 11; j++) {
                    System.out.print("*" + " ");
                }
            } else {
                for (int j = 0; j < 11; j++) {
                    if (j < counter2 - i || j > counter2 + i) {
                        System.out.print(" " + " ");
                    } else System.out.print("*" + " ");
                }
            }

            System.out.println("");

        }
        System.out.println("-----------------------");
    }


}


