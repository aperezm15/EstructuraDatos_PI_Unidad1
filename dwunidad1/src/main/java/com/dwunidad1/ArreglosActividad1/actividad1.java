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

        System.out.println("\n-------------------------");
        System.out.println("Punto 1, Declaracion y creacion de un arreglo");
        System.out.println("-------------------------");

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

        System.out.println();
        System.out.println("\n-------------------------");
        System.out.println("Punto 2, Recorrido y mostrar");
        System.out.println("-------------------------");

        //Recorrido del arreglo con for-each
        System.out.println("Recorrido con for-each");
        for (int n : numeros) {
            System.out.print(n+", ");
        }

        //Creacion de array estatico sin valores aleatorios para mejor demostracion del punto
        //de Modificacion, donde se nos pide, cambiar todos los valores impares por cero y
        //Miltiplicar todos los valores por su indice.
        
        System.out.println();
        System.out.println("\n-------------------------");
        System.out.println("Punto 3, Modificacion: identificar impares");
        System.out.println("-------------------------");

        //Creo que al array estatico
        int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};

        //Hago el recorrido for clasico, en todos los indices del array
        for (int i=0;i < numeros2.length; i++) {
            //creo una variable x = 2, este me servira para identificar los pares
            int x = 2;
            //Creo un if, donde si en el recorrido el numero guardado en el indice(no el indice en si), dividido por x
            //donde x en el primer recorrido es igual a 1 (indice), ese numero guardado en el indice
            //dara 0, Ejemplo: en el indice 0, esta el numero 1, 1 dividido entre 2, dara 0.5,
            //es diferente de 0, por lo cual el numero 1, se cambia a 0.
            if (numeros2[i] % x != 0 ) {
                //Aqui hacemos el cambio del numero 1 a 0, en el indice 0,
                numeros2[i] = 0;
                //antes de terminar el primer recorrido, osea el indice 0, para continuar al siguiente
                //recorrido, osea indice 1, ponemos una formula para seguir buscando pares 
                // x = x + 2; ya x no vale 2, sino 4.
                x = x + 2;
            }
            //mostramos los numeros guardados en el array con los cambios
            System.out.println(numeros2[i]);
            //mostramos la multiplicacion del numero guardado en el indice, con este mismo indice.
            System.out.println("multiplicacion del numero "+ numeros2[i]+ " con indice [" +i+ "]: " + numeros2[i] * i);
            //Salto de pagina por estetica en la consola.
            System.out.println();
        }


        //Creamos otro array para hacer el ejercicio de busquedad lineal
        int[] numeros3 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("\n-------------------------");
        System.out.println("Punto 3, Busqueda");
        System.out.println("-------------------------");
        System.out.println(">>>>Buscaremos el numero 7<<<<");
        //hacemos un recorrido de los numeros del array, del 1 al 10.
        for (int i=0;i < numeros3.length; i++) {
            //imprime los numeros del array mientras va haciendo el recorrido.
            System.out.println(numeros3[i]);
            //asignamos una variable con un valor, el cual sera el que se buscara en el array
            int valorBuscado = 7;
            //Creamos un if, que nos diga que el numero en tiempo real que va recorriendo en el array es igual al valor de la variable
            //que creamos.
            if (numeros3[i] == valorBuscado){
                //Si lo encuentra, nos soltara un print, que nos hara saber que el numero fue encontrado
                System.out.println("Numero "+valorBuscado+" Encontrado.");
                //con este comando finalizamos los recorridos, y no seguira el recorrido completo, que seria hasta el 10.
                //al llegar a 7 se rompe el codigo.
                break;
            }
        } 

        
    }
    
}

