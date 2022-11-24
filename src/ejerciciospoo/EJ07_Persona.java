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
package ejerciciospoo;

import Entidad.Persona;
import services.PersonaService;

/**
 *
 * @author Kidver
 */
public class EJ07_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaService perSer = new PersonaService();

//     A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
//sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
//mayor de edad.   
        Persona P1 = new Persona();
        perSer.crearPer(P1);
        System.out.println(P1);
        System.out.println(perSer.calcularIMC(P1));
        System.out.println(P1.getNombre() + " es mayo de edad "
                + perSer.esMayorDeEdad(P1));
        Persona P2 = new Persona(222, "persona 2", 45, 'M', 100, (float) 1.6);
        System.out.println(P2);
        System.out.println(perSer.calcularIMC(P2));
        System.out.println(P2.getNombre() + " es mayo de edad "
                + perSer.esMayorDeEdad(P2));
        Persona P3 = new Persona(333, "Persona 3", 18, 'O', 45, (float) 1.7);
        System.out.println(P3);
        System.out.println(perSer.calcularIMC(P3));
        System.out.println(P3.getNombre() + " es mayo de edad "
                + perSer.esMayorDeEdad(P3));
        Persona P4 = new Persona(444, "Persona 4", 10, 'H', 30, (float) 0.9);
        System.out.println(P4);
        System.out.println(perSer.calcularIMC(P4));
        System.out.println(P4.getNombre() + " es mayo de edad ["
                + perSer.esMayorDeEdad(P4)+"]");

//        Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
        int[] arregloPeso = new int[4];
        arregloPeso[0] = perSer.calcularIMC(P1);
        arregloPeso[1] = perSer.calcularIMC(P2);
        arregloPeso[2] = perSer.calcularIMC(P3);
        arregloPeso[3] = perSer.calcularIMC(P4);


        int bajo = 0;
        int ideal = 0;
        int alto = 0;
        for (int i = 0; i < 4; i++) {
            switch (arregloPeso[i]) {
                case -1:
                    bajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                case 1:
                    alto++;
                    break;
            }
        }

        System.out.println("El " + bajo*(100/4)+"% de las personas estan por debajo del peso ideal");
        System.out.println("El " + ideal*(100/4)+"% de las personas estan en el peso ideal");
        System.out.println("El " + alto*(100/4)+"% de las personas estan estado de sobrepeso");
        
        boolean[] arregloEdad = new boolean[4];
        arregloEdad[0] = perSer.esMayorDeEdad(P1);
        arregloEdad[1] = perSer.esMayorDeEdad(P2);
        arregloEdad[2] = perSer.esMayorDeEdad(P3);
        arregloEdad[3] = perSer.esMayorDeEdad(P4);
        
        int mayor=0, menor=0;
        for (int i = 0; i < 4; i++) {
            if (arregloEdad[i]==true) {
                mayor++;
            }else{
                menor++;
            }           
        }
        System.out.println("El "+mayor*(100/4)+"% de las personas es mayor de edad.");
        System.out.println("El "+menor*(100/4)+"% de las personas es menor de edad.");
        
        
        

/////////
    }

}
