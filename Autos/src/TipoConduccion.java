public class TipoConduccion {

    private int consumo;
    private int velocidadMaxima;

    public TipoConduccion(int consumo, int velocidadMaxima) {
        this.consumo = consumo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getConsumo() {
        return consumo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
