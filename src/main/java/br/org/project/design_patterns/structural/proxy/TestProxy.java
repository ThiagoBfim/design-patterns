package br.org.project.design_patterns.structural.proxy;

import br.org.project.design_patterns.structural.proxy.old.Empregado;
import br.org.project.design_patterns.structural.proxy.old.Telefone;
import br.org.project.design_patterns.structural.proxy.pattern.ContactList;
import br.org.project.design_patterns.structural.proxy.pattern.ContactListProxyImpl;

import java.util.List;

public class TestProxy {

    public static void main(String[] args) {
        ContactList contactList = new ContactListProxyImpl();
        Empregado empregado = new Empregado("Jose", 4, contactList);
        System.out.println("Name: " + empregado.getNome());
        System.out.println("Idade: " + empregado.getIdade());
        contactList = empregado.getContatos();
        List<Telefone> empList = contactList.getEmployeeList();
        for (Telefone telefone : empList) {
            System.out.println(telefone);
        }
    }

}