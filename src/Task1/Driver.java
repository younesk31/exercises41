package Task1;

public class Driver {
    private String Name;
    private int Age;

    public Driver(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    public String toString() {
        return " is driven by "+ Name + ", Age = " + Age;
    }
}

