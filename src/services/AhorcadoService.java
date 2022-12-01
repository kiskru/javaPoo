/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    public int longitud(Ahorcado P) {
        int longitud = P.getPalabra().length;
        return longitud;
    }

    public void buscar(char letra, Ahorcado P) {
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

    }
    
    public boolean encontradas(char letra, Ahorcado P){
        boolean bool = false;
        int letraEncontrada=0;
        for (int i = 0; i < this.longitud(P); i++) {
            if ((P.getPalabra()[i]) == letra) {
                letraEncontrada++;
                System.out.println("la letra está "+letraEncontrada+" veces");
            }
        }
        if (letraEncontrada>0) {
            bool=true;
        }
        
        return bool;
    }
    
    

}
