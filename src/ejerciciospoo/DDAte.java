/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo;

import Entidad.fecha;
import java.time.LocalDate;
import java.util.Scanner;
import services.DateService;

/**
 *
 * @author Kidver
 */
public class DDAte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        DateService ser = new DateService();
        LocalDate fechaAct = LocalDate.now();
//        int dia;
//        int mes;
//        int anio;
//        System.out.println("Ingrese el año");
//        dia = scan.nextInt();
//        mes = scan.nextInt();
//        anio = scan.nextInt();

        fecha fechaUsu = ser.crearFecha();
        System.out.println(fechaUsu);
        
        ser.diferenciaFecha(fechaAct, fechaUsu);
        
        
        

    }

}
