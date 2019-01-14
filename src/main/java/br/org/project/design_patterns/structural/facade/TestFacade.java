package br.org.project.design_patterns.structural.facade;

import br.org.project.design_patterns.structural.facade.old.DataBase;
import br.org.project.design_patterns.structural.facade.old.IDataBase;
import br.org.project.design_patterns.structural.facade.pattern.DataBaseFacade;

public class TestFacade {

    public static void main(String args[]){

        IDataBase dataBase = new DataBase();

        String script = "Select * from TABLE";
        //Sem o padrão de projeto:
        System.out.println("\n\nExecutando sem o padrão de projeto");
        dataBase.openConnection();
        dataBase.executeScript(script);
        dataBase.closeConnection();

        System.out.println("\n\nExecutando com o padrão de projeto");
        new DataBaseFacade(dataBase).executeScript(script);

    }
}
