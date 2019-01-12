package br.org.project.design_patterns.structural.adapter;

import br.org.project.design_patterns.structural.adapter.old.ICar;
import br.org.project.design_patterns.structural.adapter.old.CarImpl;
import br.org.project.design_patterns.structural.adapter.pattern.CarToSpeedCarAdapter;
import br.org.project.design_patterns.structural.adapter.pattern.ISpeedCar;

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
