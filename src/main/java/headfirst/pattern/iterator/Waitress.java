package headfirst.pattern.iterator;


import java.util.Iterator;

public class Waitress {
    PanckeHouseMenu panckeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PanckeHouseMenu panckeHouseMenu, DinerMenu dinerMenu) {
        this.panckeHouseMenu = panckeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator panckeHouseMenuIterator = panckeHouseMenu.iterator();
        Iterator dinerMenuIterator = dinerMenu.iterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(panckeHouseMenuIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerMenuIterator);

    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + "," + menuItem.getPrice() + "--" + menuItem.getDescription());
        }
    }
}
