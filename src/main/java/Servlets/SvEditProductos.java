
package Servlets;

import Logica.Controladora;
import Logica.Productos;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvEditProductos", urlPatterns = {"/SvEditProductos"})
public class SvEditProductos extends HttpServlet {
Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        Productos prod = control.traerProducto(id);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("prodEditar", prod);
     
        response.sendRedirect("editarProductos.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreProducto = request.getParameter("nombreProducto");
        String precio = request.getParameter("precio");
        
        Productos prod = (Productos) request.getSession().getAttribute("prodEditar");
        prod.setNombreProducto(nombreProducto);
        prod.setPrecio(precio);
        
        control.editarProducto(prod);
        
        response.sendRedirect("SvProductos");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
