package br.com.digitalhouse;


public class Impressora {
    List <Imprimivel> imprimiveis = new Arraylist<>();

    public void adicionarImprimivel (Imprimivel imprimivel){
        imprimiveis.add(imprimivel);
    }

    public void imprimirTudo(){
        for (Imprimivel imprimivel : imprimiveis){
            imprimivel.imprimir();
        }
    }
}




