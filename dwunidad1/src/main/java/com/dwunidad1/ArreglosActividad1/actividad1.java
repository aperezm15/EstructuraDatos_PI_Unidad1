package com.dwunidad1.ArreglosActividad1;

import java.util.Random;

public class actividad1 {
    public static void main(String[] args) {
        //Creamos un array de 10 enteros, teniendo en cuenta el siguiente punto que deben
        //inicializarce aleatoriamente.
        int[] numeros = new int[10];

        
        //Utilizamos Random para crear numeros aleatorios, importamos libreria
        Random random = new Random();

        //For para crear array con numeros aleatorios.
        for (int i = 0; i < numeros.length; i++) {
           numeros[i] = random.nextInt(11); 
        }

        //For-each para verificar que el arreglo haya sido creado
        System.out.print("arreglo creado: ");
        for (int n : numeros) {
            System.out.print("{" + n + "}");
        }

        //Recorrido del arreglo con for
        System.out.println("\nRecorrido con for");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+", ");
        }

        //Recorrido del arreglo con for-each
        System.out.println("\nRecorrido con for-each");
        for (int n : numeros) {
            System.out.print(n+", ");
        }

        //Creacion de array estatico sin valores aleatorios para mejor demostracion del punto
        //de Modificacion, donde se nos pide, cambiar todos los valores impares por cero y
        //Miltiplicar todos los valores por su indice.
        

        System.out.println("\n-------------------------");
        System.out.println("Punto 3, Modificacion: identificar impares");
        System.out.println("-------------------------");
        int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};

        for (int i=0;i < numeros2.length; i++) {
            int x = 2;
            if (numeros2[i] % x != 0 ) {
                numeros2[i] = 0;
                x = x + 2;
            }
            System.out.println(numeros2[i]);
            System.out.println("multiplicacion del numero "+ numeros2[i]+ " con indice [" +i+ "]: " + numeros2[i] * i);
            System.out.println();
        }


        
    }
    
}

