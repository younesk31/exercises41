package Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(4, 3, 6, 2);
        Room room2 = new Room(4, 2, 4, 4);
        Room room3 = new Room(4, 3, 6, 2);
        // Print out the room details
        /*
        System.out.println("Room 1: "+room1); System.out.println("Room 2: "+room2); System.out.println("Room 3: "+room3);
        */
        Building build1 = new Building(6,8,false);
        Building build2 = new Building(4,6,true);
        // Print out the building details
        /*
        System.out.println("Building 1: "+ build1); System.out.println("Building 2: "+ build2);
        */

        Building.checker(10,3);
        Building.Rooms.add(room1);
        Building.Rooms.add(room2);
        Building.Rooms.add(room3);
        System.out.println("The are "+Building.Rooms.size()+" Rooms");

        System.out.println("Total number of lamps: "+(room1.getNumberOfLamps()+room2.getNumberOfLamps()+room3.getNumberOfLamps()));
    }


}
