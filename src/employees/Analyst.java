package employees;

public class Analyst extends Employee implements EmployeeInterface {
    private String realizarAnaliseDados;
    private String realizarRelatorio;
    private String realizarApresentacao;

    public Analyst(String nome, String cargo) {
        super(nome, cargo);
    }

    public String getRealizarAnaliseDados() {
        return realizarAnaliseDados;
    }

    public void setRealizarAnaliseDados(String realizarAnaliseDados) {
        this.realizarAnaliseDados = realizarAnaliseDados;
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

    public void analyzeData() {
        System.out.println("Analisando os dados");
    }

    @Override
    public void executeTask() {
        System.out.println("O verdadeiro peão da obra");
    }
}
