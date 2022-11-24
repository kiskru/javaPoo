/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejerciciospoo;

import Entidad.Cafetera;
import java.util.Scanner;
import services.CafeteraService;

/**
 *
 * @author Kidver
 */
public class EJ06_Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CafeteraService cafSer = new CafeteraService();
        
        System.out.println("Indique la capacidad maxima de la nueva cafetera");
        int cap=scan.nextInt();
        Cafetera cafetera=new Cafetera(cap, 0);
        cafSer.llenarCafet(cafetera);
        cafSer.servirTaza(cafetera);
        cafSer.vaciarCafeteria(cafetera);
        cafSer.agregarCafe(cafetera);
        cafSer.mostarCafeActual(cafetera);



    }
    
}
