package transportation;

public class Airplane extends Vehicle implements TransportationInterface {
    private String realizarTransporteCargaPesada;
    private String realizarTransporteExecutivos;

    public String getRealizarTransporteCargaPesada() {
        return realizarTransporteCargaPesada;
    }

    public void setRealizarTransporteCargaPesada(String realizarTransporteCargaPesada) {
        this.realizarTransporteCargaPesada = realizarTransporteCargaPesada;
    }

    public String getRealizarTransporteExecutivos() {
        return realizarTransporteExecutivos;
    }

    public void setRealizarTransporteExecutivos(String realizarTransporteExecutivos) {
        this.realizarTransporteExecutivos = realizarTransporteExecutivos;
    }

    @Override
    public void travel() {
        System.out.println("Viaja pelos céus");
    }

}
