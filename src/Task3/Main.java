package Task3;
import static Task3.Zoo.animals;

public class Main {
    public static void main(String[] args) {

        Zoo.addAnimal("Zebra");
        Zoo.addAnimal("Gorilla");
        Zoo.addAnimal("Panda");
        Zoo.addAnimal("Horse");
        Zoo.makeAllSounds();


        System.out.println("Animals in the Zoo : " + animals);
    }
}
