package br.org.project.design_patterns.structural.decorator.pattern;

import br.org.project.design_patterns.structural.decorator.component.Drink;

public class SugarDecorator extends DrinkDecorator {

    private Drink drink;

    public SugarDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 0.25;
    }

    @Override
    public String getDesc() {
        return drink.getDesc() + " com acuçar";
    }
}
