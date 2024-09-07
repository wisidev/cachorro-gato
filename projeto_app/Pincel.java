public class Pincel {
    String cor;
    private Double altura;
    Double diametro;

    public Pincel() {}

    public Pincel(String cor, Double altura, Double diametro) {
        this.cor=cor;
        this.altura=altura;
        this.diametro=diametro;
    }

    public Pincel(String cor) {
        this.cor=cor;
    }

    public void escrever() {
        System.out.println("Estou escrevendo!");
    }

    public Double getAltura() {
        return this.altura;
    }
    public void setAltura(Double altura) {
        this.altura=altura;
    }
}
