package ar.edu.unahur.obj2;

public class Auto implements Conduccion {
    private int cantidadDeCombustible;
    private int kilometraje;
    private String consumo;
    private int velocidadMaxima;
    private TipoConduccion tipoConduccion;

    public void setTipoConduccion(TipoConduccion tipoConduccion) {
        this.tipoConduccion = tipoConduccion;
        this.conduccion();
    }

    @Override
    public void conduccion() {
        this.consumo = this.tipoConduccion.getConsumo();
        this.velocidadMaxima = this.tipoConduccion.getVelocidadMaxima();
    }
}
