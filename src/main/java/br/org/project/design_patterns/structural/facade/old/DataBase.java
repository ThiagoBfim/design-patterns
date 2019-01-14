package br.org.project.design_patterns.structural.facade.old;

public class DataBase implements IDataBase {


    @Override
    public void openConnection() {
        System.out.println("Connexão aberta");
    }

    @Override
    public void executeScript(String script) {
        System.out.println("Executando script: " + script);
    }

    @Override
    public void closeConnection() {
        System.out.println("Connexão fechada");
    }
}
