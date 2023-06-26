
package ar.charlycimino.ejemplo.mvc.cac23053;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
@WebServlet(name="app", urlPatterns="/productos")
public class AppServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Modelo m = new Modelo();
        // m.getProductos()
        req.setAttribute("listaProductos", m.getProductos());
        req.getRequestDispatcher("productos.jsp").forward(req, resp);
    }
    
}
