/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo;

import java.util.Scanner;
import services.MesService;

/**
 *
 * @author Kidver
 */
public class EJX05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MesService ser = new MesService();
//        for (int i = 0; i < 12; i++) {
//            System.out.println(ser.crearVector()[i]);
//        }
//        System.out.println("________________");
        String[] mes = ser.crearVector();
        for (String as : mes) {
            System.out.println(as);
        }
        String mesSecreto = ser.crearVector()[(int) (Math.random() * 12)];
        System.out.println(mesSecreto);
        System.out.println("Adivina el mes secreto: ");
        String res;
       
        do {
            res = scan.next();
            if (res.equals(mesSecreto)) {
                System.out.println("Felicidades!!! adivinaste.");
            }else{
            System.out.println("Fallaste, " + res + " no es el mes secreto.\n"
                    + "Intente nuevamente:");
            }
        } while (!res.equals(mesSecreto));

        // TODO code application logic here
    }
}
