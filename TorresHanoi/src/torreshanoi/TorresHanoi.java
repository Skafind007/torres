package torreshanoi;
import java.util.Scanner;

public class TorresHanoi {
  static int  cont=0;
   
      public static void torresDeHanoi(int n, String origen, String  auxiliar, String destino) {
        
   
        if (n == 1) {
            System.out.println("Mover disco 1 de la torre " + origen + " a la torre " + destino);
 cont++;
            return;
        }
        torresDeHanoi(n - 1, origen, destino, auxiliar);
        System.out.println("Mover disco " + n + " de la torre " + origen + " a la torre " + destino);
        cont++;
        torresDeHanoi(n - 1, auxiliar, origen, destino);
        
    }
     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite el numero de discos");
        int n=sc.nextInt();
       torresDeHanoi(n, "A","b","c");
         System.out.println("El numero total de movimientos es: "+cont);
    }
}
