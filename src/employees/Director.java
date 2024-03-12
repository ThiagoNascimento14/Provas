package employees;

public class Director extends Employee implements EmployeeInterface {
    private String receberDados;
    private String receberProblemas;
    private String realizarReuniaoAlinhamento;

    public Director(String nome, String cargo) {
        super(nome, cargo);
    }
    public String getReceberDados() {
        return receberDados;
    }

    public void setReceberDados(String receberDados) {
        this.receberDados = receberDados;
    }

    public String getReceberProblemas() {
        return receberProblemas;
    }

    public void setReceberProblemas(String receberProblemas) {
        this.receberProblemas = receberProblemas;
    }

    public String getRealizarReuniaoAlinhamento() {
        return realizarReuniaoAlinhamento;
    }

    public void setRealizarReuniaoAlinhamento(String realizarReuniaoAlinhamento) {
        this.realizarReuniaoAlinhamento = realizarReuniaoAlinhamento;
    }
    public void makeDecisions() {
        System.out.println("Tomarei decisões estratégicas para a empresa");
    }

    @Override
    public void executeTask() {
        System.out.println("Nada, só fica de reuniãozinha");
    }
}
