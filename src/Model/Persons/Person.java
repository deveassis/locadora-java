package Model.Persons;

import Model.Address;
// Uma classe abastrata quer dizer que nao posso criar algo diretamente dela, apenas atraves das subclasses como pessoa fisica ou juridica
public abstract class Person {
    private String nameOrSocialReason;
    private String document;
    private String telephone;
    private String email;
    private Address address;

    public Person() {}

    public Person(String nameOrSocialReason, String document, String telephone, String email, Address address) {
        this.nameOrSocialReason = nameOrSocialReason;
        this.document = document;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    //Getters
    public String getNameOrSocialReason() {
        return nameOrSocialReason;
    }

    public String getDocument() {
        return document;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }



    //Setters
    public void setNameOrSocialReason(String nameOrSocialReason) {
        this.nameOrSocialReason = nameOrSocialReason;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
