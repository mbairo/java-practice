package entities;

public class Monitor {
    private String marca;
    private Double polegadas;
    private String resolucao;

    public Monitor() {
    }
    public Monitor (String marca, Double polegadas, String resolucao) {
        this.marca = marca;
        this.polegadas = polegadas;
        this.resolucao = resolucao;
    }

    public String toString(){
        return "\n##############\nMarca: "+ marca + "\nPolegadas: " + polegadas + "\nResultado: " + resolucao;
    }
}