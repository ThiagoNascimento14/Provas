package employees;

public class Manager extends Employee implements EmployeeInterface {
    private String realizarReuniao;
    private String realizarContratacao;
    private String realizarControlePonto;

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

    public String getRealizarControlePonto() {
        return realizarControlePonto;
    }

    public void setRealizarControlePonto(String realizarControlePonto) {
        this.realizarControlePonto = realizarControlePonto;
    }
    public void manageTeam() {
        System.out.println("Após reunião, abrirei vagas para contratação");
    }

    @Override
    public void executeTask() {
        System.out.println("Estagiário de diretor");
    }
}
