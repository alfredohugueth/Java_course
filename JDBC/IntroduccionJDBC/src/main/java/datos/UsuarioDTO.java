package datos;

import domain.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static datos.Conexion.close;
import static datos.Conexion.getConnection;

public class UsuarioDTO {
    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(username, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET username = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";

    public List<Usuario> seleccionar() {
        // Init variables
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet setPersonas = null;
        Usuario usuario;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            connection = getConnection();
            statement = connection.prepareStatement(SQL_SELECT);
            setPersonas = statement.executeQuery();
            while ( setPersonas.next() ) {
                int idUsuario = setPersonas.getInt("id_usuario");
                String userName = setPersonas.getString("username");
                String password = setPersonas.getString("password");
                usuario = new Usuario(idUsuario, userName, password);

                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (setPersonas != null)
                    close(setPersonas);

                if ( statement != null)
                    close(statement);

                if ( connection != null)
                    close(connection);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }

        return usuarios;
    }

    public int insertar(Usuario usuario) {
        Connection connection = null;
        PreparedStatement statement = null;
        int registros = 0;
        try {
            connection = getConnection();
            statement = connection.prepareStatement(SQL_INSERT);
            // Llenamos la informacion del string
            statement.setString(1, usuario.getUserName());
            statement.setString(2, usuario.getPassword());

            registros = statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if ( statement != null)
                    close(statement);
                if ( connection != null )
                    close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return registros;
    }

    public int actualizar(Usuario usuario) {
        Connection connection = null;
        PreparedStatement statement = null;
        int registros = 0;
        try {
            connection = getConnection();
            statement = connection.prepareStatement(SQL_UPDATE);
            // Llenamos la informacion del string
            statement.setString(1, usuario.getUserName());
            statement.setString(2, usuario.getPassword());
            statement.setInt(3, usuario.getIdUsuario());

            registros = statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (statement != null)
                    close(statement);
                if (connection != null)
                    close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return registros;
    }

    public void eliminar(Usuario usuario) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = getConnection();
            statement = connection.prepareStatement(SQL_DELETE);

            // Llenamos la informacion del string
            statement.setInt(1, usuario.getIdUsuario());

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if ( statement != null)
                    close(statement);
                if ( connection != null )
                    close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
