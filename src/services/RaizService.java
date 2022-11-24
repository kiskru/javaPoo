
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Entidad.Raiz;
import java.util.Scanner;

/**
 *
 * @author Kidver
 */
public class RaizService {

    Scanner leer = new Scanner(System.in);

    public Raiz crearRaiz() {
        System.out.println("Ingrese el valor de los tres coeficientes");
        double a = leer.nextDouble();
        double b = leer.nextDouble();
        double c = leer.nextDouble();

        return new Raiz(a, b, c);
    }

    public double getDiscriminante(Raiz r) {
        double discri = (Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());
        return discri;
    }

    public boolean tieneRaices(Raiz discri) {
        double a = getDiscriminante(discri);
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
//D>0 Dos soluciones reales distintas.
//D=0 Dos soluciones reales iguales. (Una solución.)
//D<0 No hay solución real.
    }

    public boolean tieneRaiz(Raiz discri) {
        double a = getDiscriminante(discri);
        if (a == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices(Raiz x) {
        boolean z;
        z = tieneRaices(x);
        double a = x.getA();
        double b = x.getB();
        double c = x.getC();
        if (z == true) {
            System.out.println("primer solucion");
            System.out.println((-b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a));
            System.out.println("segunda solucion");
            System.out.println((-b - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a));
        }
    }

    public void obtenerRaiz(Raiz x) {
        boolean z;
        z = tieneRaiz(x);
        double a = x.getA();
        double b = x.getB();
        double c = x.getC();
        if (z == true) {
            System.out.println("La solucion es: ");
            System.out.println((-b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a));
        }
    }

    public void calcular(Raiz x) {
        double a = x.getA();
        double b = x.getB();
        double c = x.getC();
        if (tieneRaiz(x) == true) {
            obtenerRaiz(x);
        } else {
            if (tieneRaices(x) == true) {
                obtenerRaices(x);
            } else {
                System.out.println("La ecuacion no tiene solucion real.");
            }

        }
    }
}
