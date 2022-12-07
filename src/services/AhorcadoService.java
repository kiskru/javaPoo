/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 */
package services;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kidver
 */
public class AhorcadoService {

    Scanner scan = new Scanner(System.in);
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
//vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
//de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
//máximas, el valor que ingresó el usuario y encontradas en 0.

    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra a adivinar");
        String palabra = scan.next();
        System.out.println("Cuantas jugadas max");
        int max = scan.nextInt();
//        String[] secreto = new String[palabra.length()];
//        for (int i = 0; i < palabra.length(); i++) {
//            secreto[i] = palabra.substring(i, i + 1);
//        }
        char[] secreto = palabra.toCharArray();

        return new Ahorcado(secreto, 0, max);
    }
//Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.

    public int longitud(Ahorcado P) {
        int longitud = P.getPalabra().length;
        return longitud;
    }
//Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.

    public boolean buscar(char letra, Ahorcado P) {
        boolean bool = false;

        for (int i = 0; i < this.longitud(P); i++) {
            if ((P.getPalabra()[i]) == letra) {
                bool = true;
                break;
            }
        }
        if (bool == true) {
            System.out.println("La letra SI esta en la palabra!!!");

        } else {
            System.out.println("La letra NO se encuentra en la palabra");
        }
        return bool;
    }
//Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.

    public boolean encontradas(char letra, Ahorcado P, char[] mostrarPalabra) {
        boolean bool = false;
        int letraEncontrada = 0;
        for (int i = 0; i < this.longitud(P); i++) {
            if ((P.getPalabra()[i]) == letra) {
                P.setEncontradas(P.getEncontradas() + 1);
                letraEncontrada++;
                mostrarPalabra[i] = letra;
            }
        }
        System.out.println("la letra está " + letraEncontrada + " veces");
        System.out.println(mostrarPalabra);
        if (this.longitud(P) - P.getEncontradas() == 0) {
            System.out.println("Felicitaciones!!!\n"
                    + "Encontarste la palabra secreta");
        } else {
            System.out.println("Faltan: " + (this.longitud(P) - P.getEncontradas()) + " letras");
        }
        if (letraEncontrada > 0) {
            bool = true;
        }

        return bool;
    }
//Método intentos(): para mostrar cuantas oportunidades de queda al jugador.

    public void intentos(Ahorcado P, char letra) {
        P.setJugMax(P.getJugMax() - 1);
        int intentos = P.getJugMax();

        System.out.println("Le quedan " + intentos + " intentos.");
    }
// Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.

    public void juego(Ahorcado P) {
        char[] mostrarPalabra = new char[this.longitud(P)];
        for (int i = 0; i < this.longitud(P); i++) {
            mostrarPalabra[i] = '-';
        }
        System.out.println("La palabra tiene "
                + this.longitud(P) + " letras");

        do {

            System.out.print("Ingrese una letra: ");
            char letra = scan.next().charAt(0);
            if (Arrays.toString(mostrarPalabra).contains(String.valueOf(letra))) {
                System.out.println("Ya se encuentra la letra en la palabra");
                System.out.println(mostrarPalabra);
                continue;
            }
            if (this.buscar(letra, P)) {
                if (this.encontradas(letra, P, mostrarPalabra));
            } else {
                this.intentos(P, letra);
            }

        } while ((P.getJugMax() > 0) && (P.getEncontradas() != this.longitud(P)));
    }

    //end//
}
