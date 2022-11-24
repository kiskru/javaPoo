/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package services;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Kidver
 */
public class RectServ {

    public Rectangulo crearRectangulo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la altura.");
        double altura = scan.nextDouble();
        System.out.println("Ingrese la Base.");
        double base = scan.nextDouble();
        return new Rectangulo(altura, base);

    }

    public void superficie(Rectangulo rec) {

        double X = rec.getAltura() * rec.getBase();
        System.out.println("La superficie es: " + X);
    }

    public void perimetro(Rectangulo rec) {

        double X = (rec.getAltura() + rec.getBase()) * 2;
        System.out.println("El perimetro es " + X);

    }

    public void recuadro(Rectangulo rec) {

        double a = rec.getAltura();
        int A = (int) a;
        double b = rec.getBase();
        int B = (int) b;
        
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }

}
