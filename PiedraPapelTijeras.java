package com.revisiondecodigo4;

/* Primero, importe java.util.Scanner y define la clase PiedraPapelTijeras. 
 Luego, en el método main, usa Scanner para leer las elecciones de ambos jugadores, determina el ganador con determinarGanador, y muestra el resultado en la consola. 
 Finalmente, cierra el Scanner y maneja las jugadas para mostrar quién gana o si hay empate.*/

 import java.util.Scanner;

  /**
  * Este software emula el juego de piedra, papel o tijeras entre dos participantes.
  * El software recoge las elecciones de ambos jugadores y decide el ganador o si se produce un empate.
  */
    public class PiedraPapelTijeras {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

       // Pedir y registrar la elección del primer jugador
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para simplificar comparaciones

        // Pedir y capturar la selección del segundo jugador
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para simplificar comparaciones

        int ganador = determinarGanador(j1, j2);

        //Presentar el resultado
        if (ganador == 0) {
            System.out.println("Empate");
        } else {
            System.out.println("Gana el jugador " + ganador);
        }

        scanner.close();
    }

    /**
 * Establece quién es el ganador en el juego de piedra, papel o tijeras.
 * @param j1 Movimiento del primer jugador
 * @param j2 Movimiento del segundo jugador
 * @return 0 si es un empate, 1 si el primer jugador gana, 2 si el segundo jugador gana
 */
    public static int determinarGanador(String j1, String j2) {
       // Transformar las jugadas a minúsculas para prevenir problemas de distinción entre mayúsculas y minúsculas
        j1 = j1.toLowerCase();
        j2 = j2.toLowerCase();

        if (j1.equals(j2)) {
            return 0; // Empate
        } else if ((j1.equals("piedra") && j2.equals("tijeras")) ||
                   (j1.equals("papel") && j2.equals("piedra")) ||
                   (j1.equals("tijeras") && j2.equals("papel"))) {
            return 1; // Gana jugador 1
        } else {
            return 2; // Gana jugador 2
        }
    }
    }
