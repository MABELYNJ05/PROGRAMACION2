
package dominio;


public class Pelicula {
    private String nombre;
    
    public Pelicula(String nombrePeli){
        this.nombre=nombrePeli;
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
