package com.dwunidad1.ArreglosActividad1;

public class actividad2 {
    public static void main(String[] args){
            System.out.println("\n-------------------------");
            System.out.println("Punto 1 y 2, Declaracion,inicializacion y Recorrido");
            System.out.println("-------------------------");

            //Creamos una matriz 3x3 con valores de 1 al 9
            int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            //Imprimimos la matriz con un metodo
            System.out.println("---Matriz Creada---");
            imprimirMatriz(matriz);

            //Recorrido de matriz por columnas
            System.out.println("\n--- Recorrido por Columnas ---");
            //Hacemos el for anidado pero invertimos en el print, las los indices.
            //Primero recorre j y dentro de cada valor de j, recorrera i
            for (int i=0;i < matriz.length; i++){
                for (int j=0;j < matriz.length; j++) {
                    System.out.print(matriz[j][i]+"\t");
                }
                System.out.println();
            }

            System.out.println("\n-------------------------");
            System.out.println("Punto 3, Operaciones");
            System.out.println("-------------------------");            
            
            //Asignamos una variable que sera nuestro contador que ira sumando los elementos de la matriz
            int acumulador = 0;

            System.out.println("Sumando los elementos de la siguente matriz:");
            System.out.println();

            //Hacemos un for anidado
            for (int i=0;i < matriz.length; i++) {
                for (int j=0;j < matriz.length; j++) {
                    acumulador = acumulador + matriz[i][j];     //le decimos que en cada vuelta que haga en el
                                                                //interno vaya sumando y guardando en la 
                                                                //variable acumulador.

                    System.out.print(matriz[i][j]+"\t");        //Imprimimos la tabla para tener visualizacion
                                                                //de lo que se esta sumando, con su respectiva
                                                                //tabulacion para que se vea ordenado
                    
                } 
                System.out.println();                           //hacemos salto de linea en for externo
                                                                //para que se vean ordenadas las filas


            }
            System.out.println();
            //fuera del for anidado ponemos la variable con la sumatoria de los elementos de la matriz
            System.out.println("Se ha acumulado de los elementos de la matriz la suma de: "+acumulador);
            
            System.out.println();

            System.out.println("---------------------------------------------------------");
            System.out.println("Intercambio de primera y ultima fila de la siguiente matriz");
            System.out.println();
            imprimirMatriz(matriz);
            System.out.println();
            
            
            int[] temporal = matriz[0];                             //Utilizamos una varible temporal
                                                                    //para guardar la primera fila [0]
                                                                    //de la matriz

            matriz[0] = matriz[2];                                  //asginamos al indice 0 o fila 1 el valor
                                                                    //de el indice 2 o fila 3

            matriz[2] = temporal;                                   //por ultimo al indice 2 o fila 3, le
                                                                    //le asignamos el valor guardado en la
                                                                    //variable temporal, que es igual a
                                                                    //indice 0 o fila 2

            System.out.println("Matriz con filas intercambiadas.");
            System.out.println();
            imprimirMatriz(matriz);                                 //se imprime la matriz con el metodo







            //-------------------------------------METODOS-------------------------------------------

}
            //Este metodo nos ayudara a poder imprimir la matriz que creamos.
            public static void imprimirMatriz(int[][] m) {  //Asignamos nombre del metodo, y que valores
                                                            //vamos a tomar, un int[][] con una variable m
                for (int i = 0; i < m.length; i++) {        //recorremos i, como i es 0, va a recorrer la
                                                            //primera fila.

                    for (int j = 0; j < m[i].length; j++) { //con este for anidado lo que estamos haciendo es
                                                            //recorrer las columnas de la fila 0, en logica
                                                            //podemos saber que i=0, j=0 es igual a 1
                                                            //i=0, j=1 es 2 y i=0, j=2 es 3.

                        System.out.print(m[i][j] + "\t");   //aqui imprimos el recorrido de java
                                                            //usamos \t para que quede mejor presentado
                                                            //con su tabulado entre los elementos de j
                    }
                    System.out.println();                   //Una vez que termine el recorrido de j
                                                            //se volvera al for que recorre i, ya i no es igual
                                                            //a 0, sino 1, y se repite el recorrido de j
                }
            }

}
