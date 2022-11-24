/* Método area(): para calcular el área de la circunferencia (area = pi ∗ radio^2).
e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ radio).
 */
package services;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Kidver
 */
public class CircunferenciaService {

    Scanner scan = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {
        System.out.println("Ingrese el radio de la cirunferencia");
        double radio = scan.nextDouble();

        return new Circunferencia(radio);
    }

    public void area(Circunferencia cir) {
        double area = (Math.PI * Math.pow(cir.getRadio(),2));
        System.out.println("El area es: " + area);
    }

    public double perimetro(Circunferencia cir){
        double per = (2*Math.PI)*cir.getRadio();
        return per;
    }
    
    
}
