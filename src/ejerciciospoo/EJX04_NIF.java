/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo;

import Entidad.NIF;
import services.ServicioNIF;

/**
 *
 * @author Kidver
 */
public class EJX04_NIF {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        ServicioNIF serv = new ServicioNIF();
        NIF n = serv.crearNIF();
        System.out.println("NIF: +");
        
        serv.mostrar(n);
        
    }

}
    

