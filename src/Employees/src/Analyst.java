package Employees;

public class Analyst extends Employee implements EmployeeInterface {
    private String realizarAnaliseDeDados;
    private String realizarRelatorio;
    private String realizarApresentacao;

    public Analyst(String nome, String cargo) {
        super(nome, cargo);
    }

    public String getRealizarAnaliseDeDados() {
        return realizarAnaliseDeDados;
    }

    public void setRealizarAnaliseDeDados(String realizarAnaliseDeDados) {
        this.realizarAnaliseDeDados = realizarAnaliseDeDados;
    }

    public String getRealizarRelatorio() {
        return realizarRelatorio;
    }

    public void setRealizarRelatorio(String realizarRelatorio) {
        this.realizarRelatorio = realizarRelatorio;
    }

    public String getRealizarApresentacao() {
        return realizarApresentacao;
    }

    public void setRealizarApresentacao(String realizarApresentacao) {
        this.realizarApresentacao = realizarApresentacao;
    }

    @Override
    public void analyzeData() {
        System.out.println("Analisando os dados");
    }
    @Override
    public void executeTask() {
        System.out.println("Implementando dados");
    }

    @Override
    public void manageTeam() {

    }

    @Override
    public void makeDecisions() {

    }
}
