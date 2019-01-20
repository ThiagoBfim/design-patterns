package br.org.project.design_patterns.creational.factorymethod.product;

public abstract class Pizza {

    public abstract String getSabor();

    public void prepararPizza() {
        System.out.println("Pizza de " + getSabor() + " está sendo prerparada.");
    }

    public void cortarPizza() {
        System.out.println("Pizza foi cortada");
    }

    public void embalarPizza() {
        System.out.println("Pizza foi embadala.");
    }


}
