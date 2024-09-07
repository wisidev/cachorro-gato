import java.util.ArrayList;
import java.util.List;

public class Cachorro extends AnimalAbs implements AnimalInt<Cachorro> {
    private List<Cachorro> lista = new ArrayList<Cachorro>();
    private String raca;

    public Cachorro() {
    }

    public Cachorro(Long id, String especie, String nome, String raca, Double peso) {
        this.setId(id);
        this.setEspecie(especie);
        this.setNome(nome);
        this.setRaca(raca);
        this.setPeso(peso);
    }

    @Override
    public void criar(Cachorro animal) {
        System.out.println("Raça: " + animal.getRaca());
        System.out.println("Espécie: " + animal.getEspecie());
        this.lista.add(animal);
    }

    @Override
    public void modificar(Cachorro animal) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getId().equals(animal.getId())) {
                this.lista.get(i).setRaca(animal.getRaca());
                this.lista.get(i).setEspecie(animal.getEspecie());
                this.lista.get(i).setNome(animal.getNome());
                this.lista.get(i).setPeso(animal.getPeso());
                break;
            }
        }
    }

    @Override
    public void excluir(Long id) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getId().equals(id)) {
                this.lista.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Cachorro> listar() {
        return this.lista;
    }

    @Override
    public Cachorro buscar(Long id) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getId().equals(id)) {
                return this.lista.get(i);
            }
        }
        return null;
    }

    @Override
    public void visualizar(List<Cachorro> listaAnimal) {
        for (Cachorro item : listaAnimal) {
            System.out.println("Id: " + item.getId() + " - Espécie1: " + item.getEspecie() +
                    " - Nome1: " + item.getNome() + " - Raça1: " + item.getRaca() +
                    " - Peso: " + item.getPeso());
        }
    }

    public String getRaca() { return this.raca; }

    public void setRaca(String raca) { this.raca = raca; }
}
