import devices.DeviceInterface;
import devices.Laptop;
import devices.SmartTV;
import devices.Smartphone;
import employees.Analyst;
import employees.Director;
import employees.Manager;
import transportation.Airplane;
import transportation.Boat;
import transportation.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("João", "Gerente de Projetos");
        Analyst analyst = new Analyst("Maria", "Analista de Dados");
        Director director = new Director("Carlos", "Diretor Executivo");

        Laptop laptop = new Laptop();
        SmartTV smartTV = new SmartTV();
        Smartphone smartphone = new Smartphone();

        Airplane airplane = new Airplane();
        Boat boat = new Boat();
        Car car = new Car();

        System.out.println("Gerente:");
        System.out.println("Nome: " + manager.getNome());
        System.out.println("Cargo: " + manager.getCargo());
        manager.manageTeam();

        System.out.println("\nAnalista:");
        System.out.println("Nome: " + analyst.getNome());
        System.out.println("Cargo: " + analyst.getCargo());
        analyst.analyzeData();

        System.out.println("\nDiretor:");
        System.out.println("Nome: " + director.getNome());
        System.out.println("Cargo: " + director.getCargo());
        director.makeDecisions();

        List<DeviceInterface> devices = new ArrayList<>();
        devices.add(new Smartphone());
        devices.add(new Laptop());
        devices.add(new SmartTV());

        for (DeviceInterface device : devices) {
            device.performAction();
        }
    }
}
