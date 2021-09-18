
package Nomina;

import Datos.ClsUsuario;
import Datos.ClsVendedor;
import java.util.List;
import modelos.mdUsuario;
import modelos.mdVendedor;

public class ClsOperaciones {
    
    private final ClsVendedor datos;
    
    public ClsOperaciones(){
        this.datos = new ClsVendedor(); //poner * en el import datos.*
    }
    
    public void agregarDatos(mdVendedor vend) {
       
       datos.escribir(vend);
    }
    
    public void numMaxMes(int Mes){
        double num=0;
        double mayor=0;
        String mes="";
        

        List<mdVendedor> vendedor = datos.listar();
        int opcion=Mes;            
        for (mdVendedor e: vendedor) {
            if(opcion==1){ 
                mes="Enero";
                num=e.getEnero();
                if(num>mayor){
                    mayor=num;
                }
            }else if(opcion==2){
                mes="Febrero";
                num=e.getFebrero();
                if(num>mayor){
                    mayor=num;
                }
            }else if(opcion==3){
                mes="Marzo";
                num=e.getMarzo();
                if(num>mayor){
                    mayor=num;
                }
            }else{
                System.out.println("OPCION INCORRECTA");
            }                                
        }            

        System.out.println("LA VENTA MAXIMA DEL MES DE "+mes+" es de Q."+mayor);




    }

    public void numMinMes(int Mes){
        double num=0;
        double menor=0;
        String mes="";
        
        
        List<mdVendedor> vendedor = datos.listar();
        int opcion=Mes;
        for(mdVendedor e: vendedor){
            if(opcion==1){
                menor=e.getEnero();
            }else if(opcion==2){
                menor=e.getFebrero();
            }else if(opcion==3){
                menor=e.getMarzo();
            }else{
                System.out.println("Opcion incorrecta");
            }
        }

        for (mdVendedor e: vendedor) {
            if(opcion==1){ 
                mes="Enero";
                num=e.getEnero();
                if(num<menor){
                    menor=num;
                }
            }else if(opcion==2){
                mes="Febrero";
                num=e.getFebrero();
                if(num<menor){
                    menor=num;
                }
            }else if(opcion==3){
                mes="Marzo";
                num=e.getMarzo();
                if(num<menor){
                    menor=num;
                }
            }

        }            

        System.out.println("LA VENTA MINIMA DEL MES DE "+mes+" es de Q."+menor);


        
    }

    public void numMaxTotal(){
        double mayor=0;
        double num=0;
        double enero=0;
        double febrero=0;
        double marzo=0;
        
        
            
        List<mdVendedor> vendedor = datos.listar();            
        for(mdVendedor e: vendedor){

            enero=e.getEnero();
            febrero=e.getFebrero();
            marzo=e.getMarzo();
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
    
    public void listar() {
        
        try {
            List<mdVendedor> vendedor = datos.listar();
            for(mdVendedor e : vendedor){
                System.out.println("Vendedor= "+e);
            }
        } catch (Exception e) {
            System.out.println("Error de acceso a datos");            
        }
        
    }

    public void buscar(int cant) {
        String resultado = null;
                    
        datos.buscar(cant);
        
    }
    
    
    public void editarNom(String nombre,int ID){
        
        datos.modNOM(nombre, ID);
        System.out.println("POR FAVOR ACTUALIZAR DATOS");
        
    }
    
    public void editCantidad(int Id,double newcantidad, int mesopc){
       
       datos.modCant(Id, newcantidad, mesopc);
        System.out.println("Actualice Datos");
        
    }

    public void eliminar(int id) {
        
        datos.borrar(id);

    }
    
    public void Validacion(mdUsuario usuario){
        
        ClsUsuario usu=new ClsUsuario();
        
        if(usu.validacion(usuario)){
            
        }else{
            
        }
        
    }
    
}
