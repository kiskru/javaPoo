/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Entidad.fecha;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Kidver
 */
public class DateService {

    Scanner scan = new Scanner(System.in);

    public fecha crearFecha() {
        System.out.println("Ingrese los datos de tu fecha");
        System.out.println("año");
        int anios = scan.nextInt();
        System.out.println("mes");
        int mes = scan.nextInt();
        System.out.println("dia");
        int dia = scan.nextInt();
        return new fecha(anios, mes, dia);
    }

    public void diferenciaFecha(LocalDate a, fecha i) {
        LocalDate FU=LocalDate.of(i.getAnio(), i.getMes(), i.getDia());
        //System.out.println(a.minus(FU));
        System.out.println(a.compareTo(FU));
        System.out.println("Chronology");
        System.out.println(a.until(FU));
    }
}
