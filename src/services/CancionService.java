/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author Kidver
 */
public class CancionService {
    Scanner scan=new Scanner(System.in);
    public Cancion crearCancion(){
        
        System.out.println("Ingrese el titulo");
        String titulo=scan.nextLine();
        System.out.println("Ingrese el autor");
        String autor=scan.nextLine();
        
      return new Cancion (titulo,autor);  
    }
    
    
    
    
    
    
    
}
