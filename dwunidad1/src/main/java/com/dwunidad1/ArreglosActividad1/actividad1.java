package com.dwunidad1.ArreglosActividad1;

import java.util.Random;

public class actividad1 {
    public static void main(String[] args) {
        //Creamos un array de 10 enteros, teniendo en cuenta el siguiente punto que deben
        //inicializarce aleatoriamente.
        int[] numeros = new int[10];

        
        //Utilizamos Random para crear numeros aleatorios, importamos libreria
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
           numeros[i] = random.nextInt(11); 
        }

        
        System.out.print("arreglo creado: ");
        for (int n : numeros) {
            System.out.print("{" + n + "}");
        }

        System.out.println("\nRecorrido con for");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+", ");
        }
        System.out.println("\nRecorrido con for-each");
        for (int n : numeros) {
            System.out.print(n+", ");
        }

        
    }
    
}

