package Model.Shop;
import Model.Vehicles.Car;
import Model.Client;

import java.time.LocalDate;
public class Location {
    Client client;
    Car car;
    LocalDate rentalStartDate;
    LocalDate expectedReturnDate;
    LocalDate actualReturnDate;


    //Construtor
    public Location(Client client, Car car, LocalDate dataWithDrewal,
                    LocalDate expectedReturnDate, LocalDate actualReturnDate){
        this.client = client;
        this.car = car;
        this.rentalStartDate = dataWithDrewal;
        this.expectedReturnDate = expectedReturnDate;
        this.actualReturnDate = actualReturnDate;
    };



    //Getter
    public Client getClient() {
        return client;
    }

    public Car getCar() {
        return car;
    }

    public LocalDate getrentalStartDate() {
        return rentalStartDate;
    }

    public LocalDate getexpectedReturnDate() {
        return expectedReturnDate;
    }

    public LocalDate getactualReturnDate() {
        return actualReturnDate;
    }


    //Setter
    public void setClient(Client client) {
        this.client = client;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setrentalStartDate(LocalDate rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public void setexpectedReturnDate(LocalDate expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

    public void setactualReturnDate(LocalDate actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }

    // metodo de interacao
  /*  public String clienteAntigo(String name) {
        if (name.equals(getClient().getName())) {
            this.getClient().setName("Gabriel Assis");  // Isso muda o nome do cliente
            return "Cliente antigo identificado e nome atualizado.";
        } else {
            return "Cliente não identificado como antigo.";
        }
    }*/

}
