
package operacionesNomina;

import dominio.mdVendedor;


public interface Operaciones {
    public void agregarDatos(mdVendedor vend);
    public void numMaxMes(int mes);
    public void numMinMes(int mes);
    public void numMaxTotal();   
    public void listar();
    public void buscar(int buscar);
    public void editarNom(String nuevo, int id);
    public void editCantidad(int Id, double newcantidad, int mesopc);
    public void eliminar(int id);
    
}
