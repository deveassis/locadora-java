import Model.Client;
import Model.Car;
import java.time.LocalDate;

import Model.Location;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Orientacao a objetos
        Client cliente = new Client("Gabriel", "45602077412", "45652577422", "11942345643", "deve@deve.com");
        Car carro = new Car("EZQ-4433", "Peugeot", "206", 2008, "Black", "Hatch", 120.00, true);

        System.out.println("Estou imprimindo um objeto: " + cliente);

        LocalDate hoje = LocalDate.now();

        //Associacao
        Location newLocation = new Location(cliente, carro, hoje, hoje, hoje);
        String nameClientNew = newLocation.getClient().getName();
        System.out.println("Estou imprimindo uma associacao: " + nameClientNew);

        //Estado
        String newName = newLocation.clienteAntigo("Gabriel");
        System.out.println("Estou imprimindo um estado: " + newName);

    }
}