package br.org.project.design_patterns.structural.bridge.old;

import br.org.project.design_patterns.structural.bridge.pattern.AbstractFactoryProduct;

public class FactoryAppleProduct extends AbstractFactoryProduct {

    public FactoryAppleProduct(Product product) {
        super(product);
    }

    @Override
    public void produceProduct() {
        System.out.print("This will a Apple product: ");
        getProduct().produce();
    }
}
