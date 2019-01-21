package br.org.project.design_patterns.behavior.templatemethod.pattern;

public class OracleXmlConnection extends ConnectionTemplate {

    @Override
    public void setDBDriver() {
        System.out.println("Configurando o driver do Oracle ...");
    }
    @Override
    public void setCredentials() {
        System.out.println("Configurando credenciais do Oracle ...");
    }
    @Override
    public void setData() {
        System.out.println("Incluindo dados de um arquivo XML no Oracle....");
    }
}
