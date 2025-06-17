package Model;

import java.util.ArrayList;

public class Client {
    private String name;
    private String cpf;
    private String telephone;
    private String cnh;
    private String email;

    // Valida caracter
    private void validateCaracter(String valor, int numeroMinimo) {
        if (valor.length() < numeroMinimo) {
            throw new IllegalArgumentException("Este dado " + valor + " deve conter pelo menos " + numeroMinimo + " caracteres.");
        }
    }

    // Construtor
    public Client(String name, String cpf, String cnh, String telephone, String email) {
        validateCaracter(cpf, 11);
        validateCaracter(cnh, 11);
        validateCaracter(telephone, 11);
        validateCaracter(email, 9);
        validateCaracter(name, 3);

        this.name = name;
        this.cpf = cpf;
        this.cnh = cnh;
        this.telephone = telephone;
        this.email = email;
    }

    public ArrayList<Object> getClient() {
        ArrayList<Object> returnClient = new ArrayList<>();
        returnClient.add(name);
        returnClient.add(cpf);
        returnClient.add(telephone);
        returnClient.add(cnh);
        returnClient.add(email);
        return returnClient;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
