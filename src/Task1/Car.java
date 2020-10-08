package Task1;

public class Car {
    private String Make;
    private String Model;
    private int Year;
    private String BodyStyle;
    private String Driver;

    public Car(String make, String model, int year, String bodyStyle) {
        Make = make;
        Model = model;
        Year = year;
        BodyStyle = bodyStyle;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }

    public String toString() {
        return "Car = " + Make + ", Model = " + Model + ", Year = " + Year + ", BodyStyle = " + BodyStyle;
    }
}