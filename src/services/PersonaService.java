/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package services;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Kidver
 */
public class PersonaService {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void crearPer(Persona per) {
        System.out.println("Vas a crear un nuevo caracter\n"
                + "Ingrese los datos solicidatos");
        System.out.print("ID: ");
        per.setID(scan.nextInt());
        System.out.println("Nombre: ");
        per.setNombre(scan.next());
        //System.out.println("");
        System.out.println("Edad: ");
        per.setEdad(scan.nextInt());
        char SX;
        do {
            System.out.println("Sexo: H.(hombre) M.(mujer) O.(otro))");
            SX = Character.toUpperCase(scan.next().charAt(0));
            if ((!(SX == 'H' || SX == 'M' || SX == 'O'))) {
                System.out.println("Caracter para sexo erroneo");
            }

        } while (!(SX == 'H' || SX == 'M' || SX == 'O'));

        per.setSexo(SX);
        System.out.println("Peso (KG): ");
        per.setPeso(scan.nextInt());
        System.out.println("Altura (mt): ");
        per.setAltura(scan.nextFloat());

    }
//• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.

    public int calcularIMC(Persona per) {
        double alt = per.getAltura();
        double pes = per.getPeso();
        double IMC = (pes / (Math.pow(alt, 2)));
        System.out.println("IMC: " + IMC);
        if (IMC < 20) {
            //System.out.println(per.getNombre() + " Se encuentra por debajo del peso ideal");
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            // System.out.println(per.getNombre() + " esta en su peso ideal");
            return 0;
        } else {
            // System.out.println(per.getNombre() + " se encuentra en sobre peso");
            return 1;
        }
    }
//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
//un booleano.

    public boolean esMayorDeEdad(Persona per) {
        int edad = per.getEdad();
        boolean boo = false;
        if (edad >= 18) {
            boo = true;
        }
        return boo;
    }

//////////////////////    
}
