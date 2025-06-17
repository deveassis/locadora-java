package Model;

import Model.Persons.Person;

import java.util.ArrayList;

public class Client {
    private Person person;
    private String cnh;
    private String typePerson;

    private void validateCaracter(String valor, int numeroMinimo) {
        if (valor.length() < numeroMinimo) {
            throw new IllegalArgumentException("Este dado " + valor + " deve conter pelo menos " + numeroMinimo + " caracteres.");
        }
    }

    public Client(){
        this.person = new Person();
    }


    public Client(Person person, String cnh, String typePerson) {
        validateCaracter(cnh, 11);
        this.person = person;
        this.cnh = cnh;
        this.typePerson = typePerson;
    }


    //Getters
    public Person getPerson() {
        return person;
    }

    public String getCnh() {
        return cnh;
    }

    public String getTypePerson() {
        return typePerson;
    }


    //Setters
    public void setPerson(Person person) {
        this.person = person;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }
}
