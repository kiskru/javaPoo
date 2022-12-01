/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo;

import Entidad.Celular;
import services.CelularService;

/**
 *
 * @author Kidver
 */
public class EJ14_Celulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CelularService serv = new CelularService();
        Celular c1=serv.cargarCelular();
        serv.ingresarCodigo(c1);
        serv.mostrarDatos(c1);
    }
}
