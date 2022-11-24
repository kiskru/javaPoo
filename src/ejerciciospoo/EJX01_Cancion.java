/*  Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
    además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
    otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
    definir los métodos getters y setters correspondientes.
 */
package ejerciciospoo;

import Entidad.Cancion;
import services.CancionService;

/**
 *
 * @author Kidver
 */
public class EJX01_Cancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CancionService serv = new CancionService();
        Cancion can1 = serv.crearCancion();
        System.out.println(can1.toString());
        
        System.out.println("to");
        System.out.println(can1);
        
        
        
        
    }
    
}
