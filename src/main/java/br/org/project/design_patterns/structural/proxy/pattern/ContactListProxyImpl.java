package br.org.project.design_patterns.structural.proxy.pattern;

import br.org.project.design_patterns.structural.proxy.old.Telefone;

import java.util.List;

public class ContactListProxyImpl implements ContactList {

    private ContactList contactList;
    @Override
    public List<Telefone> getEmployeeList() {
        if(contactList == null){
            System.out.println("Criando lista de contatos");
            contactList = new ContactListImpl();
        }
        return contactList.getEmployeeList();
    }

}
