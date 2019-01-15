package br.org.project.design_patterns.structural.bridge.old;

public class Computer implements Product {

    private String nameProduct;

    public Computer(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String productName() {
        return nameProduct;
    }

    @Override
    public void produce() {
        System.out.println("Producing a " + productName());
    }
}
