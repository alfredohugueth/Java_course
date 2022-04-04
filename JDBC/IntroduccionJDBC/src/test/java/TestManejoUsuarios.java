import datos.UsuarioDTO;
import domain.Usuario;

import java.util.List;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();


        // Insertar nuevo usuario
        // Usuario usuarioNuevo = new Usuario("carlos.juarez", "123456");
        // usuarioDAO.insertar(usuarioNuevo);

        // Modificamos un usuario existente
        // Usuario usuarioActualizado = new Usuario(3, "carlos.juarez", "443322");
        // usuarioDAO.actualizar(usuarioActualizado);

        // Eliminando Usuarios
        Usuario usuarioEliminado = new Usuario(3);
        usuarioDTO.eliminar(usuarioEliminado);

        // Ejecutando el listado de usuarios
        List<Usuario> usuarios = usuarioDTO.seleccionar();
        for (Usuario usuario : usuarios) {
            System.out.println("Usuario: " + usuario);
        }

    }
}
