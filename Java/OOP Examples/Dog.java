
public class Dog extends Animal {
    // Member vars
    String breed;
    static int numDogs;

    // Constructor
    public Dog(int age1, String name1, String breed1) {
        super(age1, name1);
        this.breed = breed1;
    }

    // Methods
    public void randMethod() {
        this.getName();
        System.out.println(numDogs);
    }
}
