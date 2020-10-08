package Task3;
import static Task3.Zoo.animals;

public class Main {
    public static void main(String[] args) {

        Zoo.addAnimal("Crocodile"); Zoo.addAnimal("Horse"); Zoo.addAnimal("Zebra");
        Zoo.makeAllSounds();
        Zoo.printNumberOfLegs();

        System.out.println("The Amount of Animals in the Zoo is "+animals.size()+" And their types are " + animals);
    }
}
