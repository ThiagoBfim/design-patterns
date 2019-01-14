package br.org.project.design_patterns.structural.facade.old;

public interface IDataBase {

    void openConnection();

    void executeScript(String script);

    void closeConnection();
}
