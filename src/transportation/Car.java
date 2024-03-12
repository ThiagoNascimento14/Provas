package transportation;

public class Car extends Vehicle implements TransportationInterface {
    private String transportarFuncionarios;
    private String armazenamentoAlimentos;
    private String armazenamentoRoupas;

    public String getTransportarFuncionarios() {
        return transportarFuncionarios;
    }

    public void setTransportarFuncionarios(String transportarFuncionarios) {
        this.transportarFuncionarios = transportarFuncionarios;
    }

    public String getArmazenamentoAlimentos() {
        return armazenamentoAlimentos;
    }

    public void setArmazenamentoAlimentos(String armazenamentoAlimentos) {
        this.armazenamentoAlimentos = armazenamentoAlimentos;
    }

    public String getArmazenamentoRoupas() {
        return armazenamentoRoupas;
    }

    public void setArmazenamentoRoupas(String armazenamentoRoupas) {
        this.armazenamentoRoupas = armazenamentoRoupas;
    }

    @Override
    public void travel() {
        System.out.println("Viaja pela estrada");
    }

}
