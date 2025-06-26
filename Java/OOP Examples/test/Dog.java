package test;

public class Dog {
    public static void main(String[] args) {
        Dog fido = new UnderDog();
        Dog snoopy = new Dog();
        UnderDog summer = new UnderDog();

        fido.act();
        snoopy.act();
        summer.act();
    }

    public void act() {
        System.out.print("run ");
        eat();
    }
    public void eat() {
        System.out.print("eat ");
    }
}
