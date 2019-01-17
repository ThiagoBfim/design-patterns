package br.org.project.design_patterns.structural.proxy.old;

import br.org.project.design_patterns.structural.proxy.pattern.ContactList;

public class Empregado {

    private String nome;
    private Integer idade;
    private ContactList contatos ;

    public Empregado(String nome, Integer idade, ContactList contatos) {
        this.nome = nome;
        this.idade = idade;
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public ContactList getContatos() {
        return contatos;
    }

    public void setContatos(ContactList contatos) {
        this.contatos = contatos;
    }
}
