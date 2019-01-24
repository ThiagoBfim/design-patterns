package br.org.project.design_patterns.structural.decorator.pattern;

import br.org.project.design_patterns.structural.decorator.component.Drink;

public abstract class DrinkDecorator implements Drink {

    @Override
    public String getDesc() {
        return "Adicionais";
    }
}
