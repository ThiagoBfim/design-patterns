package br.org.project.design_patterns.behavior.flyweight.old;

public class JavaPlataforma implements Plataforma {

    public JavaPlataforma() {
        System.out.println("Plataforma Java criado");
    }

    @Override
    public void execute(String code) {
        System.out.println("Compiling and executing Java code: " + code);
    }

}
