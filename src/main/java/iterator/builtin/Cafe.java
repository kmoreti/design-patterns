package iterator.builtin;

import java.util.Iterator;

public class Cafe {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Iterator<String> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<String> dinerIterator = dinerMenu.createIterator();

        System.out.println("\nMENU (with iterators)\n----\nBREAKFAST");

        printMenu(pancakeIterator);

        System.out.println("\nLUNCH");

        printMenu(dinerIterator);

    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            String menuItem = (String) iterator.next();
            System.out.println(menuItem);
        }
    }
}
