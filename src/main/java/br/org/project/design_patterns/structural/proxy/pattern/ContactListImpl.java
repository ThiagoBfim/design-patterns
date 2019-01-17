package br.org.project.design_patterns.structural.proxy.pattern;

import br.org.project.design_patterns.structural.proxy.old.Telefone;

import java.util.ArrayList;
import java.util.List;

public class ContactListImpl implements ContactList {
    @Override
    public List<Telefone> getEmployeeList() {
        return getEmpList();
    }
    private static List<Telefone>getEmpList(){
        List<Telefone> empList = new ArrayList<>(5);
        empList.add(new Telefone(44, "9999-9999"));
        empList.add(new Telefone(44, "9999-9999"));
        return empList;
    }

}
