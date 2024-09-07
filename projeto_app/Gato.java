import java.util.ArrayList;
import java.util.List;

/**
 * @apiNote Classe responsável pela gestão dos gatos. Esta classe está herdando
 *          as propriedades e médodos da classe abstrata AnimalAbs e
 *          implementando os métodos da interface AnimalInt.
 * @author Vito Rodrigues Franzosi
 * @Data Criação 31.08.2024
 */
public class Gato extends AnimalAbs implements AnimalInt<Gato> {
    private List<Gato> lista = new ArrayList<Gato>();
    private String dataNascimento;

    /**
     * @apiNote Construtor vazio, isto é, sem nenhum atributo.
     * @author Vito Rodrigues Franzosi
     * @Data Criação 31.08.2024
     */
    public Gato() {
    }

    /**
     * @apiNote Construtor com todos os atributos do animal gato. O atributo
     *          dataNascimento está na classe Gato e os demais
     *          estão sendo herdados da classe AnimalAbs.
     * @author Vito Rodrigues Franzosi
     * @Data Criação 31.08.2024
     */
    public Gato(Long id, String especie, String nome, String dataNascimento, Double peso) {
        this.setId(id);
        this.setEspecie(especie);
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setPeso(peso);
    }

    /**
     * @apiNote Método responsável por adicionar um gato na lista de gatos
     *          (importada da interface AnimalInt).
     * @author Vito Rodrigues Franzosi
     * @Data Criação 31.08.2024
     */
    @Override
    public void criar(Gato animal) {
        System.out.println("Data de nascimento: " + animal.getDataNascimento());
        System.out.println("Espécie: " + animal.getEspecie());
        this.lista.add(animal);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'criar'");
    }

    /**
     * @apiNote Método responsável por alterar os dados de um gato da lista de gatos
     *          (importada da interface AnimalInt).
     * @author Vito Rodrigues Franzosi
     * @Data Criação 31.08.2024
     */
    @Override
    public void modificar(Gato animal) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getId().equals(animal.getId())) {
                this.lista.get(i).setDataNascimento(animal.getDataNascimento());
                this.lista.get(i).setEspecie(animal.getEspecie());
                this.lista.get(i).setNome(animal.getNome());
                this.lista.get(i).setPeso(animal.getPeso());
                break;
            }
        }
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    /**
     * @apiNote Método responsável por excluir um gato da lista de gatos
     *          (importada da interface AnimalInt).
     * @author Vito Rodrigues Franzosi
     * @Data Criação 31.08.2024
     */
    @Override
    public void excluir(Long id) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getId().equals(id)) {
                this.lista.remove(i);
                break;
            }
        }
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    /**
     * @apiNote Método responsável por listar os gatos inseridos na lista de gatos
     *          (importada da interface AnimalInt).
     * @author Vito Rodrigues Franzosi
     * @Data Criação 31.08.2024
     */
    @Override
    public List<Gato> listar() {
        return this.lista;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    /**
     * @apiNote Método responsável por buscar os dados de um gato da lista de gatos
     *          (importada da interface AnimalInt).
     * @author Vito Rodrigues Franzosi
     * @Data Criação 31.08.2024
     */
    @Override
    public Gato buscar(Long id) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getId().equals(id)) {
                return this.lista.get(i);
            }
        }
        return null;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    /**
     * @apiNote Método responsável por visualizar os dados dos gatos inseridos na
     *          lista de gatos (importada da interface AnimalInt).
     * @author Vito Rodrigues Franzosi
     * @Data Criação 31.08.2024
     */
    @Override
    public void visualizar(List<Gato> listaAnimal) {
        for (Gato item : listaAnimal) {
            System.out.println("Id: " + item.getId() + " - Espécie1: " + item.getEspecie() +
                    " - Nome1: " + item.getNome() + " - Data nascimento1: " + item.getDataNascimento() +
                    " - Peso: " + item.getPeso());
        }
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'visualizar'");
    }

    /**
     * @apiNote Métodos Getters e Setters dos atributos da classe Gato.
     * @author Vito Rodrigues Franzosi
     * @Data Criação 31.08.2024
     */

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
