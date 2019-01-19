package br.org.project.design_patterns.structural.proxy;

import br.org.project.design_patterns.structural.proxy.old.Empregado;
import br.org.project.design_patterns.structural.proxy.old.Telefone;
import br.org.project.design_patterns.structural.proxy.pattern.ContactList;
import br.org.project.design_patterns.structural.proxy.pattern.ContactListProxyImpl;

import java.util.List;

/**
 * Pattern:
 *  Problema:   Os empregados possuem uma lista de contatos, entretanto essa lista de contantos nem sempre é utilizada.
 *              Então, o ideal seria que essa lista só fosse carregada quando solicitasse os contatos.
 *  Solução:    Criar o padrão proxy, semelhante ao utilizado pelo Hibernate.
 *
 *  Proxy Pattern :
 *      * Existem varios tipos diferentes de padrão proxy. O utilizado nesse exemplo é o Virtual Proxy.
 *      Ele deve ser utilizando quando a criação de objetos é algo caro, então o ideal é carregar por demanda.
 *
 * Note: Existem varias derivações do padrão proxy. O utilizado nesse exemplo é o Virtual Proxy.
 */
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