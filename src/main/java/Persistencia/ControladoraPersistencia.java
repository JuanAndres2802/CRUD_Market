
package Persistencia;

import Logica.Usuario;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuJPA = new UsuarioJpaController();

    public void crearUsuario(Usuario usu) {
        usuJPA .create(usu);
    }
    
}
