package graphic.pattern.prototype;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnerlinePen unerlinePen = new UnerlinePen('~');
        MessageBox messageBox = new MessageBox('*');
        MessageBox showBox = new MessageBox('/');

        manager.register("strong message", unerlinePen);
        manager.register("warning message", messageBox);
        manager.register("slash message", showBox);

        Produce p1 = manager.create("strong message");
        p1.use("Hello, World.");
        Produce p2 = manager.create("warning message");
        p2.use("Hello, World.");
        Produce p3 = manager.create("slash message");
        p3.use("Hello, World.");
    }
}
