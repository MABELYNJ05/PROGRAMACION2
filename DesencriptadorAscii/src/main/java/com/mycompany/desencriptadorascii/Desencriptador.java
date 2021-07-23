
package com.mycompany.desencriptadorascii;

import java.util.Scanner;

public class Desencriptador {
    
    private static Scanner entrada=new Scanner(System.in);
  
    public static String Descodificador(String palabra,int llave){

        int codificar;       
        String resultado="";
        
        
        for(int i=0; i<palabra.length(); i++){
            codificar=(int)palabra.charAt(i);
            codificar=codificar-llave;
            char caracter=(char)codificar;
            resultado=resultado+caracter;
        }
        
        return resultado;
        
        
    }
    public static void main(String[] args) {
        
        System.out.println("Ingresa una palabra: ");    
        String pal=entrada.nextLine();
        
        String res= Descodificador(pal,9);
        System.out.println("Palabra decodificada= "+res);

    }
    
}
