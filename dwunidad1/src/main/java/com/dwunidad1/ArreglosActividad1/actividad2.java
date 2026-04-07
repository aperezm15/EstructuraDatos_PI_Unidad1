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
