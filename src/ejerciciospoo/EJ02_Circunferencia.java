/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (area = pi ∗ radio^2).
e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ radio).
 */
package ejerciciospoo;

import Entidad.Circunferencia;
import java.util.Scanner;
import services.CircunferenciaService;

/**
 *
 * @author Kidver
 */
public class EJ02_Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircunferenciaService cirCun = new CircunferenciaService();
        Scanner scan = new Scanner(System.in);
        // 
        System.out.println("hola");
        Circunferencia C1 = cirCun.crearCircunferencia();

        System.out.println(C1);

        cirCun.area(C1);
        System.out.println("El perimetro es: " + cirCun.perimetro(C1));

    }

}
