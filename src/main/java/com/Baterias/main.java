package com.Baterias;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // Aquí las instrucciones de inicio y control del programa

        /*
         * System.out.println("Empezamos la ejecución del programa");
         * 
         * pilas pila = new pilas();
         * 
         * for (int tope = 4; tope >= 0; tope--) {
         * pila.push();
         * }
         * 
         * pila.show();
         * 
         * for (int tope = 4; tope >= 0; tope--) {
         * if (tope == 2) {
         * pila.pop();
         * }
         * 
         * }
         * 
         * pila.show();
         */

        // Metodo del profesor
        pilas pila1 = new pilas();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Menu de la pila");
            System.out.println("1. ingresa elementos(Push): ");
            System.out.println("2. Eliminar elementos(pop): ");
            System.out.println("3.Mostrar la pila completa: ");
            System.out.println("4. Salir: ");
            System.out.println("Ingrese una opción: ");
            opcion = sc.nextInt();

            if (opcion == 4) {
                break;
            } else if (opcion == 3) {
                pila1.show();
            } else if (opcion == 2) {
                pila1.pop();
            } else if (opcion == 1) {
                pila1.push();
            }

        } while (opcion != 4);

    } // Cierre del main

} // C