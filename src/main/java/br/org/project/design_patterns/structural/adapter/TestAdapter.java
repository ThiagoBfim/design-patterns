package br.org.project.design_patterns.structural.adapter;

import br.org.project.design_patterns.structural.adapter.old.CarImpl;
import br.org.project.design_patterns.structural.adapter.old.ICar;
import br.org.project.design_patterns.structural.adapter.pattern.CarToSpeedCarAdapter;
import br.org.project.design_patterns.structural.adapter.pattern.ISpeedCar;

/**
 * Pattern:
 *  Antes:      Há uma empresa que produz apenas carros. Para isso existe uma aplicação que funciona 100% desenvolvendo apenas carros.
 *  Problema:   A empresa sofreu um ajuste e agora esses carros também poderão ser carros de corrida. A empresa não quer peder toda
 *              a base de modelos antiga, ela pretende manter a mesma produção e incluir a produção de carros de corrida também.
 *  Solução:     Criar o modelo do carro de corrida que se adapte ao carro normal.
 *
 *  Adapter Pattern :
 *      * O padrão patter deve ser utilizado quando já houver uma classe na qual a interface não seja compativel.
 *      * Quando há varias subclasses e não é viavel ficar criando implementação para cada uma delas. Nesse caso um adapter
 *        pode realizar essa ação  de adaptar a interface para os diferentes tipos de implementações.
 *
 */
public class TestAdapter {

    public static void main(String[] args) {
        ICar car = new CarImpl();
        car.setName("Car Gold");
        car.setAutomatic(true);
        car.setNumberTire(4);

        System.out.println("Normal Car:" + car.toString());

        ISpeedCar speedCar = new CarToSpeedCarAdapter(car);
        speedCar.setVelMax(300.0);
        System.out.println("Spped Car:" + speedCar.toString());
    }
}
