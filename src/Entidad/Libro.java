/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
 */
package Entidad;

/**
 *
 * @author Kidver
 */
public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numPag;
//constructor vacio
    public Libro() {
    }
//contructor con parametros
    public Libro(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPag() {
        return numPag;
    }

    
    
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + '}';
    }

    
    
}
