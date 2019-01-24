package br.org.project.design_patterns.structural.decorator.component;

public class Coffe implements Drink {
    @Override
    public String getDesc() {
        return "Coffe";
    }

    @Override
    public double getPrice() {
        return 1.5;
    }
}
