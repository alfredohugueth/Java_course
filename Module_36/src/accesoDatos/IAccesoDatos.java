package accesoDatos;

public interface IAccesoDatos {
    int MAX_REGISTRO = 10; // todos los atributos en una interfaz son constantes

    // Cualquier metodo es publico y abstracto

    void insertar();

    void actualizar();

    void listar();

    void eliminar();
}
