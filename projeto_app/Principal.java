public class Principal {
    public static void main(String[] args) {
        String[] vetorCor = {"Amarelo", "Vermelho", "Azul"};
        //o número 3 representa a quantidade de elementos dentro do vetor de pinceis.
        Pincel[] vetorPincel = new Pincel[3];
        Pincel[] vetorPincel1 = new Pincel[18];
        final Double altura = 10.0;
        final Double diametro=2.0;
        /*
        Este código é uma parte de teste do meu sistema.
        Pincel p1 = new Pincel();
        p1.setAltura(altura);
        p1.cor="Azul";
        p1.diametro=diametro;
        Pincel p2 = new Pincel("Vermelho", altura, diametro);
        System.out.println("a: "+p1.getAltura()+"  -  d: "+p1.diametro);
        System.out.println(p2.getAltura());*/

        for(int i=0; i<vetorPincel.length; i++) {
            vetorPincel[i] = new Pincel(vetorCor[i], altura, diametro);
        }

        /*int indice=0, totalCor=6;
        for(int i=0; i<vetorCor.length; i++) {
            for(int k=0; k<totalCor; k++) {
                vetorPincel1[indice] = new Pincel(vetorCor[i], altura, diametro);
                System.out.println("indice: "+indice+"  -  Pincel (cor: "
                +vetorPincel1[indice].cor+"; altura: "
                +vetorPincel1[indice].getAltura()+"; diametro: "
                +vetorPincel1[indice].diametro);
                indice++;
            }
        }*/

        int contador=0;
        while(contador<vetorPincel1.length) {
            for(int j=0; j<vetorCor.length; j++) {
                vetorPincel1[contador++] = new Pincel(vetorCor[j], altura, diametro);
                /*System.out.println("indice: "+i+"  -  Pincel (cor: "
                +vetorPincel1[i].cor+"; altura: "
                +vetorPincel1[i].getAltura()+"; diametro: "
                +vetorPincel1[i].diametro);*/
            }
        }
        for(int i=0; i<vetorPincel1.length; i++) {
                System.out.println("indice: "+i+"  -  Pincel (cor: "
                +vetorPincel1[i].cor+"; altura: "
                +vetorPincel1[i].getAltura()+"; diametro: "
                +vetorPincel1[i].diametro);
        }
    }
}
