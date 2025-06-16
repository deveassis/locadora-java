package Model;

import java.util.ArrayList;

public class Client {
    String name;
    String cpf;
    String telephone;
    String cnh;
    String email;


private void validateCaracter(String valor, int numeroMinimo) {
    if (valor.length() < numeroMinimo) {
        throw new IllegalArgumentException("Este dado "+ valor +"  deve conter pelo menos caracteres.");
    }
}


    // Setter
  public Client(String name, String cpf, String cnh, String telephone, String email){
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


    //Getter
    public ArrayList<Object> getClient(){
        ArrayList<Object> returnClient = new ArrayList<>();
        returnClient.add(name);
        returnClient.add(cpf);
        returnClient.add(telephone);
        returnClient.add(cnh);
        returnClient.add(email);
        return returnClient;
    }
}
