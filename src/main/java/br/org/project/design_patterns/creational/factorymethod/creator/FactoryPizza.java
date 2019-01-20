package br.org.project.design_patterns.creational.factorymethod.creator;

import br.org.project.design_patterns.creational.factorymethod.product.Pizza;

public abstract class FactoryPizza {

    public void oderPizza(String sabor) {
        Pizza pizza = createPizza(sabor);
        pizza.prepararPizza();
        pizza.cortarPizza();
        pizza.embalarPizza();
    }

    protected abstract Pizza createPizza(String sabor);

}
