package datos;

import domain.PersonaDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static datos.Conexion.close;
import static datos.Conexion.getConnection;

public class PersonaDaoJDBC implements PersonaDao {

    private Connection conexionTransaccional; // Se recibe desde afuera de la clase

    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE idpersona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE idpersona = ?";

    public PersonaDaoJDBC() {
    }

    public PersonaDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<PersonaDTO> select() throws SQLException {
        // Init variables
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet setPersonas = null;
        PersonaDTO personaDTO;
        List<PersonaDTO> personaDTOS = new ArrayList<>();

        try {
            connection = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            statement = connection.prepareStatement(SQL_SELECT);
            setPersonas = statement.executeQuery();
            while (setPersonas.next()) {
                int idPersona = setPersonas.getInt("idpersona");
                String nombre = setPersonas.getString("nombre");
                String apellido = setPersonas.getString("apellido");
                String email = setPersonas.getString("email");
                String telefono = setPersonas.getString("telefono");
                personaDTO = new PersonaDTO(idPersona, nombre, apellido, email, telefono);

                personaDTOS.add(personaDTO);
            }
        } finally {
            try {
                if (setPersonas != null)
                    close(setPersonas);

                if (statement != null)
                    close(statement);

                if (this.conexionTransaccional == null && connection != null)
                    close(connection);


            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }

        return personaDTOS;
    }

    public int insert(PersonaDTO personaDTO) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        int registros;
        try {
            connection = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            statement = connection.prepareStatement(SQL_INSERT);
            // Llenamos la informacion del string
            statement.setString(1, personaDTO.getNombre());
            statement.setString(2, personaDTO.getApellido());
            statement.setString(3, personaDTO.getEmail());
            statement.setString(4, personaDTO.getTelefono());

            registros = statement.executeUpdate();

        } finally {
            try {
                assert statement != null;
                close(statement);
                if (this.conexionTransaccional == null)
                    close(connection);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return registros;
    }

    public int update(PersonaDTO personaDTO) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        int registros;
        try {
            connection = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            statement = connection.prepareStatement(SQL_UPDATE);
            // Llenamos la informacion del string
            statement.setString(1, personaDTO.getNombre());
            statement.setString(2, personaDTO.getApellido());
            statement.setString(3, personaDTO.getEmail());
            statement.setString(4, personaDTO.getTelefono());
            statement.setInt(5, personaDTO.getIdPersona());

            registros = statement.executeUpdate();

        } finally {
            try {
                assert statement != null;
                close(statement);
                if (this.conexionTransaccional == null)
                    close(connection);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return registros;
    }

    public int delete(PersonaDTO personaDTO) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        int registros;
        try {
            connection = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            statement = connection.prepareStatement(SQL_DELETE);

            // Llenamos la informacion del string
            statement.setInt(1, personaDTO.getIdPersona());

            registros = statement.executeUpdate();

        } finally {
            try {
                assert statement != null;
                close(statement);
                if (this.conexionTransaccional == null)
                    close(connection);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return registros;
    }
}
