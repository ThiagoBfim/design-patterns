package br.org.project.design_patterns.structural.bridge.pattern;

import br.org.project.design_patterns.structural.bridge.old.Product;

public class FactoryProduct {

    private Product product;

    public FactoryProduct(Product product) {
        this.product = product;
    }

    public void produce(){
        this.product.produce();
    }
}
