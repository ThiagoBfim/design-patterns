package br.org.project.design_patterns.creational.builder;

import br.org.project.design_patterns.creational.builder.old.Computador;
import br.org.project.design_patterns.creational.builder.pattern.ComputadorBuilder;

/**
 * Pattern:
 *  Problema:   Há uma classe com varios atributos, a construção de uma nova instância está tornando o código pouco verboso,
 *              sendo dificil de ler.
 *  Solução:    Evoluir essa classe para utilizar o padrão builder.
 *
 *  Builder Pattern :
 *      * O padrão Builder pode ser utilizado para tornar o código mais verboso
 *      * Há varias formas de implementar o builder, ele também pode ser utilizado para forçar que a implementação contenha
 *      todos os atributos obrigatórios, e possibilitar incluir os opicionais de forma mais limpa.
 *
 *  Note: Esse foi apenas um exemplo de possíveis implementações do padrão Builder.
 *        O core do Java utiliza esse padrão no StringBuilder por exemplo.
 *
 * @see  java.lang.StringBuilder#append(String)
 */
public class TestBuilder {

    public static void main(String[] args) {
        old();
        builder();
    }

    private static void builder() {
        ComputadorBuilder computador = new ComputadorBuilder()
                .setAno(2018)
                .setHDGb(1000)
                .setMarca("Dell")
                .setMemoriaGb(8)
                .setProcesssador("Core I7");
        System.out.println("Pattern -> " + computador);
    }

    private static void old() {
        Computador computador = new Computador();
        computador.setAno(2018);
        computador.setHDGb(1000);
        computador.setMarca("Dell");
        computador.setMemoriaGb(8);
        computador.setProcesssador("Core I7");

        System.out.println("OLD -> " + computador);
    }

}