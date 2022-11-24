/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
 */
package ejerciciospoo;

import Entidad.Libro;
import services.LibroService;

/**
 *
 * @author Kidver
 */
public class EJ01_Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LibroService libSer = new LibroService();
        
        
        
        System.out.println("Bienvenido al sistema de gestion de libros de la biblioteca Publica");
        System.out.println("Ingrese los datos solicitados acontinuacion:");
        Libro L1 = libSer.crearLibro();
        //mostrar directo
        System.out.println(L1.toString());
        System.out.println("por Metodo servicio");
        libSer.mostrarInfo(L1);
        
    }
    
}
