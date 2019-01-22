package br.org.project.design_patterns.behavior.templatemethod;

import br.org.project.design_patterns.behavior.templatemethod.pattern.ConnectionTemplate;
import br.org.project.design_patterns.behavior.templatemethod.pattern.MySqlCSVConnection;
import br.org.project.design_patterns.behavior.templatemethod.pattern.OracleXmlConnection;

/**
 * Pattern:
 *  Problema:   Há uma connexão já estabelecida com Mysql, entretanto, agora é necessário implementar uma para o Oracle,
 *              ambas obtem dados de fontes diferentes, uma de arquivos CSV e outra de XML. É necessário que a logica em comum
 *              fique centralizada para evitar duplicação de codigo e facilitar na manutenção.
 *  Solução:    Utilizar herança para criar um template, na qual o método principal será compartilhado via polimorfismo, possibilitando
 *              a troca de conexão em runtime.
 *
 *  Template Method Pattern :
 *      * O padrão template method pode ser utilizado quando há um comportamento comum entre as subclasses, então ele é usado para evitar duplicação de codigo.
 *      * Esse padrão concentra o que é comum entreas subclasses e permite que elas implementem apenas o comporamente especifico de cada uma.
 *
 */
public class TestTemplateMethod {

    public static void main(String[] args) {
        ConnectionTemplate connectionMysql = new MySqlCSVConnection();
        connectionMysql.run();
        System.out.println();
        ConnectionTemplate connectionOracle = new OracleXmlConnection();
        connectionOracle.run();
    }

}