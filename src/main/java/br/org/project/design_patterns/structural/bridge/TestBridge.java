package br.org.project.design_patterns.structural.bridge;

import br.org.project.design_patterns.structural.adapter.old.CarImpl;
import br.org.project.design_patterns.structural.adapter.old.ICar;
import br.org.project.design_patterns.structural.adapter.pattern.CarToSpeedCarAdapter;
import br.org.project.design_patterns.structural.adapter.pattern.ISpeedCar;
import br.org.project.design_patterns.structural.bridge.old.Computer;
import br.org.project.design_patterns.structural.bridge.old.Product;
import br.org.project.design_patterns.structural.bridge.pattern.FactoryProduct;
import br.org.project.design_patterns.structural.bridge.pattern.Notebook;

public class TestBridge {

    public static void main(String[] args) {
        Product pc = new Computer("Computer");
        Product notebook = new Notebook("Notebook");

        FactoryProduct factoryPc = new FactoryProduct(pc);
        FactoryProduct factoryNotebook = new FactoryProduct(notebook);

        factoryPc.produce();
        factoryNotebook.produce();
    }
}