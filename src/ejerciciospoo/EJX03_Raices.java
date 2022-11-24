/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo;

import Entidad.Raiz;
import services.RaizService;

/**
 *
 * @author Kidver
 */
public class EJX03_Raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RaizService ser = new RaizService();
        Raiz R1 = ser.crearRaiz();
        System.out.println(R1);
        System.out.println("El valor del discriminatnte es \n"
                + ser.getDiscriminante(R1));
        System.out.println("El metodo tiene mas de una solucion? " + ser.tieneRaices(R1));
        System.out.println("El metodo tiene una unica solucion? " + ser.tieneRaiz(R1));

        ser.obtenerRaices(R1);
        ser.obtenerRaiz(R1);
        
        
        System.out.println("metodo calcular final");
        ser.calcular(R1);
        
    }

}
