package test;

public class UnderDog extends Dog {
    public void act() {
        super.act();
        System.out.print("sleep ");
    }
    public void eat() {
        super.eat();
        System.out.print("bark ");
    }
    public void under() {
        System.out.print("test");
    }
}
