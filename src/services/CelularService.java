package services;

import Entidad.Celular;
import java.util.Scanner;

public class CelularService {

    Scanner scan = new Scanner(System.in);

    public Celular cargarCelular() {
        System.out.println("Ingrese marca del celular");
        String Marca = (scan.nextLine());
        System.out.println("Ingrese el costo:");
        double Precio = (scan.nextDouble());
        System.out.println("Ingrese modelo");
        String Modelo = (scan.next());
        System.out.println("Memoria Ram");
        int MemoriaRam = (scan.nextInt());
        System.out.println("Almacenamiento");
        int Almacenamiento = (scan.nextInt());
        return new Celular(Marca, Precio, Modelo, MemoriaRam, Almacenamiento);
    }

    public void ingresarCodigo(Celular cc) {
        System.out.println("Codigo numerico de 7");
        int aux = scan.nextInt();
        int[] nuevo = new int[7];
        String num = String.valueOf(aux);
        for (int i = 0; i < num.length(); i++) {
            nuevo[i] = Integer.parseInt(num.substring(i, i + 1));

        }
        cc.setCodigo(nuevo);
    }

    public void mostrarDatos(Celular cc) {
        System.out.println("Marca: " + cc.getMarca());
        System.out.println("Precio: " + cc.getPrecio());
        System.out.println("Modelo: " + cc.getModelo());
        System.out.println("Ram: " + cc.getMemoriaRam());
        System.out.println("Almacenamiento: " + cc.getAlmacenamiento());
        System.out.print("Codigo: ");
        for (int i = 0; i < cc.getCodigo().length; i++) {

            System.out.print(cc.getCodigo()[i]);
        }
        System.out.println("");

    }

}
