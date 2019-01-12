package br.org.project.design_patterns.structural.adapter.old;

public class CarImpl implements ICar {

    private int numberTire;
    private String name;
    private boolean automatic;

    @Override
    public int getNumberTire() {
        return numberTire;
    }

    @Override
    public void setNumberTire(int numberTire) {
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
    public boolean isAutomatic() {
        return automatic;
    }

    @Override
    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    @Override
    public String toString() {
        return "\nNome: " + getName() + "\n"
                + "Tires: " + getNumberTire() + "\n"
                + (isAutomatic() ? "is Automatic  " : " is not Automatic  ")
                + "\n";
    }

}
