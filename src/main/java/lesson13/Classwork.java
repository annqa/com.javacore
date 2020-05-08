package lesson13;

public class Classwork {
    public static void main(String[] args) {
        PersonalName ivanDole = new PersonalName("Ivan", "Dole");
        Address address = new Address(ivanDole, "155 street", "CO", 80121, "Avan");
        Monitor monitor = new Monitor();
        monitor.model = "MODEL";
        SystemBlock sb = new SystemBlock();
        sb.name = "SYSTEM";
        Computer pc = new Computer(sb, monitor);

        House house = new House(address, 5, 3, 59493, pc);

        String monitorModel = house.getComputer().getMonitor().model;
        System.out.println(monitorModel);
        String name = house.getAddress().getName().getFirstName();
        System.out.println(name);

        String
    }
}
