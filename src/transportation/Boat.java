package transportation;

public class Boat extends Vehicle implements TransportationInterface {
    private String transporteConteiner;
    private String transporteTurismo;

    public String getTransporteConteiner() {
        return transporteConteiner;
    }

    public void setTransporteConteiner(String transporteConteiner) {
        this.transporteConteiner = transporteConteiner;
    }

    public String getTransporteTurismo() {
        return transporteTurismo;
    }

    public void setTransporteTurismo(String transporteTurismo) {
        this.transporteTurismo = transporteTurismo;
    }

    public void travel() {
        System.out.println("Viaja pelos mares");
    }
}
