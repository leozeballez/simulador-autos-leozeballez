public class Auto implements Conduccion, Avance {

    private int cantidadDeCombustible;
    private int kilometraje;
    private int consumo;
    private int velocidadMaxima;
    private TipoConduccion tipoConduccion;
    private Registrador registrador;

    public Auto(int cantidadDeCombustible, int kilometraje, TipoConduccion tipoConduccion, Registrador registrador) {
        this.cantidadDeCombustible = cantidadDeCombustible;
        this.kilometraje = kilometraje;
        this.setTipoConduccion(tipoConduccion);
        this.registrador = registrador;
    }

    public void setTipoConduccion(TipoConduccion tipoConduccion) {
        this.tipoConduccion = tipoConduccion;
        this.conduccion();
    }

    public void setRegistrador(Registrador registrador) {
        this.registrador = registrador;
    }

    @Override
    public void conduccion() {
        this.consumo = this.tipoConduccion.getConsumo();
        this.velocidadMaxima = this.tipoConduccion.getVelocidadMaxima();
    }

    @Override
    public void avanzar() {
        if(cantidadDeCombustible < registrador.getKilometrosARecorrer() / consumo) {
            kilometraje += cantidadDeCombustible * consumo;
            cantidadDeCombustible = 0;
            System.out.println("No se pudo completar el recorrido solicitado.");
        } else {
            kilometraje += registrador.getKilometrosARecorrer();
            cantidadDeCombustible -= registrador.getKilometrosARecorrer() / consumo;
        }
    }
}
