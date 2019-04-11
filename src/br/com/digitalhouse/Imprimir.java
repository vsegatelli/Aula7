package br.com.digitalhouse;

public class Imprimir {
    public static void main(String[] args) {
        Contrato contrato = new Contrato ("Contrato maroto", "Cont");
        Documento documento = new Documento("Aluguel", "Docx");
        Foto foto = new Foto ("Jantar em familia", "JPEG");

        Impressora impressora = new Impressora ();
        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(documento);
        impressora.adicionarImprimivel(foto);

        impressora.imprimirTudo();

    }
}
