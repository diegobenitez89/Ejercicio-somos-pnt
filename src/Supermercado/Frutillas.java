/**
 *
 * @author Diego
 */
package Supermercado;

public class Frutillas extends Articulo {

    private String unidad;

    public Frutillas(String nombre, String formatoPrecio, int precio, String unidad) {
        super(nombre, precio, formatoPrecio);
        this.unidad = unidad;

    }

    public void cargaProducto() {
        System.out.println("Nombre: " + getNombre() + " /// " + "Precio: " + getFormatoPrecio() + getPrecio() + " /// " + "Unidad de venta: " + unidad);
    }
}
