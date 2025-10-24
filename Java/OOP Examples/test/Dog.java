package test;

public class Dog {
    public static void main(String[] args) {
        Dog fido = new UnderDog();
        Dog snoopy = new Dog();
        UnderDog summer = new UnderDog();

        System.out.print("fido.act: ");
        fido.act();
        System.out.println();
        System.out.print("snoopy.act: ");
        snoopy.act();
        System.out.println();
        System.out.print("summer.act: ");
        summer.act();
        System.out.println();
        System.out.print("((UnderDog)fido).act: ");
        ((UnderDog)fido).under();
    }

    public void act() {
        System.out.print("run ");
        eat();
    }
    public void eat() {
        System.out.print("eat ");
    }
}
