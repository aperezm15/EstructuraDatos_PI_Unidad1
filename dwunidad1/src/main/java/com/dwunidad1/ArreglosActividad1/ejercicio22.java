package com.dwunidad1.ArreglosActividad1;

import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        //Para nuestro parqueadero necesitamos que el usuario pueda ingresar datos, usamos scanner.
        Scanner sc = new Scanner(System.in);                            

        //Creamos una matriz de tipo boolean 4x4, osea que tendra 16 espacios el parqueaero.
        boolean[][] parqueadero = new boolean[4][4];
        //creamos una variable opcion ya que utilizaremos do while
        int opcion;


        //Creamos un menu interactivo con el usuario.
        do {
            System.out.println("\n--- GESTIÓN DE PARQUEADERO ---");
            System.out.println("1. Ver estado del parqueadero");
            System.out.println("2. Registrar Entrada (Ocupar)");
            System.out.println("3. Registrar Salida (Liberar)");
            System.out.println("4. Contar espacios disponibles");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            //dejamos que el usuario escoja la opcion
            opcion = sc.nextInt();


            //Creamos los casos para hacer la accion al momento de seleccionar una de las opciones.
            switch(opcion) {
                //En caso de que se escoja la opcion 1, nos mostrara el estado del parqueadero, esto con un metodo
                //que nos mostrara la matriz creada con los espacios disponibles y ocupados.
                case 1:
                    mostrarParqueadero(parqueadero);
                    break;
                //Para la opcion 2 hemos hecho el flujo de registrar un espacio.
                case 2:
                    //se ingresa la fila
                    System.out.print("Ingrese fila (0-3): ");
                    int fE = sc.nextInt();
                    //Se ingresa la columna
                    System.out.print("Ingrese columna (0-3): ");
                    int cE = sc.nextInt();

                    //En este bloque de codigo, definimos qque el parqueadero es de 4x4, donde los indices van de 0 a 3 (0,1,2,3)
                    //con este if, evitaremos que salga algun error algun momento de que el usuario elija un numero fuera del limite.
                    if (fE >= 0 && fE < 4 && cE >= 0 && cE < 4) {
                        //Con este if decimos que si el espacio es false, este pasara a true,
                        //FALSE es Libre, y TRUE es Ocupado.
                        if (!parqueadero[fE][cE]) {
                            //aqui podemos ver que en caso de que el espacio sea false, pasara a true.
                            parqueadero[fE][cE] = true;
                            //podemos saber el exito, con el mensaje que mandamos al usuario.
                            System.out.println("Vehículo registrado con éxito.");

                        //En caso de que no se cumpla, nos mostrara un mehnsaje de error.
                        } else {
                            System.out.println("¡Error! El espacio ya está ocupado.");
                        }
                    //En caso del for externo, si se elige una opcion fuera del rango de la matriz, nos aparecera un mensaje de advertencia.
                    } else {
                        System.out.println("Coordenadas inválidas.");
                    }
                    break;
                //Para la opcion 3, haremos que los usuarios puedan desocupar los espacios.
                case 3:
                    //ingresamos fila
                    System.out.print("Ingrese fila (0-3) para salida: ");
                    int fS = sc.nextInt();
                    //ingresamos columna
                    System.out.print("Ingrese columna (0-3) para salida: ");
                    int cS = sc.nextInt();
                    //Hacemos la misma validacion para que las opciones sean dentro del rango de la matriz
                    //y no haiga ningun ttipo de caida en el sistema.
                    if (fS >= 0 && fS < 4 && cS >= 0 && cS < 4) {
                        //si el espacio esta en true, se pasara a false.
                        if (parqueadero[fS][cS]) {
                            //linea que nos pasa de true a false
                            parqueadero[fS][cS] = false;
                            //Mensaje que nos dira que se ha funcionado
                            System.out.println("Espacio liberado.");
                        //Si no, nos mostrara un mensaje de advertencia.
                        } else {
                            System.out.println("El espacio ya estaba vacío.");
                        }
                    }
                    break;
                //para el caso 4, sera un simple conteo con acumulador. que hacemos con un metodo creado.
                case 4:
                    int disponibles = contarDisponibles(parqueadero);
                    System.out.println("Espacios libres actualmente: " + disponibles);
                    break;
            }
        //Al undir la opcioon 5 nos cerrara el sistema.
        } while (opcion != 5);
        System.out.println("Sistema cerrado");

    }


    //Metodo para mostrar la matriz.
    public static void mostrarParqueadero(boolean[][] p) {
        System.out.println("\nMapa del Parqueadero ([L]=Libre, [O]=Ocupado):");
        //Hacemos el recorrido
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                //Mostraremos en vez de TRUE y FALSE, O y L, para mejor visibilidad.
                System.out.print(p[i][j] ? "[O] " : "[L] ");
            }
            System.out.println();
        }
    }
    //Metodo de Conteo
    public static int contarDisponibles(boolean[][] p) {
        //Acumulador.
        int contador = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                if (!p[i][j]) { // Si es false
                    contador++;
                }
            }
        }
        return contador;
    }

    
}
