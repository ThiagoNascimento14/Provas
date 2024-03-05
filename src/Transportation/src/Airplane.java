package transportation;

public class Airplane extends Transportation implements TransportationInterface {
    private String realizarTransporteDeCargaPesada;
    private String realizarTransporteDeExecutivos;

    public Airplane(String nome, String marca, String tipo) {
        super(nome, marca, tipo);
    }

    public String getRealizarTransporteDeCargaPesada() {
        return realizarTransporteDeCargaPesada;
    }

    public void setRealizarTransporteDeCargaPesada(String realizarTransporteDeCargaPesada) {
        this.realizarTransporteDeCargaPesada = realizarTransporteDeCargaPesada;
    }

    public String getRealizarTransporteDeExecutivos() {
        return realizarTransporteDeExecutivos;
    }

    public void setRealizarTransporteDeExecutivos(String realizarTransporteDeExecutivos) {
        this.realizarTransporteDeExecutivos = realizarTransporteDeExecutivos;
    }

    @Override
    public void fly() {
        System.out.println("A caminho do embarque");
    }

    @Override
    public void travel() {
        System.out.println("Aguardando liberação para decolar");
    }

    @Override
    public void drive() {
        // Implementação vazia, pois aviões não dirigem
    }

    @Override
    public void sail() {
        // Implementação vazia, pois aviões não navegam
    }
}
