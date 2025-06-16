package Model;

public class Car {
    private String placa;
    private String branding;
    private String model;
    private int year;
    private String color;
    private String type;
    private double valueDay;
    private boolean available;


    //Construtor
    public Car(String placa, String branding,
               String model, int year,
               String color, String type,
               double valueDay, boolean available)
    {
        this.placa = placa;
        this.branding = branding;
        this.model = model;
        this.year = year;
        this.color = color;
        this.type = type;
        this.valueDay = valueDay;
        this.available = available;
    }


    //Getters
    public String getPlaca(){
        return  placa;
    }

    public String getBranding(){
        return branding;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public String getColor(){
        return color;
    }

    public String getType(){
        return type;
    }

    public double getValueDay(){
        return valueDay;
    }

    public boolean getAvailable(){
        return available;
    }


    //Setters
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setBranding(String branding){
        this.branding = branding;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValueDay(double valueDay) {
        this.valueDay = valueDay;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setModel(String model){
        this.model = model;
    }




}






