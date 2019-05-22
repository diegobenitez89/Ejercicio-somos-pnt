/**
 *
 * @author Diego
 */
package Supermercado;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

    public static void main(String[] args) {

        Bebidas bebida1 = new Bebidas("Coca-Cola Zero ", "1.5", "$", 20);
        Bebidas bebida2 = new Bebidas("Coca-Cola ", "1.5", "$", 18);
        Shampo shampo = new Shampo("Shampo Sedal", "500 ml", "$", 19);
        Frutillas frutilla = new Frutillas("Frutillas", "$", 64, "Kilo");

        bebida1.cargaProducto();
        bebida2.cargaProducto();
        shampo.cargaProducto();
        frutilla.cargaProducto();

        System.out.println("=============================");

        ArrayList<Articulo> lista = new ArrayList();
        lista.add(bebida1);
        lista.add(bebida2);
        lista.add(shampo);
        lista.add(frutilla);

        Collections.sort(lista);
        int ultimaPos = lista.size() - 1;
        System.out.println("Producto más caro: " + lista.get(ultimaPos));
        System.out.println("Producto más barato: " + lista.get(0));

    }
}
