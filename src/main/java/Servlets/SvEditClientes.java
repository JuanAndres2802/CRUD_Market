
package Servlets;

import Logica.Cliente;
import Logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvEditClientes", urlPatterns = {"/SvEditClientes"})
public class SvEditClientes extends HttpServlet {
Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        Cliente cli = control.traerCliente(id);
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("cliEditar", cli);
        
        response.sendRedirect("editarClientes.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");
        
        Cliente cli =(Cliente) request.getSession().getAttribute("cliEditar");
        cli.setNombre(nombre);
        cli.setApellido(apellido);
        cli.setTelefono(telefono);
        cli.setDireccion(direccion);
        
        control.editarCliente(cli);
        
        response.sendRedirect("SvClientes");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
