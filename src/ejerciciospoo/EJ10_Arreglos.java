/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ejerciciospoo;

import java.text.Normalizer;
import java.util.Arrays;
import services.ArregloService;

/**
 *
 * @author Kidver
 */
public class EJ10_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArregloService serv = new ArregloService();

        int[] A = new int[50];
        int[] B = new int[20];

        for (int i = 0; i < 50; i++) {
            A[i] = (int) (Math.random() * 9);

        }
       
        for (int i = 0; i < 50; i++) {
              System.out.print("["+A[i]+"]");
       }
        Arrays.sort(A);
        
        System.out.println("");
        System.out.println(" arreglo A organizado ");
        for (int i = 0; i <50; i++) {
              System.out.print("["+A[i]+"]");
       }
        
       
        System.out.println("");
        
        
        int[] C = Arrays.copyOfRange(A, 0, 10);
        for (int i = 10; i < 20; i++) {
            C[i]=9;
        }
        for (int i : C) {
            System.out.print(C + "]");
        }
        
        
        
        
//        for (int j = 0; j < 20; j++) {
////            if (j<10) {
////            B[j]=A[j];             
////            }else{
////                B[j]=9;
////            }
//            System.out.print(" "+B[j]);
//        }
 ////////////////////////////////////////////////////////////////////////////////       
    }
     
}
