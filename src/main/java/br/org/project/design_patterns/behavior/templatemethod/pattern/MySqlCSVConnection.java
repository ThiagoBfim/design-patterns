package br.org.project.design_patterns.behavior.templatemethod.pattern;

public class MySqlCSVConnection extends ConnectionTemplate {

    @Override
    public void setDBDriver() {
        System.out.println("Configurando o driver do MySQL ...");
    }
    @Override
    public void setCredentials() {
        System.out.println("Configurando credenciais do MySQL ...");
    }
    @Override
    public void setData() {
        System.out.println("Incluindo dados de um arquivo CSV no Mysql ...");
    }
}
