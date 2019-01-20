package br.org.project.design_patterns.creational.factorymethod.creator.concretecreator;

import br.org.project.design_patterns.creational.factorymethod.creator.FactoryPizza;
import br.org.project.design_patterns.creational.factorymethod.product.Pizza;
import br.org.project.design_patterns.creational.factorymethod.product.concreteproduct.CheesePizza;
import br.org.project.design_patterns.creational.factorymethod.product.concreteproduct.PepperoniPizza;

public class NYFactoryPizza extends FactoryPizza {

    @Override
    protected Pizza createPizza(String sabor) {
        System.out.println("Obrigado por pedir pizza na Pizzaria NY!");
        switch (sabor.toLowerCase()){
            case "cheese" : {
                return new CheesePizza();
            }
            case "pepperoni" : {
                return new PepperoniPizza();
            }
            default:
                throw new PizzaNotFoundException("Não temos essa pizza no cardapio");
        }
    }
}
