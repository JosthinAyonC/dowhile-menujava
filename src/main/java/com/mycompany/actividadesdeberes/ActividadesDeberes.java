package com.mycompany.actividadesdeberes;

import java.util.Scanner;

public class ActividadesDeberes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion, numero;

        do {
            System.out.println("Menú:");
            System.out.println("1. Verificar número perfecto");
            System.out.println("2. Imprimir tabla de multiplicar");
            System.out.println("3. Verificar factorial");
            System.out.println("4. Número invertido");
            System.out.println("0. Salir");
            
            while (true) {
                System.out.print("Ingrese la opcion: ");

                if (sc.hasNextInt()) {
                    opcion = sc.nextInt();
                    break;
                } else {
                    System.out.println("///Ingrese una opcion valida.///");
                    sc.next();
                }
            }

            if (opcion == 0 ) {
                break;
            }

            while (true) {
                System.out.print("Ingrese el numero: ");

                if (sc.hasNextInt()) {
                    numero = sc.nextInt();
                    break;
                } else {
                    System.out.println("///Debe ingresar un número entero. Por favor, intente nuevamente.///");
                    sc.next();
                }
            }
            switch (opcion) {

                case 1:
                    int suma = 0;
                    for (int i = 1; i < numero; i++) {

                        if (numero % i == 0) {
                            suma += i;
                        }
                    }
                    if (suma == numero) {
                        System.out.println(numero + " es un número perfecto.");
                    } else {
                        System.out.println(numero + " no es un número perfecto.");
                    }

                    break;

                case 2:

                    System.out.println("TABLA DE MULTIPLICAR DEL:" + numero + "\n-----------------------------");
                    int mult;
                    for (int i = 1; i < 13; i++) {
                        mult = numero * i;
                        System.out.println(numero + " * " + i + " = " + mult);
                    }

                    break;
                case 3:
                    int factorial = 1;

                    for (int i = 1; i <= numero; i++) {
                        factorial *= i;
                    }
                    System.out.println("\nEl factorial de " + numero + " es: " + factorial);
                    break;
                case 4:

                    String numeroString = Integer.toString(numero);
                    String numeroInvertido = new StringBuilder(numeroString).reverse().toString();

                    int numeroInvertidoInt = Integer.parseInt(numeroInvertido);
                    System.out.println("El número invertido es: " + numeroInvertidoInt);

                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 0);
    }
}
