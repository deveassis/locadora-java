package Model;
import java.time.LocalDate;
public class Location {
    Client client;
    Car car;
    LocalDate dateWithDrawal;
    LocalDate datePrevReturn;
    LocalDate dateReturn;


    //Construtor
    public Location(Client client, Car car, LocalDate dataWithDrewal,
                    LocalDate datePrevReturn, LocalDate dateReturn){
        this.client = client;
        this.car = car;
        this.dateWithDrawal = dataWithDrewal;
        this.datePrevReturn = datePrevReturn;
        this.dateReturn = dateReturn;
    };



    //Getter
    public Client getClient() {
        return client;
    }

    public Car getCar() {
        return car;
    }

    public LocalDate getDateWithDrawal() {
        return dateWithDrawal;
    }

    public LocalDate getDatePrevReturn() {
        return datePrevReturn;
    }

    public LocalDate getDateReturn() {
        return dateReturn;
    }


    //Setter
    public void setClient(Client client) {
        this.client = client;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setDateWithDrawal(LocalDate dateWithDrawal) {
        this.dateWithDrawal = dateWithDrawal;
    }

    public void setDatePrevReturn(LocalDate datePrevReturn) {
        this.datePrevReturn = datePrevReturn;
    }

    public void setDateReturn(LocalDate dateReturn) {
        this.dateReturn = dateReturn;
    }


    public String clienteAntigo(String name) {
        if (name.equals("Gabriel")) {
            this.getClient().setName("Gabriel Assis");  // Isso muda o nome do cliente para "206"
            return "Cliente antigo identificado e nome atualizado.";
        } else {
            return "Cliente não identificado como antigo.";
        }
    }

}
