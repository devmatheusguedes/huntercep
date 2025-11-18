package br.com.hunter.cep.model;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
