package br.org.project.design_patterns.behavior.strategy;

import br.org.project.design_patterns.behavior.strategy.pattern.CepFormatter;
import br.org.project.design_patterns.behavior.strategy.pattern.CpfFormatter;
import br.org.project.design_patterns.behavior.strategy.pattern.MaskFormatter;
import br.org.project.design_patterns.behavior.strategy.pattern.TelefoneFormatter;

/**
 * Pattern:
 *  Problema:   Há varios objetos diferentes na aplicação, e esses objetos possuem mascaras especificas. O ideal é poder utilizar
 *              o polimorfismo para incluir a mascara em cada um deles.
 *  Solução:    Utilizar uma interface que possui os métodos cruxiais e classes concretas que utilizam essa interface.
 *
 *  Strategy Pattern :
 *      * O padrão Strategy pode ser utilizado quando as classes se diferenciarem apenas pelo seu comportamento.
 *      * Quando houver varios condicinais que retornam um mesmo objeto, nesse caso é melhor separar em subclasses e manter na
 *      interface a ação em comum entre eles.
 *
 */
public class TestStrategy {

    public static void main(String[] args) {
        MaskFormatter formatter = new CepFormatter();
        System.out.println("CEP formatado: " + formatter.includeMask("72123100"));

        formatter = new CpfFormatter();
        System.out.println("CPF formatado: " + formatter.includeMask("12345678910"));

        formatter = new TelefoneFormatter();
        System.out.println("Telefone formatado: " + formatter.includeMask("99998123"));
    }


}