package Employees;

public abstract class Manager extends Employee implements EmployeeInterface {
    private String realizarReuniao;
    private String realizarContratacao;
    private String realizarControleDePonto;

    public Manager(String nome, String cargo) {
        super(nome, cargo);
    }

    public String getRealizarReuniao() {
        return realizarReuniao;
    }

    public void setRealizarReuniao(String realizarReuniao) {
        this.realizarReuniao = realizarReuniao;
    }

    public String getRealizarContratacao() {
        return realizarContratacao;
    }

    public void setRealizarContratacao(String realizarContratacao) {
        this.realizarContratacao = realizarContratacao;
    }

    public String getRealizarControleDePonto() {
        return realizarControleDePonto;
    }

    public void setRealizarControleDePonto(String realizarControleDePonto) {
        this.realizarControleDePonto = realizarControleDePonto;
    }
    @Override
    public void manageTeam() {
        System.out.println("Após reunião, abrirei vagas para contratação");
    }
    @Override
    public void executeTask() {
        System.out.println("Estou em reunião");
    }
    @Override
    public void analyzeData() {

    }

    @Override
    public void makeDecisions() {

    }
}
