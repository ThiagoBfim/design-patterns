package br.org.project.design_patterns.behavior.flyweight.old;

public class CPlataforma implements Plataforma {

    public CPlataforma() {
        System.out.println("Plataforma C criado");
    }

    @Override
    public void execute(String code) {
        System.out.println("Compiling and executing C code: " + code);
    }

}
