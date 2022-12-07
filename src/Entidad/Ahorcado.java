/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 */
package Entidad;

/**
 *
 * @author Kidver
 */
public class Ahorcado {
    private char[] palabra;
    private int encontradas;
    private int jugMax; 

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int encontradas, int jugMax) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.jugMax = jugMax;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugMax() {
        return jugMax;
    }

    public void setJugMax(int jugMax) {
        this.jugMax = jugMax;
    }
    
    
}
