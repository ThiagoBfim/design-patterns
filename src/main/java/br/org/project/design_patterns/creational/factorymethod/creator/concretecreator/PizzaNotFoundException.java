package br.org.project.design_patterns.creational.factorymethod.creator.concretecreator;

public class PizzaNotFoundException extends RuntimeException {

    public PizzaNotFoundException(String message) {
        super(message);
    }
}
