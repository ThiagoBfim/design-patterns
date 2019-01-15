package br.org.project.design_patterns.structural.bridge;

import br.org.project.design_patterns.structural.bridge.old.Computer;
import br.org.project.design_patterns.structural.bridge.old.FactoryAppleProduct;
import br.org.project.design_patterns.structural.bridge.old.Product;
import br.org.project.design_patterns.structural.bridge.pattern.AbstractFactoryProduct;
import br.org.project.design_patterns.structural.bridge.pattern.FactoryGoogleProduct;
import br.org.project.design_patterns.structural.bridge.pattern.Notebook;

public class TestBridge {

    public static void main(String[] args) {
        Product pc = new Computer("Computer");
        Product notebook = new Notebook("Notebook");

        AbstractFactoryProduct factoryApplePc = new FactoryAppleProduct(pc);
        AbstractFactoryProduct factoryAppleNotebook = new FactoryAppleProduct(notebook);

        factoryApplePc.produceProduct();
        factoryAppleNotebook.produceProduct();

        AbstractFactoryProduct factoryGoogleNotebook = new FactoryGoogleProduct(notebook);

        factoryGoogleNotebook.produceProduct();
    }
}