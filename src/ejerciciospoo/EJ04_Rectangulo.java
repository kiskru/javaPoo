/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package ejerciciospoo;

import Entidad.Rectangulo;
import services.RectServ;

/**
 *
 * @author Kidver
 */
public class EJ04_Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectServ reSer = new RectServ();
        System.out.println("Sistema Rectangulo");
        
        Rectangulo R1 = reSer.crearRectangulo();
        reSer.perimetro(R1);
        reSer.superficie(R1);
        reSer.recuadro(R1);


    }
    
}
