package br.org.project.design_patterns.structural.bridge.pattern;

import br.org.project.design_patterns.structural.bridge.old.Product;

public class FactoryGoogleProduct extends AbstractFactoryProduct {

    public FactoryGoogleProduct(Product product) {
        super(product);
    }

    @Override
    public void produceProduct() {
        System.out.print("This will a Google product: ");
        getProduct().produce();
    }
}
