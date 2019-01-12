package br.org.project.design_patterns.structural.adapter.pattern;

import java.util.List;

public interface ISpeedCar {

    int getNumberTires();

    void setNumberTires(int numberTire);

    String getName();

    void setName(String name);

    void setVelMax(double velMax);

    double getVelMax();
}
