/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        this.jugMax = 6;
    }

    public Ahorcado(char[] palabra, int encontradas, int jugMax) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.jugMax = 6;
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
