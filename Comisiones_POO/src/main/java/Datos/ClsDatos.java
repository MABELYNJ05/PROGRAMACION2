
package Datos;

import Modelos.ModVendedor;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ClsDatos {
    
    public List<ModVendedor> lista=new ArrayList<ModVendedor>();
    private int nom=0;
    private Scanner entrada=new Scanner(System.in); 
    private String s;
    
    public void UltimoMsj(){
        System.out.println("\n\nSi desea regresar al Menú, ingrese la palabra 'M' : ");    
        String palabra=entrada.nextLine();
        palabra=entrada.nextLine();
        
        if(palabra.contains("M")){ 
            try{           
                Robot presrobt=new Robot();
                presrobt.keyPress(KeyEvent.VK_CONTROL);
                presrobt.keyPress(KeyEvent.VK_L);
                presrobt.keyRelease(KeyEvent.VK_CONTROL);
                presrobt.keyRelease(KeyEvent.VK_CONTROL);           
            }catch(Exception e){
                System.out.println(""+e.getMessage());
            }
            Menu();            
        }
    }
    
    public void MostrarDatos(){
        System.out.println("NOMBRE\t\tENERO\t\tFEBRERO\t\tMARZO\t\tTOTAL\t\tPROMEDIO");
        for(ModVendedor e:lista){
            System.out.print(e.nombre+"\t\tQ."+e.enero+"\t\tQ."+e.febrero+"\t\tQ."+e.marzo+"\t\tQ."+e.total+"\t\tQ."+e.promedio);
            System.out.print("\n");         
        }        
                
    }
       
    
    public void IngresoDatos(){
        ModVendedor vendedor= new ModVendedor();
        System.out.println("¿Cuantos datos desea ingresar?");
        int opcion=entrada.nextInt();
        
        for (int i = 0; i < opcion; i++) {            
            System.out.println("Ingrese nombre "+(++nom)+":");
            s=entrada.nextLine();
            vendedor.nombre=entrada.nextLine();
            System.out.println("Ingrese Enero: ");
            vendedor.enero=entrada.nextDouble();
            System.out.println("Ingrese Febrero: ");
            vendedor.febrero=entrada.nextDouble();
            System.out.println("Ingrese Marzo: ");
            vendedor.marzo=entrada.nextDouble();             
            vendedor.total=vendedor.enero+vendedor.febrero+vendedor.marzo;
            vendedor.promedio=vendedor.total/3; 
            lista.add(vendedor); 
            vendedor=new ModVendedor();
        }                                      
    }
    
    public void NumMax(){
        double mayor=0;
        double num=0;
        double enero=0;
        double febrero=0;
        double marzo=0;
        
        for(ModVendedor e: lista){
           
            enero=e.enero;
            febrero=e.febrero;
            marzo=e.marzo;
            if (enero > num && enero > febrero && enero > marzo)
            {
                mayor=enero;   
                
            }else if(febrero > num && febrero > enero && febrero > marzo){
                
                mayor=febrero;
                
            }else if(marzo > num && marzo > enero && marzo > febrero){
                
                mayor=marzo;
            }
            num=mayor;
            
        }       
        
        System.out.println("LA VENTA MAXIMA EN LOS TRES MESES FUE DE: Q."+mayor+".00\n\n");
        
    }
    
    public void NumMaXMes(){
        System.out.println("\n\t\t\t¿Que mes desea consultar?");
        System.out.println("\n\n\t1. ENERO");
        System.out.println("\n\n\t2. FEBRERO");
        System.out.println("\n\n\t3. MARZO");
        String opn=entrada.nextLine();
        opn=entrada.nextLine();
        double num=0;
        double mayor=0;
        String mes="";
        try{
            
            int opcion=Integer.parseInt(opn);            
            for (ModVendedor e: lista) {
                if(opcion==1){ 
                    mes="Enero";
                    num=e.enero;
                    if(num>mayor){
                        mayor=num;
                    }
                }else if(opcion==2){
                    mes="Febrero";
                    num=e.febrero;
                    if(num>mayor){
                        mayor=num;
                    }
                }else if(opcion==3){
                    mes="Marzo";
                    num=e.marzo;
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
                
    }
    
    public void NumMinXMes(){
        System.out.println("\n\t\t\t¿Que mes desea consultar?");
        System.out.println("\n\n\t1. ENERO");
        System.out.println("\n\n\t2. FEBRERO");
        System.out.println("\n\n\t3. MARZO");
        String opn=entrada.nextLine();
        opn=entrada.nextLine();
        double num=0;
        double menor=0;
        String mes="";
        try{
            
            int opcion=Integer.parseInt(opn);
            for(ModVendedor e: lista){
                if(opcion==1){
                    menor=e.enero;
                }else if(opcion==2){
                    menor=e.febrero;
                }else if(opcion==3){
                    menor=e.marzo;
                }else{
                    System.out.println("Opcion incorrecta");
                }
            }

            for (ModVendedor e: lista) {
                if(opcion==1){ 
                    mes="Enero";
                    num=e.enero;
                    if(num<menor){
                        menor=num;
                    }
                }else if(opcion==2){
                    mes="Febrero";
                    num=e.febrero;
                    if(num<menor){
                        menor=num;
                    }
                }else if(opcion==3){
                    mes="Marzo";
                    num=e.marzo;
                    if(num<menor){
                        menor=num;
                    }
                }
                
            }            
            
            System.out.println("LA VENTA MINIMA DEL MES DE "+mes+" es de Q."+menor+".00");
            
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }
        
    }
    
    public void BuscarXCantidad(){
        System.out.println("INGRESE CANTIDAD A BUSCAR: ");
        int cantidad=entrada.nextInt();  
        int buscador;
        String Persona="";
        String mes="";
        
        for()
        
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
        
    }
    
    public void Menu(){               
        System.out.print("\n\t\t\t\tSelecciona una Opcion");
        System.out.println("\n\t\t1. INGRESAR DATOS ");
        System.out.println("\n\t\t2. VENTA MAXIMA POR MES");
        System.out.println("\n\t\t3. VENTA MINIMA POR MES");
        System.out.println("\n\t\t4. VENTA MAXIMA TOTAL");
        System.out.println("\n\t\t5. MOSTRAR DATOS y ACTUALIZAR");
        System.out.println("\n\t\t6. BUSCAR POR CANTIDAD");
        System.out.println("\n\t\t7. EDITAR");               
        int op=entrada.nextInt();

        try{                        
            
            switch(op){
            case 1:
                IngresoDatos();                
                UltimoMsj();
                break;          
            case 2:
                NumMaXMes();
                UltimoMsj();
                break;
            case 3:
                NumMinXMes();
                UltimoMsj();
                break;
            case 4:
                NumMax();
                UltimoMsj();
                break;
            case 5:
                MostrarDatos();
                UltimoMsj();
                break;
            case 6:
                BuscarXCantidad();
                break;
            case 7:
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

    
}
