package br.org.project.design_patterns.structural.decorator.component;

public class LimonDrink implements Drink {
    @Override
    public String getDesc() {
        return "LimonDrink";
    }

    @Override
    public double getPrice() {
        return 2.5;
    }
}
