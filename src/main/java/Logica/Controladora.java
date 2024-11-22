
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //INICIO METODOS DE USUARIO
    public void crearUsuario(String nombreUsuario, String contrasena, String rol){
        
        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasena(contrasena);
        usu.setRol(rol);
        controlPersis.crearUsuario(usu);
    }

    public List<Usuario> getUsuarios() {
        return controlPersis.getUsuarios();
    }
    
    public void borrarUsuario(int id) {
        controlPersis.borrarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return controlPersis.traerUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        controlPersis.editarUsuario(usu);
    }
    
    //FIN METODOS DE USUARIO
    
    //INICIO METODOS DE PRODUCTO
    
    public void crearProducto(String nombreProducto, String precio){
        
        Productos prod = new Productos();
        prod.setNombreProducto(nombreProducto);
        prod.setPrecio(precio);
        
        controlPersis.crearProducto(prod);
    }
    
    public List<Productos> getProductos(){
        return controlPersis.getProductos();
    }

    public void borrarProducto(int id) {
        controlPersis.borrarProducto(id);
    }
    
    public Productos traerProducto(int id) {
        return controlPersis.traerProducto(id);
    }
    
    public void editarProducto(Productos prod) {
        controlPersis.editarProducto(prod);
    }
    
    //FIN METODOS DE PRODUCTO

    //INICIO METODOS DE CLIENTE
    public void crearCliente(String nombre, String apellido, String telefono, String direccion){
        
        Cliente cli = new Cliente();
        cli.setNombre(nombre);
        cli.setApellido(apellido);
        cli.setTelefono(telefono);
        cli.setDireccion(direccion);
        
        controlPersis.crearCliente(cli);  
    }
    
    public List<Cliente> getCliente() {
        return controlPersis.getCliente();
    }
    
    public void borrarCliente(int id) {
        controlPersis.borrarCliente(id);
    }
    
    public Cliente traerCliente(int id) {
        return controlPersis.traerCliente(id);
    }
    
    public void editarCliente(Cliente cli) {
        controlPersis.editarCliente(cli);
    }
    
    //FIN METODOS DE CLIENTE
    
    //INICIO METODOS DE PROVEEDOR
    
    
    //FIN METODOS DE PROVEEDOR

    public boolean comprobarIngreso(String nombreUsuario, String contrasena) {
        
        boolean ingreso = false;
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = controlPersis.getUsuarios();
        
        for(Usuario usu : listaUsuarios){
            if(usu.getNombreUsuario().equals(nombreUsuario)){
                if(usu.getContrasena().equals(contrasena)){
                    ingreso = true;
                }
                else {
                    ingreso = false;
                }
            }
        }
        return ingreso;
    }

    

 
}
