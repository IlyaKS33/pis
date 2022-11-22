import for_main.ItalyWine;
import for_main.Store;
import for_main.UkraineWine;
import for_main.Wine;

public class Main {
    public static void main(String[] args) {
        Store store = new Wine("Домашнє біле", 200);
        Store italyWine = new ItalyWine(store);
        Store ukraineWine = new UkraineWine(italyWine);

        System.out.println("Вина:");
        store.name();
        italyWine.name();
        ukraineWine.name();
        System.out.println("Загальна вартість: " + ukraineWine.amount());
    }
}
