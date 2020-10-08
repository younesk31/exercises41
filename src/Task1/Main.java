package Task1;

public class Main {
    public static void main(String[] args) {
        Car newCar1 = new Car("BMW", "520D", 2020, "Station Car");
        Car newCar2 = new Car("VW", "GOLF", 2022, "Hybrid Car");
        Driver driver1 = new Driver("Younes", 25);
        Driver driver2 = new Driver("Adam", 18);
        newCar1.setDriver(newCar1.getDriver());
        newCar2.setDriver(newCar2.getDriver());
        System.out.println(newCar1 + " --> " + driver1);
        System.out.println(newCar2 + " --> " + driver2);
    }
}