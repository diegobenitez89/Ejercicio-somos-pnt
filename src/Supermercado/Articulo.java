/**
 *
 * @author Diego
 */

package Supermercado;

public class Articulo implements Comparable<Articulo> {

    private String nombre;
    private Integer precio;
    private String formatoPrecio;

    //Constructor
    
    public Articulo(String nombre, int precio, String formatoPrecio) {
        this.nombre = nombre;
        this.precio = precio;
        this.formatoPrecio = formatoPrecio;
    }
    // Metodos Get y Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getFormatoPrecio() {
        return formatoPrecio;
    }

    public void setFormato_precio(String formatoPrecio) {
        this.formatoPrecio = formatoPrecio;
    }

    public Articulo() {

    }

    //Metodo ToString
    @Override
    public String toString() {

        return nombre;
    }

    //Metodo compareTo
    @Override
    public int compareTo(Articulo art) {
        return this.getPrecio().compareTo(art.getPrecio());
    }

}
