/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo;

import Entidad.Ahorcado;
import java.util.Arrays;
import services.AhorcadoService;

/**
 *
 * @author Kidver
 */
public class EJX06_Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        AhorcadoService ser = new AhorcadoService();
        Ahorcado pal = ser.crearJuego();
        System.out.println(Arrays.toString(pal.getPalabra()));
        System.out.println("La palabra tiene "
                + ser.longitud(pal)+" letras");
        ser.buscar('e', pal);
        System.out.println("encontradas");
        ser.encontradas('e', pal);

        // TODO code application logic here
    }

}
