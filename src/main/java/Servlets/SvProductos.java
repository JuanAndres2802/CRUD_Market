
package Servlets;

import Logica.Controladora;
import Logica.Productos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvProductos", urlPatterns = {"/SvProductos"})
public class SvProductos extends HttpServlet {
Controladora control = new Controladora();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Productos> listaProductos = new ArrayList<Productos>();
        
        listaProductos = control.getProductos();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaProductos", listaProductos);
        
        response.sendRedirect("verProductos.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreProducto = request.getParameter("nombreProducto");
        String precio = request.getParameter("precio");
        
        control.crearProducto(nombreProducto, precio);
        
        response.sendRedirect("index.jsp");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
