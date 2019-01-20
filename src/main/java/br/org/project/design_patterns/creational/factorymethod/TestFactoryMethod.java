package br.org.project.design_patterns.creational.factorymethod;

import br.org.project.design_patterns.creational.factorymethod.creator.FactoryPizza;
import br.org.project.design_patterns.creational.factorymethod.creator.concretecreator.BrasiliaFactoryPizza;
import br.org.project.design_patterns.creational.factorymethod.creator.concretecreator.NYFactoryPizza;

public class TestFactoryMethod {

    public static void main(String[] args) {
        FactoryPizza factoryPizza = new NYFactoryPizza();
        factoryPizza.oderPizza("Cheese");

        System.out.println();
        factoryPizza = new BrasiliaFactoryPizza();
        factoryPizza.oderPizza("Hot Dog");

    }

}