package br.org.project.design_patterns.behavior.flyweight.old;

public class PhytonPlataforma implements Plataforma {

    public PhytonPlataforma() {
        System.out.println("Plataforma Phyton criado");
    }

    @Override
    public void execute(String code) {
        System.out.println("Compiling and executing Phyton code: " + code);
    }

}
