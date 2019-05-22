/**
 *
 * @author Diego
 */
package Supermercado;

public class Shampo extends Articulo {

    private String contenido;

    public Shampo(String nombre, String contenido, String formatoPrecio, int precio) {
        super(nombre, precio, formatoPrecio);
        this.contenido = contenido;

    }

    public void cargaProducto() {
        System.out.println("Nombre: " + getNombre() + " /// " + "Contenido: " + contenido + " /// " + "Precio: " + getFormatoPrecio() + getPrecio());
    }
}
