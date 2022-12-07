/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 */
package ejerciciospoo;

import Entidad.Ahorcado;
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
        ser.juego(pal);

    }

}
//