/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.mdVendedor;
import java.util.List;

public interface InterfazDatos {
    public List<mdVendedor> listar();
    public int escribir(mdVendedor vend);
    public void modNOM(String nuevo, int id);
    public void modCant(int Id, double newcantidad,int mesopc);
    public void buscar(int cant);
    public int borrar(int id);
    
}
