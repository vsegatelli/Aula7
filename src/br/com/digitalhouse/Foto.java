package br.com.digitalhouse;

public class Foto implements Imprimivel {

    public String nome;
    public String tipo;

    public Foto() {
    }

    public Foto(String novoNome, String novoTipo) {
        nome = novoNome;
        tipo = novoTipo;

    }

    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie " + nome + tipo);

    }
}
