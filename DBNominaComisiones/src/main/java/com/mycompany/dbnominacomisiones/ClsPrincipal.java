
package com.mycompany.dbnominacomisiones;

import dominio.mdVendedor;
import java.util.Scanner;
import operacionesNomina.OperacionesImpl;

public class ClsPrincipal {
    
    private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final OperacionesImpl objOp = new OperacionesImpl();
    
     public static void main(String[] args) {
        //Mientras la opcion elegida sea 0, preguntamos al usuario
        while (opcion != 0) {
            try {
                System.out.println("Elige opcion:\n1.- INGRESAR DATOS"
                        + "\n2.- MOSTRAR DATOS Y ACTUALIZAR\n"
                        + "3.- VENTA MAXIMA POR MES\n"
                        + "4.- VENTA MINIMA POR MES\n"
                        + "5.- VENTA MAXIMA TOTAL\n"
                        + "6.- BUSCAR POR CANTIDAD\n"
                        + "7.- ELIMINAR DATO\n"
                        + "8.- EDITAR\n"
                        + "0.- SALIR");

                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        //agregar informacion archivo
                        System.out.println("¿Cuantos datos desea ingresar?");
                        int opcion=scanner.nextInt();

                        for (int i = 0; i < opcion; i++) { 
                            mdVendedor vend = new mdVendedor();
                            System.out.println("Ingrese nombre "+i+":");                            
                            String nombre=scanner.nextLine();
                            vend.setNombre(scanner.nextLine());                            
                            System.out.println("Ingrese Enero: ");
                            vend.setEnero(scanner.nextDouble());
                            System.out.println("Ingrese Febrero: ");
                            vend.setFebrero(scanner.nextDouble());
                            System.out.println("Ingrese Marzo: ");
                            vend.setMarzo(scanner.nextDouble());
                            vend.setTotal(vend.getEnero()+vend.getFebrero()+vend.getMarzo());
                            vend.setPromedio(vend.getTotal()/3);
                            objOp.agregarDatos(vend);                            

                        }   
                        break;
                    case 2:
                        //listar catalogo completo
                        objOp.listar();
                        break;
                    case 3:
                        System.out.println("\n\t\t\t¿Que mes desea consultar?");
                        System.out.println("\n\n\t1. ENERO");
                        System.out.println("\n\n\t2. FEBRERO");
                        System.out.println("\n\n\t3. MARZO");
                        int opn=scanner.nextInt();
                        opn=scanner.nextInt();
                        objOp.numMaxMes(opn);
                        break;
                    case 4:
                        System.out.println("\n\t\t\t¿Que mes desea consultar?");
                        System.out.println("\n\n\t1. ENERO");
                        System.out.println("\n\n\t2. FEBRERO");
                        System.out.println("\n\n\t3. MARZO");
                        int opc=scanner.nextInt();
                        opc=scanner.nextInt();  
                        objOp.numMinMes(opc);
                        break;       
                    case 5:
                        objOp.numMaxTotal();
                        break;
                    case 6:
                        //4. Buscar pelicula
                        System.out.println("INGRESE CANTIDAD A BUSCAR: Q.");
                        int cant=scanner.nextInt();
                        objOp.buscar(cant);
                        break;
                    case 7:
                        System.out.println("Ingrese el id del vendedor a eliminar");
                        int id=scanner.nextInt();
                        objOp.eliminar(id);
                        break;
                    case 8:
                        System.out.println("Ingrese el numero de la opcion a editar");
                        System.out.println("\n\t1. NOMBRE");
                        System.out.println("\n\t2. CANTIDAD");
                        int can=scanner.nextInt();

                        switch(can){
                            case 1:
                                System.out.println("Ingrese el ID de la persona que desea editar: ");
                                int ID=scanner.nextInt();
                                String nombre=scanner.nextLine();
                                System.out.println("Ingrese el nuevo Nombre: ");
                                String nuevo=scanner.nextLine();
                                objOp.editarNom(nuevo,ID);
                                
                                break;
                            case 2:
                                System.out.println("\t\t\tIngrese el ID de la persona que desea modificar: ");
                                int Id=scanner.nextInt();
                                System.out.println("\t\t\tIngrese la nueva cantidad");
                                double newcantidad =scanner.nextDouble();
                                System.out.println("\t\t\t¿De que mes desea modificar el dato?");
                                System.out.println("\n\n\t\t1. ENERO");
                                System.out.println("\n\n\t\t2. FEBRERO");
                                System.out.println("\n\n\t\t3. MARZO");
                                int mesopc=scanner.nextInt();
                                objOp.editCantidad(Id, newcantidad, mesopc);
                                break;
                        }
                        break;
                    case 0:
                        System.out.println("!Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }

    }
    
}
