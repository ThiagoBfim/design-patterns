package br.org.project.design_patterns.structural.bridge.pattern;

import br.org.project.design_patterns.structural.bridge.old.Product;

public class Notebook implements Product {

    private String nameProduct;

    public Notebook(String nameProduct) {
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
