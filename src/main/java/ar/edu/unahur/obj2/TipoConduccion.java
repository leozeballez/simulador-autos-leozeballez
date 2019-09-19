package ar.edu.unahur.obj2;

public class TipoConduccion {

    private int cantidadDeCombustible;
    private int kilometraje;
    private String consumo;
    private int velocidadMaxima;

    public TipoConduccion(String consumo, int velocidadMaxima) {
        this.consumo = consumo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCantidadDeCombustible() {
        return cantidadDeCombustible;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public String getConsumo() {
        return consumo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
