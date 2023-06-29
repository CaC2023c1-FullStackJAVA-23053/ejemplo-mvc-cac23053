
package ar.charlycimino.ejemplo.mvc.cac23053;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try {
            Modelo m = new Modelo();
            req.setAttribute("listaProductos", m.getProductos());
            req.getRequestDispatcher("WEB-INF/productos/productos.jsp").forward(req, resp);
        } catch (SQLException ex) {
            ex.printStackTrace();
            resp.sendError(500, "Error al leer productos de la base de datos");
        }        
    }
    
}
