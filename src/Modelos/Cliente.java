package Modelos;

public class Cliente {

    //atributos da classe
    private String id;
    private String nome;
    private String documento;

    //construtor
    public Cliente(String id, String nome, String documento) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
    }

    // metodos acessores de cliente.
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }
}
