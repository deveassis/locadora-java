package Controller;
import Model.Address;
import Model.Client;
import Model.Persons.NaturalPerson;
import Model.Persons.Person;
import Model.Shop.Location;
import Model.Vehicles.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AppController {
    private static List<Client> clients = new ArrayList<>();
    private static List<Car> cars = new ArrayList<>();
    private static List<Location> locations = new ArrayList<>();
    public static void mostrarMenu() {
        System.out.println("--------------------------------");
        System.out.println("Seja bem-vindo à Locadora Assis");
        System.out.println("--------------------------------");
        System.out.println("Escolha uma das opções abaixo:");
        String[] opcoes = {
                "1- Criar conta",
                "2- Conhecer Veículos",
                "3- Alugar um veículo",
                "4- Devolver veículo"
        };
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }

    public static Client cadastrarCliente(Scanner scanner) {
        try {
            System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();
            System.out.println("Digite seu CPF ou CNPJ:");
            String cpf = scanner.nextLine();
            System.out.println("Digite sua CNH:");
            String cnh = scanner.nextLine();
            System.out.println("Digite seu telefone:");
            String telefone = scanner.nextLine();
            System.out.println("Digite seu email:");
            String email = scanner.nextLine();
            System.out.println("Digite o tipo PF ou PJ:");
            String tipo = scanner.nextLine().toUpperCase();
            Client.PersonType tipoPessoa = Client.PersonType.valueOf(tipo);

            Address endereco = new Address("Rua um", 12, "A", "Sao Mateus", "Sao Paulo", "SP", "03000-001");
            Person pessoa = new NaturalPerson("Gabriel", "45652577851", "11970653827", "deveassis@gmail.com", endereco);
            Client cliente = new Client(pessoa, "32132344312", tipoPessoa);

            System.out.println("Cadastro realizado para: " + cliente.getPerson().getNameOrSocialReason());

            return cliente;

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
            return null;
        }
    }

    public static void listarVeiculos(){

    }


    public static void alugarVeiculo(){
    }

    public static void devolverVeiculo(){}


    public static List<Car> getCars() {
        return cars;
    }

    public static void setCars(List<Car> cars) {
        AppController.cars = cars;
    }

    public static List<Client> getClients() {
        return clients;
    }

    public static void setClients(List<Client> clients) {
        AppController.clients = clients;
    }

    public static List<Location> getLocations() {
        return locations;
    }

    public static void setLocations(List<Location> locations) {
        AppController.locations = locations;
    }
}
