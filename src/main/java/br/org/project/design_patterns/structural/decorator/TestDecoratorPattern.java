package br.org.project.design_patterns.structural.decorator;

import br.org.project.design_patterns.structural.decorator.component.Coffe;
import br.org.project.design_patterns.structural.decorator.component.Drink;
import br.org.project.design_patterns.structural.decorator.component.LimonDrink;
import br.org.project.design_patterns.structural.decorator.pattern.IceDecorator;
import br.org.project.design_patterns.structural.decorator.pattern.SugarDecorator;

/**
 * Pattern:
 *  Problema: Atualmente o sistema tem como objetivo fornecer bebidas para os usuarios. Cada bebida tem um preço, e todas
 *              as bebidas podem ter adição de algum ingrediente, a adição gera um custo a mais. O ideal é que cada comportamento
 *              fique exatamente na classe pertencente, facilitando manutenção e transparencia.
 *  Solução: Utilizar uma interface que contém o componente principal (Bebida) e ser o responsável por incluir nessa bebida
 *            o ingrediente solicitado.
 *
 *  Decorator Pattern :
 *      * Esse padrão tem como objetivo adicionar a responsabilidade de cada objeto de forma independente e transparente.
 *      * Esse padrão é utilizado quando é impraticavel utilizar subclasses devido a quantidade de possíveis extensões,
 *      nesse caso esse padrão é bem vindo, visto que ele ira criar dois grupos distintos, um dos componentes e outro com os decorators.
 *
 */
public class TestDecoratorPattern {

    public static void main(String args[]){

        Drink coffe = new Coffe();
        coffe = new SugarDecorator(coffe);
        System.out.println(coffe.getDesc());
        System.out.println(coffe.getPrice());

        System.out.println();

        Drink limonDrink = new LimonDrink();
        limonDrink = new SugarDecorator(limonDrink);
        limonDrink = new IceDecorator(limonDrink);
        System.out.println(limonDrink.getDesc());
        System.out.println(limonDrink.getPrice());
    }
}
