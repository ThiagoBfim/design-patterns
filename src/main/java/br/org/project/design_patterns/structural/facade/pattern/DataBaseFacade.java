package br.org.project.design_patterns.structural.facade.pattern;

import br.org.project.design_patterns.structural.facade.old.DataBase;
import br.org.project.design_patterns.structural.facade.old.IDataBase;

public class DataBaseFacade {

    private IDataBase dataBase;

    public DataBaseFacade(IDataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void executeScript(String script){
        dataBase.openConnection();
        dataBase.executeScript(script);
        dataBase.closeConnection();
    }
}
