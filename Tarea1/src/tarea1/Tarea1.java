
package tarea1;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Tarea1 {
  
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nom=entrada.nextLine();
        System.out.print("Ingresa la cantidad a convertir: Q.");
        int cantidad=entrada.nextInt();
        System.out.println("\t\nIngresa el numero de la opcion ha convertir");
        System.out.println("1. Dolar\n2. Euro\n3. Yuan");
        byte opcion=entrada.nextByte();
        
        double mostrarNum;
        DecimalFormat format = new DecimalFormat("#.00");

        switch (opcion){
            
            case 1 -> {
                mostrarNum=cantidad*0.12924298;
                System.out.println(nom+", Q."+cantidad+".00 equivale a "+format.format(mostrarNum)+" dolares");
            }
            
            case 2 -> {
                mostrarNum=cantidad*0.1094044;
                System.out.println(nom+", Q."+cantidad+".00 equivale a "+format.format(mostrarNum)+" euros");
            }
            
            case 3 -> {
                mostrarNum=cantidad*0.83470644;
                System.out.println(nom+", Q."+cantidad+".00 equivale a "+format.format(mostrarNum)+" yuanes");
            }
                
        }

    }
    
}
