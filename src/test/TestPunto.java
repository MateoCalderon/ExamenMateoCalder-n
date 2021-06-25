
package test;

import dominio.Punto;
import java.util.Scanner;

public class TestPunto {
    static Scanner datos=new Scanner(System.in);
    public static void main(String[] args){
      System.out.println("Cuantas coordenadas desea saber: ");
        int mov = datos.nextInt();
        Punto [] pto  = new Punto [mov];
        System.out.println("Los movimientos son: ");
        coordenadaSalida(pto);
         
        
    }
    public static void coordenadaSalida(Punto pto[]){
        int punto=0 ;
        System.out.println("Las coordenadas en el punto inicial es: "+punto+","+punto);
        for(int i=0; i<pto.length;i++){
        System.out.println("La coordenada N°: "+(i+1)+" : "+(int)(Math.random()* (10+1))+ "  , "+(int)(Math.random() * (10+1))); 
        }
    }
    public static void sumaDistancia(Punto pto[]){
        int n=0;
    }
}
