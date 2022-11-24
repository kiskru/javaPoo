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
package services;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Kidver
 */
public class CadenaService {

    Scanner scan = new Scanner(System.in);

    // a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public int mostrarVocales(Cadena cad) {
        int vocales = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            char letra = Character.toUpperCase(cad.getFrase().charAt(i));
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                vocales++;
            }
        }

        return vocales;
    }
    //b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    //ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

    public String invertirFrase(Cadena cad) {
        String newFrase = "";

        for (int i = cad.getLongitud(); i > 0; i--) {
            newFrase = newFrase.concat(cad.getFrase().substring(i - 1, i));
        }
        return newFrase;
    }
//     Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

    public int vecesRepetido(Cadena cad, String x) {
        int veces = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i, i + 1).equals(x)) {
                veces++;
            }
        }

        return veces;
    }
//    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.

    public void compararLongitud(Cadena cad, String frase) {
        if (cad.getLongitud() < frase.length()) {
            System.out.println("La primer frase es mas corta");
        } else if (cad.getLongitud() == frase.length()) {
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("La primer frase es mas larga");
        }

    }
//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
//una nueva frase ingresada por el usuario y mostrar la frase resultante.

    public void unirFrases(Cadena cad, String frase) {
        System.out.println(cad.getFrase().concat(" ").concat(frase));
    }

    //g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
//frase resultante.
    public String reemplazar(String frase, String letra) {
        return frase.replaceAll("a", letra);
    }
    //h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public boolean contiene(String frase, String letra){
    return frase.contains(letra);
}
}
