package transportation;

public class Boat extends Transportation implements TransportationInterface {
    private String transporteDeConteiner;
    private String transporteDeTurismo;

    public Boat(String nome, String marca, String tipo) {
        super(nome, marca, tipo);
    }

    public String getTransporteDeConteiner() {
        return transporteDeConteiner;
    }

    public void setTransporteDeConteiner(String transporteDeConteiner) {
        this.transporteDeConteiner = transporteDeConteiner;
    }

    public String getTransporteDeTurismo() {
        return transporteDeTurismo;
    }

    public void setTransporteDeTurismo(String transporteDeTurismo) {
        this.transporteDeTurismo = transporteDeTurismo;
    }

    @Override
    public void sail() {
        System.out.println("Aguardando embarque dos passageiros");
    }

    @Override
    public void travel() {
        System.out.println("Aguardando liberação para navegação");
    }

    @Override
    public void drive() {
        // Implementação vazia, pois barcos não dirigem
    }

    @Override
    public void fly() {
        // Implementação vazia, pois barcos não voam
    }
}
