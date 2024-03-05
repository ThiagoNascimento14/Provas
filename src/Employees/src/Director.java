package Employees;

public abstract class Director extends Employee implements EmployeeInterface {
    private String receberDados;
    private String receberProblemas;
    private String realizarReuniaoDeAlinhamento;

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

    public String getRealizarReuniaoDeAlinhamento() {
        return realizarReuniaoDeAlinhamento;
    }

    public void setRealizarReuniaoDeAlinhamento(String realizarReuniaoDeAlinhamento) {
        this.realizarReuniaoDeAlinhamento = realizarReuniaoDeAlinhamento;
    }
    @Override
    public void makeDecisions() {
        System.out.println("Tomarei decisões estratégicas para a empresa");
    }
    @Override
    public void executeTask() {
        System.out.println("Preciso de uma reunião com a equipe, urgente!");
    }
    @Override
    public void manageTeam() {

    }

    @Override
    public void analyzeData() {

    }
}
