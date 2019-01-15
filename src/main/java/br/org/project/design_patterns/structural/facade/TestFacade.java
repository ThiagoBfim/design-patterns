package br.org.project.design_patterns.structural.facade;

import br.org.project.design_patterns.structural.facade.old.DataBase;
import br.org.project.design_patterns.structural.facade.old.IDataBase;
import br.org.project.design_patterns.structural.facade.pattern.DataBaseFacade;

/**
 * Problema:
 *  Antes:      Para executar um script é necessário implementar uma interface complexa e todos os seus metodos.
 *  Problema:   É necessário criar executar um script. Há uma interface complexa e é necessário que essa interface seja mais simples.
 *  Solução:    Criar uma classe que encapsula a implementação da interface complexa.
 *
 *  Adapter Pattern :
 *      * O padrão Facade torna uma interface complexa em algo mais simples de utilizar. "Facade defines a higher-level interface that makes the subsystem easier to use."
 *      * O padrão Facade não encapsula a implementação da interface, ela apenas a torna mais simples,
 *          mas ainda disponibiliza todas as funcionalidades da interface para um cliente que precise.
 *
 */
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
