package br.org.project.design_patterns.structural.bridge.pattern;

import br.org.project.design_patterns.structural.bridge.old.Product;

public abstract class AbstractFactoryProduct {

    private Product product;

    public AbstractFactoryProduct(Product product) {
        this.product = product;
    }

    public abstract void produceProduct();

    public Product getProduct() {
        return product;
    }
}
