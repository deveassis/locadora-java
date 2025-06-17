package Controller;
import Model.Client;
import java.util.Scanner;
public class AppController {
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
            System.out.println("Digite seu CPF:");
            String cpf = scanner.nextLine();
            System.out.println("Digite sua CNH:");
            String cnh = scanner.nextLine();
            System.out.println("Digite seu telefone:");
            String telefone = scanner.nextLine();
            System.out.println("Digite seu email:");
            String email = scanner.nextLine();

            Client cliente = new Client(nome, cpf, cnh, telefone, email);
            System.out.println("Cadastro realizado para: " + cliente.getName());
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



}
