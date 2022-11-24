/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package services;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Kidver
 */
public class OperacionService {

    Scanner scan = new Scanner(System.in);

    public Operacion crearOperacion() {
        System.out.println("Ingrese el num 1");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el num 2");
        int num2 = scan.nextInt();
        return new Operacion(num1, num2);
    }

    public int suma(Operacion ope) {

        return ope.getNum1() + ope.getNum2();
    }

    public int resta(Operacion ope) {

        return ope.getNum1() - ope.getNum2();
    }

    public int multip(Operacion ope) {

        if ((ope.getNum1() == 0) || (ope.getNum2() == 0)) {
            System.out.println("Error al multiplicar uno de los valores es 0");
            return 0;
        } else {
            return (int) ope.getNum1() * ope.getNum2();
        }
    }

    public double dividir(Operacion ope) {

        if (ope.getNum2() == 0) {
            System.out.println("Error al dividir no se puede dividir entre 0");
            return 0;
        } else {
            double res=((double)ope.getNum1() / (double)ope.getNum2());
            return res;
        }
    }
}
