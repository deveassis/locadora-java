package Model.Vehicles;

public class Car {
    private String licensePlate;
    private String branding;
    private String model;
    private int year;
    private String color;
    private CarType carType;
    private double dailyRate;
    private boolean available;

    // Construtor
    public Car(String licensePlate, String branding,
               String model, int year,
               String color, CarType carType,
               double dailyRate, boolean available)
    {
        this.licensePlate = licensePlate;
        this.branding = branding;
        this.model = model;
        this.year = year;
        this.color = color;
        this.carType = carType;
        this.dailyRate = dailyRate;
        this.available = available;
    }

    // Getters
    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBranding() {
        return branding;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setBranding(String branding) {
        this.branding = branding;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Métodos simulados
    void manutencaoPreventiva() {}

    void manutencaoReativa() {}

    void venderVeiculo() {}
}
