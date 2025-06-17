package Model;

public class Address {
     String address;
     int number;
     String complement;
     String district;
     String city;
     String state;
     String zipcode;


     public Address(String address, int number, String complement, String district, String city, String state, String zipcode){
         this.address = address;
         this.number = number;
         this.complement = complement;
         this.district = district;
         this.city = city;
         this.state = state;
         this.zipcode = zipcode;
     }

    //Getters
    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }




    //Setters

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
