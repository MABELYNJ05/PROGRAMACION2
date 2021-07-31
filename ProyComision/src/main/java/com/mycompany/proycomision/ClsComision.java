
package com.mycompany.proycomision;

import java.util.Scanner;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class ClsComision {

    private static Scanner entrada=new Scanner(System.in);
        
    
    private static String[][] comisiones=new String[3][6];     
    private static final int NOMBRE=0;
    private static final int ENERO=1;
    private static final int FEBRERO=2;
    private static final int MARZO=3;
    private static final int TOTAL=4;
    private static final int PROMEDIO=5;
    private static int nom=0;
    private static int fila=0;

    

   public static void LimpiarPantalla(){
       try{           
           Robot presrobt=new Robot();
           presrobt.keyPress(KeyEvent.VK_CONTROL);
           presrobt.keyPress(KeyEvent.VK_L);
           presrobt.keyRelease(KeyEvent.VK_CONTROL);
           presrobt.keyRelease(KeyEvent.VK_CONTROL);
           
       }catch(Exception e){
           System.out.println(""+e.getMessage());
       }
              
   }        
   
    public static void cargaInformacion(){
        System.out.println("Ingrese nombre "+(++nom)+":");
        comisiones[fila][NOMBRE]=entrada.nextLine();
        System.out.println("Ingrese Enero: ");
        comisiones[fila][ENERO]=entrada.nextLine();
        System.out.println("Ingrese Febrero: ");
        comisiones[fila][FEBRERO]=entrada.nextLine();
        System.out.println("Ingrese Marzo: ");
        comisiones[fila][MARZO]=entrada.nextLine();
        fila++;
        UltimoMsj();
        
    }
      
    
    public static void MostrarDatos(){
        System.out.println("NOMBRE\t\tENERO\t\tFEBRERO\t\tMARZO\t\tTOTAL\t\tPROMEDIO");
        for(int x =0; x<comisiones.length;x++ ){
            System.out.print(comisiones[x][NOMBRE]+"\t\tQ."+comisiones[x][ENERO]+".00\t\tQ."+comisiones[x][FEBRERO]+".00\t\tQ."+comisiones[x][MARZO]+".00\t\tQ."+comisiones[x][TOTAL]+".00\t\tQ."+comisiones[x][PROMEDIO]);
            System.out.print("\n");         
        }
        
        UltimoMsj();
        
    }
    
    public static void IngresoDatosRapido(){
        for (int i = 0; i < 3; i++) {            
        System.out.println("Ingrese nombre "+(++nom)+":");
        comisiones[i][NOMBRE]=entrada.nextLine();
        System.out.println("Ingrese Enero: ");
        comisiones[i][ENERO]=entrada.nextLine();
        System.out.println("Ingrese Febrero: ");
        comisiones[i][FEBRERO]=entrada.nextLine();
        System.out.println("Ingrese Marzo: ");
        comisiones[i][MARZO]=entrada.nextLine();
        }                      
        
        UltimoMsj();
    }
       

    public static void TotProm(){
        int suma=0;
        double promedio;
        DecimalFormat format = new DecimalFormat("#.00");
        String matriz[][]=new String [3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <4 ; j++) {
                
                suma+=Integer.parseInt(comisiones[i][j]);
                matriz[i][0]=Integer.toString(suma); 
                comisiones[i][TOTAL]=matriz[i][0];
                
            }
            promedio=suma/3;
            matriz[i][1]=String.valueOf(format.format(promedio));
            comisiones[i][PROMEDIO]=matriz[i][1];
            suma=0;
        }                
        
        MostrarDatos();
    }
    
    public static void NumMax(){
        int mayor=0;
        int num=0;        
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 4; j++) {                
                num=Integer.parseInt(comisiones[i][j]);
                if(num>mayor){
                    mayor=num;                    
                }                                
            }
        }
        
        System.out.println("LA VENTA MAXIMA EN LOS TRES MESES FUE DE: Q."+mayor+".00\n\n");
        UltimoMsj();
    }
    
    public static void NumMaXMes(){
        System.out.println("\n\t\t\t¿Que mes desea consultar?");
        System.out.println("\n\n\t1. ENERO");
        System.out.println("\n\n\t2. FEBRERO");
        System.out.println("\n\n\t3. MARZO");
        String opn=entrada.nextLine();
        int num=0;
        int mayor=0;
        String mes="";
        try{
            
            int opcion=Integer.parseInt(opn);            
            for (int i = 0; i < 3; i++) {
                if(opcion==1){ 
                    mes="Enero";
                    num=Integer.parseInt(comisiones[i][opcion]);
                    if(num>mayor){
                        mayor=num;
                    }
                }else if(opcion==2){
                    mes="Febrero";
                    num=Integer.parseInt(comisiones[i][opcion]);
                    if(num>mayor){
                        mayor=num;
                    }
                }else if(opcion==3){
                    mes="Marzo";
                    num=Integer.parseInt(comisiones[i][opcion]);
                    if(num>mayor){
                        mayor=num;
                    }
                }else{
                    System.out.println("OPCION INCORRECTA");
                }                                
            }            
            
            System.out.println("LA VENTA MAXIMA DEL MES DE "+mes+" es de Q."+mayor+".00");
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }
        
        UltimoMsj();
        
    }
    
    public static void NumMinXMes(){
        System.out.println("\n\t\t\t¿Que mes desea consultar?");
        System.out.println("\n\n\t1. ENERO");
        System.out.println("\n\n\t2. FEBRERO");
        System.out.println("\n\n\t3. MARZO");
        String opn=entrada.nextLine();
        int num=0;
        int menor=0;
        String mes="";
        try{
            
            int opcion=Integer.parseInt(opn);  
            menor=Integer.parseInt(comisiones[0][opcion]);

            for (int i = 1; i < 3; i++) {
                if(opcion==1){ 
                    mes="Enero";
                    num=Integer.parseInt(comisiones[i][opcion]);
                    if(num<menor){
                        menor=num;
                    }
                }else if(opcion==2){
                    mes="Febrero";
                    num=Integer.parseInt(comisiones[i][opcion]);
                    if(num<menor){
                        menor=num;
                    }
                }else if(opcion==3){
                    mes="Marzo";
                    num=Integer.parseInt(comisiones[i][opcion]);
                    if(num<menor){
                        menor=num;
                    }
                }else{
                    System.out.println("OPCION INCORRECTA");
                }                                
            }            
            
            System.out.println("LA VENTA MINIMA DEL MES DE "+mes+" es de Q."+menor+".00");
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }
        
        UltimoMsj();
    }
    
    public static void BuscarXCantidad(){
        System.out.println("INGRESE CANTIDAD A BUSCAR: ");
        int cantidad=entrada.nextInt();  
        int buscador;
        String Persona="";
        String mes="";
        
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 4; j++) {
                buscador=Integer.parseInt(comisiones[i][j]);
                if(cantidad==buscador){
                    Persona=comisiones[i][0];
                    mes = switch (j) {
                        case 1 -> "ENERO";
                        case 2 -> "FEBRERO";
                        default -> "MARZO";
                    };
                }                                                
            }                        
        }                
        
        System.out.println(""+Persona+" vendió Q."+cantidad+".00 "+"en el mes de "+mes);
        
        UltimoMsj();
        UltimoMsj();
    }
    
    public static void EditarNom(){        
        
        System.out.println("Ingrese el nombre de la persona que desea editar: ");
        String nom=entrada.nextLine();
        String nombre=entrada.nextLine();
        System.out.println("Ingrese el nuevo Nombre: ");
        String newNom=entrada.nextLine();
        
        for (int i = 0; i < 3; i++) {            
            String buscador=comisiones[i][NOMBRE];
            if(nombre.equalsIgnoreCase(buscador)){
                comisiones[i][NOMBRE]=newNom;
             }
            
        }                  
        
        System.out.println("POR FAVOR ACTUALIZAR DATOS");
        UltimoMsj();
    }
    
    public static void EditarCant(){
        System.out.println("\t\t\tIngrese la cantidad a modificar");
        int cantidad =entrada.nextInt();
        System.out.println("\t\t\tIngrese la nueva cantidad");
        int newcantidad =entrada.nextInt();
        System.out.println("\t\t\t¿De que mes desea modificar el dato?");
        System.out.println("\n\n\t\t1. ENERO");
        System.out.println("\n\n\t\t2. FEBRERO");
        System.out.println("\n\n\t\t3. MARZO");
        int mesopc=entrada.nextInt();
        int buscador=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 4; j++) {  
                buscador=Integer.parseInt(comisiones[i][j]);                
                switch(mesopc){
                case 1 -> {       
                    if(cantidad==buscador){
                        comisiones[i][j]=String.valueOf(newcantidad);
                    }
                    }
                case 2 -> {
                    if(cantidad==buscador){
                        comisiones[i][j]=String.valueOf(newcantidad);
                    }
                    }
                case 3 -> {
                    if(cantidad==buscador){
                        comisiones[i][j]=String.valueOf(newcantidad);
                    }
                    }
                }
            }
        }
             
        System.out.println("\n\n\n");
        TotProm();        
        UltimoMsj();
        
    }    
    
    public static void UltimoMsj(){
        System.out.println("\n\nSi desea regresar al Menú, ingrese la palabra 'M' : ");    
        String palabra=entrada.nextLine();
        
        if(palabra.contains("M")){            
            LimpiarPantalla();
            Menu();            
        }
    }
    
    public static void Menu(){
        System.out.print("\n\t\t\t\tSelecciona una Opcion");
        System.out.println("\n\n\t\t1. INGRESAR UN DATO");
        System.out.println("\n\t\t2. INGRESAR DATOS ");
        System.out.println("\n\t\t3. VENTA MAXIMA POR MES");
        System.out.println("\n\t\t4. VENTA MINIMA POR MES");
        System.out.println("\n\t\t5. VENTA MAXIMA TOTAL");
        System.out.println("\n\t\t6. MOSTRAR DATOS y ACTUALIZAR");
        System.out.println("\n\t\t7. BUSCAR POR CANTIDAD");
        System.out.println("\n\t\t8. EDITAR");               
        String op=entrada.nextLine();

        try{
            
            int opcion=Integer.parseInt(op);
            
            switch(opcion){
            case 1:
                cargaInformacion();
                break;
            case 2:
                IngresoDatosRapido();
                break;
            case 3:
                NumMaXMes();
                break;
            case 4:
                NumMinXMes();
                break;
            case 5:
                NumMax();
                break;
            case 6:
                TotProm();
                break;
            case 7:
                BuscarXCantidad();
                break;
            case 8:
                System.out.println("Ingrese el numero de la opcion a editar");
                System.out.println("\n\t1. NOMBRE");
                System.out.println("\n\t2. CANTIDAD");
                int can=entrada.nextInt();
                
                switch(can){
                    case 1:
                        EditarNom();
                        break;
                    case 2:
                        EditarCant();
                        break;
                }
                
                break;
                                
        }
        }catch (Exception e){
            System.out.println(""+e);
        }
               

    }
    
    
    public static void main(String[] args) {
        
        Menu();       
        
    }
    
}
