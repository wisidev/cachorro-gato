/**
 * @apiNote Classe responsável pela gestão dos animais
 * @author Vito Rodrigues Franzosi
 * @Data Criação 31.08.2024
 */
public class MainAnimal {
    public static void main(String[] args) {
        /*
         * g1.setDataNascimento("10/05/2021");
         * g1.criar(g1);
         * System.out.println("Espécie1: "+g1.getEspecie()+" - Nome1: "+g1.getNome()
         * +" - Data nascimento1: "+g1.getDataNascimento());
         * //g2.criar("toto", "gato", "20/07/2022");
         * System.out.println("Espécie2: "+g2.getEspecie()+" - Nome2: "+g2.getNome()
         * +" - Data nascimento2: "+g2.getDataNascimento());
         * System.out.println(
         * "------------------------------------------------------------------");
         * System.out.println("Espécie1: "+g1.getEspecie()+" - Nome1: "+g1.getNome()
         * +" - Data nascimento1: "+g1.getDataNascimento());
         * System.out.println("Espécie2: "+g2.getEspecie()+" - Nome2: "+g2.getNome()
         * +" - Data nascimento2: "+g2.getDataNascimento());
         */

        /*
         * c1.setRaca("Siamês");
         * c1.criar(c1);
         * System.out.println("Espécie1: "+c1.getEspecie()+" - Nome1: "+c1.getNome()
         * +" - Raça1: "+c1.getRaca());
         * //c2.criar("toto", "cachorro", "Vira-lata");
         * System.out.println("Espécie2: "+c2.getEspecie()+" - Nome2: "+c2.getNome()
         * +" - Raça2: "+c2.getRaca());
         * System.out.println(
         * "------------------------------------------------------------------");
         * System.out.println("Espécie1: "+c1.getEspecie()+" - Nome1: "+c1.getNome()
         * +" - Raça1: "+c1.getRaca());
         * System.out.println("Espécie2: "+c2.getEspecie()+" - Nome2: "+c2.getNome()
         * +" - Raça2: "+c2.getRaca());
         */


        // Instanciando a objeto da classe Gato.
        Gato g = new Gato();
        // Adicionando um gato na lista de gatos da classe Gato
        g.criar(new Gato(1L, "Siamês", "Miau", "10/10/2023", 3.5));
        // Adicionando um gato na lista de gatos da classe Gato
        g.criar(new Gato(2L, "Persa", "Mimi", "20/01/2020", 2.3));
        // Adicionando um gato na lista de gatos da classe Gato
        g.criar(new Gato(3L, "Ragdoll", "Lili", "05/12/2021", 4.1));
        // Buscando a lista de gatos (g.listar()) e visualizando os gatos presentes na
        // lista.
        g.visualizar(g.listar());
        System.out.println("------------------------------------------------------------");
        System.out.println("Excluir o gato de id igual a 2");
        g.excluir(2L);
        // Buscando a lista de gatos (g.listar()) e visualizando os gatos presentes na
        // lista.
        g.visualizar(g.listar());
        // Verificando se existe um gato na lista com o id igual a 3
        if (g.buscar(3L) == null)
            System.out.println("Gato não encontrado!");
        else
            System.out.println("Gato encontrado!");
        // Verificando se existe um gato na lista com o id igual a 3
        if (g.buscar(5L) == null)
            System.out.println("Gato não encontrado!");
        else
            System.out.println("Gato encontrado!");

        // Exercício: desenvolver na classe Cachorro o que foi realizado na classe Gato.

        System.out.println("------------------------------------------------------------");

        // Instanciando a objeto da classe Cachorro.
        Cachorro c = new Cachorro();
        // Adicionando um cachorro na lista de cachorros da classe Cachorro
        c.criar(new Cachorro(1L, "Canis lupus familiaris", "Milo", "Jack Russell Terrier", 3.0));
        // Adicionando um cachorro na lista de cachorros da classe Cachorro
        c.criar(new Cachorro(2L, "Canis lupus familiaris", "Mi", "Vira-lata", 4.0));
        // Adicionando um cachorro na lista de cachorros da classe Cachorro
        c.criar(new Cachorro(3L, "Canis lupus familiaris", "Lecia", "Pastor Alemão", 4.1));
        // Buscando a lista de cachorros (c.listar()) e visualizando os cachorros presentes na
        // lista.
        c.visualizar(c.listar());
        System.out.println("------------------------------------------------------------");
        System.out.println("Excluir o cachorro de id igual a 2");
        c.excluir(2L);
        // Buscando a lista de cachorros (c.listar()) e visualizando os cachorros presentes na
        // lista.
        c.visualizar(c.listar());
        // Verificando se existe um cachorro na lista com o id igual a 3
        if (c.buscar(3L) == null)
            System.out.println("Cachorro não encontrado!");
        else
            System.out.println("Cachorro encontrado!");
        // Verificando se existe um cachorro na lista com o id igual a 3
        if (c.buscar(5L) == null)
            System.out.println("Cachorro não encontrado!");
        else
            System.out.println("Cachorro encontrado!");
    }
}