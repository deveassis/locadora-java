package Model;

import Model.Persons.Person;

import java.util.ArrayList;

public class Client {
    private Person person;
    private String cnh;
    private final PersonType personType;

    private void validateCaracter(String valor, int numeroMinimo) {
        if (valor.length() < numeroMinimo) {
            throw new IllegalArgumentException("Este dado " + valor + " deve conter pelo menos " + numeroMinimo + " caracteres.");
        }
    }



    public Client(Person person, String cnh, PersonType personType) {
        validateCaracter(cnh, 11);
        this.person = person;
        this.cnh = cnh;
        this.personType = personType;
    }


    //Getters
    public Person getPerson() {
        return person;
    }

    public String getCnh() {
        return cnh;
    }

    public PersonType getPersonType() {
        return personType;
    }

    //Setters
    public void setPerson(Person person) {
        this.person = person;
    }

    public void setCnh(String cnh) {
        validateCaracter(cnh, 11);
        this.cnh = cnh;
    }


    public enum PersonType{
        NATURAL,
        LEGAL
    }

    @Override
    public String toString() {
        return "Client{" +
                "person=" + person +
                ", cnh='" + cnh + '\'' +
                ", personType=" + personType +
                '}';
    }

}
