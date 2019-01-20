package br.org.project.design_patterns.creational.factorymethod.product.concreteproduct;

import br.org.project.design_patterns.creational.factorymethod.product.Pizza;

public class PepperoniPizza extends Pizza {

    @Override
    public String getSabor() {
        return "Pepperoni";
    }
}
