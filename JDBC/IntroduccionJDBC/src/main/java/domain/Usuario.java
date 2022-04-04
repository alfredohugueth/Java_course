package domain;

public class Usuario {
    private int idUsuario;
    private String userName;
    private String password;

    public Usuario() {
    }

    public Usuario (int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public Usuario(int idUsuario, String userName, String password) {
        this.idUsuario = idUsuario;
        this.userName = userName;
        this.password = password;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
