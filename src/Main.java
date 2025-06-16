import Model.Client;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Client cliente = new Client("Gabriel", "45602077412", "45652577422", "11942345643", "deve@deve.com");
        Client cliente2 = new Client("Alessandra", "45602077412", "45652577422", "11942345643", "ale@ale.com");

        System.out.println(cliente.getClient());
        System.out.println(cliente2.getClient());
    }
}