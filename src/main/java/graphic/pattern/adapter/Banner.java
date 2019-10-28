package graphic.pattern.adapter;

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWIthAster() {
        System.out.println("*" + string + "*");
    }
}
