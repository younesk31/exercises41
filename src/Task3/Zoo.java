package Task3;
import java.util.ArrayList;

public class Zoo {
    public static ArrayList<String> animals = new ArrayList<>();


    public static void makeAllSounds() {
        for (String Animal : animals) {
            AnimalSound.makeSound();
        }
    }
    public static void addAnimal(String Animal) {
        animals.add(Animal);
    }

    public static void printNumberOfLegs() {
        for (String Animal : animals) {

        }
    }
}
