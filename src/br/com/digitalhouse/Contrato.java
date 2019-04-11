package br.com.digitalhouse;

public class Contrato implements Imprimivel {
    public String nome;
    public String tipo;

    public void Contrato() {
    }

    public Contrato(String novoNome, String novoTipo) {
        nome = novoNome;
        tipo = novoTipo;


    }


    @Override
    public void imprimir() {
        System.out.println("Sou um contrato legal " + nome + tipo);

    }
}
