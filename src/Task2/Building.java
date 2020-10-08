package Task2;
import java.util.ArrayList;

public class Building {
    static final ArrayList<Room> Rooms = new ArrayList<Room>();
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }


    public static void checker(int numberOfFloors, int Rooms ) {
        if (numberOfFloors > Rooms) {
            System.out.println("This is an odd building");
        }
    }


    public static ArrayList<Room> getRooms() {
        return Rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    public String toString() {
        return  ", Bathrooms = " + numberOfBathrooms +
                ", Floors = " + numberOfFloors +
                ", Office Building = " + isOfficeBuilding;
    }


}