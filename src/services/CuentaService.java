/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package services;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Kidver
 */
public class CuentaService {

    Scanner scan = new Scanner(System.in);

    public Cuenta crearCuenta() {
        System.out.println("Ingrese el numero de cuenta: ");
        int numCuenta = scan.nextInt();
        System.out.println("Ingrese su DNI: ");
        int DNI = scan.nextInt();
        System.out.println("Ingrese el deposito inicial: ");
        int saldo = scan.nextInt();

        return new Cuenta(numCuenta, DNI, saldo);
    }

    /// d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    //y se la sumara a saldo actual.
    public int ingresar(Cuenta cuenta) {
        System.out.println("Sistema de depositos");
        System.out.println("Cuanto dinero desea depositar?");
        int dep = scan.nextInt();
        int newSaldo = cuenta.getSaldo() + dep;
        cuenta.setSaldo(newSaldo);
        return newSaldo;
    }

    //   e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
    //restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
    //saldo actual en 0.
    public void retirar(Cuenta cuenta) {
        System.out.println("Sistema de retiro");
        System.out.println("Cuanto dinero desea Retirar?");
        int ret = scan.nextInt();
        int saldo = cuenta.getSaldo();
        if (saldo < ret) {
            System.out.println("Saldo insuficiente");
            System.out.println("La cantidad retirada es: " + cuenta.getSaldo());
            cuenta.setSaldo(0);
            System.out.println("Saldo: " + cuenta.getSaldo());
        } else {
            System.out.println("Operacion exitosa");
            cuenta.setSaldo(saldo - ret);
            System.out.println("su saldo es: " + cuenta.getSaldo());
        }
    }
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.

    public void extRapida(Cuenta cuenta) {
        int saldo = cuenta.getSaldo();
        int ret;
        System.out.println("Sistema de retiro rapido.");
        System.out.println("");
        System.out.println("Cuanto desea retirar?");
        ret = scan.nextInt();
        while (ret > (cuenta.getSaldo() * 0.2)) {
            System.out.println("Cantidad permitida excedida");
            System.out.println("Intente nuevamente");
            System.out.println("Cuanto desea retirar?");
            ret = scan.nextInt();
        }

        System.out.println("Operacion exitosa");
        cuenta.setSaldo(saldo - ret);
        System.out.println("su saldo es: " + cuenta.getSaldo());
    }
    public void saldo(Cuenta cuenta){
        System.out.println("Sistema de informacion");
        System.out.println("El saldo de tu cuenta es: "+cuenta.getSaldo());
    }
    public void datos(Cuenta cuenta){
        System.out.println("Sistema de informacion");
        System.out.println("Datos de la cuenta:");
        System.out.println(cuenta.toString());
    }
}
