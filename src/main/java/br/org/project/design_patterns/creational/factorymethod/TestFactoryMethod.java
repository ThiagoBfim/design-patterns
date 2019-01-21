package br.org.project.design_patterns.creational.factorymethod;

import br.org.project.design_patterns.creational.factorymethod.creator.FactoryPizza;
import br.org.project.design_patterns.creational.factorymethod.creator.concretecreator.BrasiliaFactoryPizza;
import br.org.project.design_patterns.creational.factorymethod.creator.concretecreator.NYFactoryPizza;

/**
 * Pattern:
 *  Problema:   Há uma fabrica de pizza, entretanto, essa fabrica está querendo crescer para outras localidades, e cada localidade
 *              poderá ter pizzas de sabores diferentes.
 *  Solução:    Criar uma Factory que é responsável por conter o conhecimento de como produz a pizza. E criar subclasses que
 *              tem como objetivo fornecer as pizzas de cada fabrica especifica.
 *
 *  Factory Method Pattern :
 *      * O padrão Factory Method pode ser utilizado quando não foi possível antecipar quais objetos a classe deverá criar.
 *      * Quando as subclasses tem como objetivo defirnir quais objetos elas irão criar.
 *      * Quando as subclasses tem como objetivo fornecer um objeto especifico que poderá ser utilizado pela superclsse.
 */
public class TestFactoryMethod {

    public static void main(String[] args) {
        FactoryPizza factoryPizza = new NYFactoryPizza();
        factoryPizza.oderPizza("Cheese");

        System.out.println();
        factoryPizza = new BrasiliaFactoryPizza();
        factoryPizza.oderPizza("Hot Dog");

    }

}