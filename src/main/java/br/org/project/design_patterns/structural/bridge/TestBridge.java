package br.org.project.design_patterns.structural.bridge;

import br.org.project.design_patterns.structural.bridge.old.Computer;
import br.org.project.design_patterns.structural.bridge.old.FactoryAppleProduct;
import br.org.project.design_patterns.structural.bridge.old.Product;
import br.org.project.design_patterns.structural.bridge.pattern.AbstractFactoryProduct;
import br.org.project.design_patterns.structural.bridge.pattern.FactoryGoogleProduct;
import br.org.project.design_patterns.structural.bridge.pattern.Notebook;

/**
 * Pattern:
 *  Antes:      Foi criando um sistema para que a empresa Apple conseguisse criar seus produtos.
 *  Problema:   A empresa Google quer utilizar o mesmo sistema para produzir os seus produtos. Ambas as empresas podem possuir implementações distintas.
 *  Solução:    Criar uma classe que conheça a forma como se produz um produto, e ela se responsabilize por chamar a implementação de cada produto especifico.
 *
 *  Bridge Pattern :
 *      * O padrão Bridge deve ser utilizado quando é necessário compartilahr uma implementação com multiplos objetos, e isso deve ficar escondido do cliente.
 *      * O padrão Bridge permite combinar diferentes implementações independentemente.
 *      * A intenção do padrão Bridge é dissociar uma abstração da sua implementação para que ambas consigam evoluir indepentemente.
 *
 */
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