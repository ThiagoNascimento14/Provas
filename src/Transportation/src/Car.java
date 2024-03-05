package transportation;

public class Car extends Transportation implements TransportationInterface {
    private String transportarFuncionarios;
    private String armazenamentoAlimentos;
    private String armazenamentoRoupas;

    public Car(String nome, String marca, String tipo) {
        super(nome, marca, tipo);
    }

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
    public void drive() {
        System.out.println("Estou indo para o local de carregamento");
    }

    @Override
    public void travel() {
        System.out.println("Estou carregando");
    }

    @Override
    public void fly() {
        // Implementação vazia, pois carros não voam
    }

    @Override
    public void sail() {
        // Implementação vazia, pois carros não navegam
    }
}
