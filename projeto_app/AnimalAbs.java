/**
 * @apiNote Classe abstrata que contém os atributos com os métodos getters e
 *          setters que deverão ser herdados pelas classe dos animais.
 * @author Vito Rodrigues Franzosi
 * @Data Criação 31.08.2024
 */
public abstract class AnimalAbs {
    private Long id;
    private String especie;
    private String nome;
    private Double peso;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return this.peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
