
package Servlets;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {
Controladora control = new Controladora();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        listaUsuarios = control.getUsuarios();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios", listaUsuarios);
        
        response.sendRedirect("verUsuarios.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreUsuario = request.getParameter("nombreUsuario");
        String contrasena = request.getParameter("contrasena");
        String rol = request.getParameter("rol");
        
        control.crearUsuario(nombreUsuario, contrasena, rol);
        
        response.sendRedirect("index.jsp");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
