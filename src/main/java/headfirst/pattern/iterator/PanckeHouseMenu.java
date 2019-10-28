package headfirst.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 煎饼屋菜单实现
 */
public class PanckeHouseMenu implements Menu {
    List<MenuItem> menuItemList;

    public PanckeHouseMenu() {
        this.menuItemList = new ArrayList<>();
        addItem("K&S's pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Breakfast",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with you choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItemList.add(menuItem);
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    @Override
    public Iterator iterator() {
        return new PanckeHouseMenuIterator();
    }

    private class PanckeHouseMenuIterator implements Iterator {
        Iterator iterator = menuItemList.iterator();

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public Object next() {
            return iterator.next();
        }
    }
}
