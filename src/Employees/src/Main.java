package Employees;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("João", "Gerente de Projetos") {};
        Analyst analyst = new Analyst("Maria", "Analista de Dados");
        Director director = new Director("Carlos", "Diretor Executivo") {
        };

        System.out.println("Gerente:");
        System.out.println("Nome: " + manager.getNome());
        System.out.println("Cargo: " + manager.getCargo());
        manager.executeTask();
        manager.manageTeam();
        manager.analyzeData();
        manager.makeDecisions();

        System.out.println("\nAnalista:");
        System.out.println("Nome: " + analyst.getNome());
        System.out.println("Cargo: " + analyst.getCargo());
        analyst.executeTask();
        analyst.manageTeam();
        analyst.analyzeData();
        analyst.makeDecisions();

        System.out.println("\nDiretor:");
        System.out.println("Nome: " + director.getNome());
        System.out.println("Cargo: " + director.getCargo());
        director.executeTask();
        director.manageTeam();
        director.analyzeData();
        director.makeDecisions();
    }
}
