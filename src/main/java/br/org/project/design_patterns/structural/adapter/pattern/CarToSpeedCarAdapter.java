package br.org.project.design_patterns.structural.adapter.pattern;

import br.org.project.design_patterns.structural.adapter.old.ICar;

public class CarToSpeedCarAdapter implements ISpeedCar {

    private Double velMax;
    private int numberTire;
    private String name;
    private boolean automatic;

    public CarToSpeedCarAdapter(ICar car) {
        adapter(car);
    }

    @Override
    public int getNumberTires() {
        return this.numberTire;
    }

    @Override
    public void setNumberTires(int numberTire) {
        this.numberTire = numberTire;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    @Override
    public double getVelMax() {
        return this.velMax;
    }

    @Override
    public String toString() {
        return "\nNome: " + getName() + "\n"
                + "Tires: " +  getNumberTires() + "\n"
                +  "Velocity max: " +  getVelMax() + "\n";
    }

    private void adapter(ICar car) {
        setName(car.getName());
        setNumberTires(car.getNumberTire());
    }
}
