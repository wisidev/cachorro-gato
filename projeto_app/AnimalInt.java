import java.util.List;

/**
 * @apiNote Interface que contém os métodos a serem implementados pelas classes
 *          dos animais.
 * @author Vito Rodrigues Franzosi
 * @Data Criação 31.08.2024
 */
public interface AnimalInt<T> {
    public void criar(T animal);

    public void modificar(T animal);

    public void excluir(Long id);

    public List<T> listar();

    public T buscar(Long id);

    public void visualizar(List<T> lista);
}