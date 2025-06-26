public class Animal {
    int age;
    String name;
    String type;

    // Constructor
    public Animal() {
        age = 0;
        name = "";
        type = "";
    }
    public Animal(int age, String name1) {
        this.age = age;
        this.name = name1;
    }

    // Main
    public static void main(String[] args) {
        Dog d = new Dog(9, "Summer", "Mixed");

        System.out.println("The dogs name is " + d.getName());
        d.setName("Newname");
        System.out.println("The dogs name is " + d.getName());
    }

    // Getters and setters
    public String getName() {
        return this.name;  // 'this' is unnecessary here
    }

    public void setName(String name) {
        this.name = name;
    }
}
