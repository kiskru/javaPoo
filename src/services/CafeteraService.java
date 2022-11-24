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
package services;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Kidver
 */
public class CafeteraService {

    Scanner scan = new Scanner(System.in);

    public void llenarCafet(Cafetera cafetera) {
        int cap = cafetera.getCapacidadMax();
        cafetera.setCantidadAct(cap);
    }

    /*• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
     */
    public void servirTaza(Cafetera cafetera) {
        System.out.println("Vamos a servir una taza de cafe\n"
                + "Indique cuantos ml de pacidad es la taza");
        int taza = scan.nextInt();
        if (cafetera.getCantidadAct() > taza) {
            cafetera.setCantidadAct(cafetera.getCantidadAct() - taza);
            System.out.println("Se ha llenado completamente la taza\n"
                    + "Disfrute de su cafe");
        } else {
            System.out.println("No hay cafe suficiente para llenar la taza");
            System.out.print("la taza se lleno hasta un..." + (cafetera.getCantidadAct() * 100 / taza) + "% ");
            System.out.println(cafetera.getCantidadAct() + "ml");
        }
    }

    //• Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafeteria(Cafetera cafetera) {
        System.out.println("Vamos a vaciar la cafetera");
        cafetera.setCantidadAct(0);
        System.out.println("la cafetera se ha vaciado!!");
    }
//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//  recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(Cafetera cafetera){
        System.out.println("Cuanto cafe deseas agregar a la cafetera?");
        int cafe=scan.nextInt();
        if (cafetera.getCantidadAct()+cafe>cafetera.getCapacidadMax()){
            System.out.println("excediste la capacidad maxima");
            cafetera.setCantidadAct(cafetera.getCapacidadMax());
        }else{
            cafetera.setCantidadAct(cafetera.getCantidadAct()+cafe);
            System.out.println("has aumentado la cantidad de cafe en la cafetera");
        }
    }
    
    public void mostarCafeActual(Cafetera cafetera){
      
        System.out.println("te queda "+cafetera.getCantidadAct()+" ml de cafe"); 
    }
    
    
}
