package br.com.digitalhouse;

public class Documento implements Imprimivel {

    public String nome;
    public String tipo;

    public Documento() {
    }

    public Documento(String novoNome, String novoTipo) {
        nome = novoNome;
        tipo = novoTipo;
           }



    @Override
    public void imprimir() {
        System.out.println("Sou um documento do Word " + nome + tipo);

    }

