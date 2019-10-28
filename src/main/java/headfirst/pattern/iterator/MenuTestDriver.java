package headfirst.pattern.iterator;


public class MenuTestDriver {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new PanckeHouseMenu(), new DinerMenu());
        waitress.printMenu();

    }
}
