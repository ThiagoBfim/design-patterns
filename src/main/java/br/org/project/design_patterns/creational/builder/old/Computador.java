package br.org.project.design_patterns.creational.builder.old;

public class Computador {

    private String marca;
    private int ano;
    private int memoriaGb;
    private int HDGb;
    private String processsador;

    public Computador(){
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMemoriaGb() {
        return memoriaGb;
    }

    public void setMemoriaGb(int memoriaGb) {
        this.memoriaGb = memoriaGb;
    }

    public int getHDGb() {
        return HDGb;
    }

    public void setHDGb(int HDGb) {
        this.HDGb = HDGb;
    }

    public String getProcesssador() {
        return processsador;
    }

    public void setProcesssador(String processsador) {
        this.processsador = processsador;
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
