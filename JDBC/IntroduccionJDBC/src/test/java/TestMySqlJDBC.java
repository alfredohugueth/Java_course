import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Se suele poner en aplicaciones web
            Connection conexion = DriverManager.getConnection(url,"root", "q6winaj3");
            Statement instruction = conexion.createStatement();
            // Ejecutamos la instruccion
            var sql = "SELECT idpersona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruction.executeQuery(sql);
            while (resultado.next()) {
                System.out.print("{ id_persona = " + resultado.getInt("idpersona"));
                System.out.print(" Nombre = " + resultado.getString("nombre"));
                System.out.print(" Apellido = " + resultado.getString("apellido"));
                System.out.print(" Email = " + resultado.getString("email"));
                System.out.print(" telefono = " + resultado.getString("telefono"));
                System.out.print("} \n");
            }
            resultado.close();
            instruction.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
