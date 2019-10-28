package headfirst.pattern.adapter;

public class MallardDuck implements Duck {
    @Override
    public void quick() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
