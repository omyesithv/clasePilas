package com.Baterias;

import java.util.Scanner;

public class pilas {
    Scanner teclado = new Scanner(System.in);
    int pilaNumerica[] = new int[5];
    int tope = -1;

    public void push() {
        if (tope >= pilaNumerica.length - 1) {
            System.out.println("La pila està llena");
        } else {
            tope = tope + 1;
            System.out.println("Ingrese el dato");
            pilaNumerica[tope] = teclado.nextInt();
        }
    }

    public int pop() {
        if (tope == -1) {
            System.out.println("La pila se encuentra vacía");
        } else {
            System.out.println("Se ha elminado un elemento de la pila");
            pilaNumerica[tope] = 0;
        }
        return tope--;
    }

    public void show() {
        if (tope == -1) {
            System.out.println("La pila se encuentra vacía");
        } else {
            for (int tope = 4; tope >= 0; tope--) {
                System.out.println("Datos de la pila: " + pilaNumerica[tope]);
            }

        }
    }

}
