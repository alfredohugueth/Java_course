import datos.Conexion;
import datos.PersonaDao;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;

import java.sql.*;
import java.util.List;
import java.util.Objects;


public class TestManejoPersonas {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit())
                conexion.setAutoCommit(false);

            PersonaDao personaDao = new PersonaDaoJDBC(conexion); // Permite aplicar el control transaccional

            List<PersonaDTO> personas = personaDao.select();

            for (PersonaDTO personaDTO: personas) {
                System.out.println("persona DTO = " + personaDTO);
            }

            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");

        } catch (SQLException e) {
            e.printStackTrace(System.out);
            System.out.println("Entramos al Rollback");
            try {
                Objects.requireNonNull(conexion).rollback();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

    }
}
