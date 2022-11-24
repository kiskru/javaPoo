/*
*   Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
*   Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
*   constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
*   luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
*   numero de páginas.
*
 */
package services;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Kidver
 */
public class LibroService {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        System.out.print("ingrese el numero ISBN: ");
        int ISBN=scan.nextInt();
        System.out.print("ingrese el Titulo : ");
        String titulo=scan.next();
        System.out.print("ingrese el Nombre del autor: ");
        String autor=scan.next();
        System.out.print("ingrese el numero de paginas: ");
        int numPag=scan.nextInt();
        return new Libro(ISBN, titulo, autor, numPag);
    }

    public void  mostrarInfo(Libro LB){
        
        System.out.println("Informacion de libro:");
        System.out.println("ISBN-> " + LB.getISBN());
        System.out.println("Titulo-> " + LB.getTitulo());
        System.out.println("Autor-> "+ LB.getAutor());
        System.out.println("Numero de paginas-> "+LB.getNumPag());
        
                
    }
    
    
    
}
