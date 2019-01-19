package br.org.project.design_patterns.creational.builder.pattern;


public class ComputadorBuilder {

    private String marca;
    private int ano;
    private int memoriaGb;
    private int HDGb;
    private String processsador;

    public ComputadorBuilder(){
    }

    public String getMarca() {
        return marca;
    }

    public ComputadorBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public int getAno() {
        return ano;
    }

    public ComputadorBuilder setAno(int ano) {
        this.ano = ano;
        return this;
    }

    public int getMemoriaGb() {
        return memoriaGb;
    }

    public ComputadorBuilder setMemoriaGb(int memoriaGb) {
        this.memoriaGb = memoriaGb;
        return this;
    }

    public int getHDGb() {
        return HDGb;
    }

    public ComputadorBuilder setHDGb(int HDGb) {
        this.HDGb = HDGb;
        return this;
    }

    public String getProcesssador() {
        return processsador;
    }

    public ComputadorBuilder setProcesssador(String processsador) {
        this.processsador = processsador;
        return this;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "marca='" + marca + '\'' +
                ", ano=" + ano +
                ", memoriaGb=" + memoriaGb +
                ", HDGb=" + HDGb +
                ", processsador='" + processsador + '\'' +
                '}';
    }
    
}
