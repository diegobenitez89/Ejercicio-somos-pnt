/**
 *
 * @author Diego
 */
package Supermercado;

public class Bebidas extends Articulo {

    private String litros;

    public Bebidas(String nombre, String litros, String formatoPrecio, int precio) {
        super(nombre, precio, formatoPrecio);
        this.litros = litros;

    }

    public void cargaProducto() {
        System.out.println("Nombre: " + getNombre() + " /// " + "Litros: " + litros + " /// " + "Precio: " + getFormatoPrecio() + getPrecio());
    }
}
