/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */

package ejerciciospoo;

import Entidad.Cadena;
import java.util.Scanner;
import services.CadenaService;

/**
 *
 * @author Kidver
 */
public class EJ08_Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Cadena C1=new Cadena();
        CadenaService ser= new CadenaService();
        
        System.out.println("Escriba una frase.");
        C1.setFrase(scan.nextLine());
        C1.setLongitud(C1.getFrase().length());
        
        System.out.println(C1);
        System.out.println("");
        System.out.println("La cantidad de vocales es: "+ser.mostrarVocales(C1));        
        System.out.println("Frase invertida");
        System.out.println(ser.invertirFrase(C1));
        System.out.println("Ingrese una letra para contrala en la frase");
        String letra =scan.next().substring(0, 1);
        System.out.println(letra);
        System.out.println("la letra '"+letra+"' se repite "+ser.vecesRepetido(C1, letra)+" veces.");
        System.out.println("Ingrese una segunda frase");
        String frase =scan.next();  
        frase+=scan.nextLine();
        System.out.println("imprime la segunda frase");
        System.out.println(frase);
        ser.compararLongitud(C1, frase);
        System.out.println("Las frases unidas-> ");
        ser.unirFrases(C1, frase);
        System.out.println("letra a reemplazada");
        System.out.println(ser.reemplazar(frase, letra));
        if (ser.contiene(frase, letra)) {
            System.out.println("La letra si se encontro en la frase");
        }else{
            System.out.println("No se encontro la letra");
        }
        
    }
    
}
