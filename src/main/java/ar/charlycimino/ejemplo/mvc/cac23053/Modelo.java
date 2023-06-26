
package ar.charlycimino.ejemplo.mvc.cac23053;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Modelo {
    private ArrayList<Producto> productos;

    public Modelo() {
        productos = new ArrayList<>();
        cargarProductosDePrueba();
    }
    
    public void cargarProductosDePrueba() {
        productos.add(new Producto("abc125", "Mouse inalámbrico fabuloso", 3, 3.13, "mouse.png"));
        productos.add(new Producto("abc121", "Monitor CRT de los viejos", 1, 210, "monitor.png"));
        productos.add(new Producto("abc124", "Impresora a chorro de tinta", 4, 173.51, "impresora.png"));
        productos.add(new Producto("abc123", "Joystick USB para PC", 3, 7.36, "joystick.png"));
        productos.add(new Producto("abc120", "Placa de Video GX8900 Super Super Super", 5, 714.99, "placa_video.png"));
        productos.add(new Producto("abc126", "Teclado sencillo pero funcional", 2, 12.20, "teclado.png"));
    }
    
    public ArrayList<Producto> getProductos () {
        return productos;
    }
    
    
}
