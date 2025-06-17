package Model.Persons;
import Model.Address;

public class NaturalPerson extends Person {
    public NaturalPerson() {
        super();
    }

    public NaturalPerson(String name, String cpf, String telephone, String email, Address address) {
        super(name, cpf, telephone, email, address);
    }

    //Getters
    public String getCpf() {
        return getDocument();
    }

    public String getName() {
        return getNameOrSocialReason();
    }



    //Setters
    public void setCpf(String cpf) {
        setDocument(cpf);
    }
    public void setName(String name) {
        setNameOrSocialReason(name);
    }
}
