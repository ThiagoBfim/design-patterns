package br.org.project.design_patterns.structural.decorator.pattern;

import br.org.project.design_patterns.structural.decorator.component.Drink;

public class IceDecorator extends DrinkDecorator {

    private Drink drink;

    public IceDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 0.50;
    }

    @Override
    public String getDesc() {
        return drink.getDesc() + " com gelo";
    }
}
