package br.org.project.design_patterns.creational.builder;

import br.org.project.design_patterns.creational.builder.old.Computador;
import br.org.project.design_patterns.creational.builder.pattern.ComputadorBuilder;


public class TestBuilder {

    public static void main(String[] args) {
        old();
        builder();
    }

    private static void builder() {
        ComputadorBuilder computador = new ComputadorBuilder()
                .setAno(2018)
                .setHDGb(1000)
                .setMarca("Dell")
                .setMemoriaGb(8)
                .setProcesssador("Core I7");
        System.out.println("Pattern -> " + computador);
    }

    private static void old() {
        Computador computador = new Computador();
        computador.setAno(2018);
        computador.setHDGb(1000);
        computador.setMarca("Dell");
        computador.setMemoriaGb(8);
        computador.setProcesssador("Core I7");

        System.out.println("OLD -> " + computador);
    }

}