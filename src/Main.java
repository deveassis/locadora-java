import Controller.AppController;
import Model.Client;
import Model.Car;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;


import Model.Location;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Seja bem-vindo a locadora Assis");
        System.out.println("--------------------------------");
        System.out.println("Escolha uma das opções abaixo:");




        AppController.mostrarMenu();
        System.out.print("> ");
        int numOpcao = scanner.nextInt();
        scanner.nextLine(); // <-- aqui está a correção! Consome o ENTER
        switch (numOpcao){
            case 1:
                System.out.println("Para realizar seu cadastro informe os dados no terminal");
                Client novoCliente = AppController.cadastrarCliente(scanner);
                break;
            case 2:
                System.out.println("Certo estes sao nossos veiculos");
                break;
            case 3:
                System.out.println("Informe o numero do veiculo que voce deseja alugar");
                break;
            case 4:
                System.out.println("Ok, vamos prosseguir com a inspecao informe seu CPF");
                break;
        }



        //Orientacao a objetos
        Car carro = new Car("EZQ-4433", "Peugeot", "206", 2008, "Black", "Hatch", 120.00, true);





    }
}