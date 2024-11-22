
package Persistencia;

import Logica.Cliente;
import Logica.Productos;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    ProductosJpaController prodJPA = new ProductosJpaController();
    ClienteJpaController cliJPA = new ClienteJpaController();
    
    //INICIO METODOS DE USUARIO

    public void crearUsuario(Usuario usu) {
        usuJPA.create(usu);
    }

    public List<Usuario> getUsuarios() {
        return usuJPA.findUsuarioEntities();
    }

    public void borrarUsuario(int id) {
        try {
            usuJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id) {
        return usuJPA.findUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //FIN METODOS DE USUARIO
    
    //INICIO METODOS DE PRODUCTO
    
    public void crearProducto(Productos prod) {
        prodJPA.create(prod);
    }
    
    public List<Productos> getProductos() {
        return prodJPA.findProductosEntities();
    }
    
    public void borrarProducto(int id) {
        try {
            prodJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Productos traerProducto(int id) {
        return prodJPA.findProductos(id);
    }
    
    public void editarProducto(Productos prod) {
        try {
            prodJPA.edit(prod);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //FIN METODOS DE PRODUCTO
    
    //INICIO METODOS DE CLIENTE
    public void crearCliente(Cliente cli) {
        cliJPA.create(cli);
    }
    
    public List<Cliente> getCliente() {
        return cliJPA.findClienteEntities();
    }
    
    public void borrarCliente(int id) {
        try {
            cliJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Cliente traerCliente(int id) {
        return cliJPA.findCliente(id);
    }
    
    public void editarCliente(Cliente cli) {
        try {
            cliJPA.edit(cli);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //FIN METODOS DE CLIENTE
    
    //INICIO METODOS DE PROVEEDOR
    
    
    
    //FIN METODOS DE PROVEEDOR

    

    

    

    

    

    

    
    

    

    
    
}
