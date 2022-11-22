import for_main.ItalyWine;
import for_main.Store;
import for_main.UkraineWine;
import for_main.Wine;

public class Main {
    public static void main(String[] args) {
        Store store = new Wine("������ ���", 200);
        Store italyWine = new ItalyWine(store);
        Store ukraineWine = new UkraineWine(italyWine);

        System.out.println("����:");
        store.name();
        italyWine.name();
        ukraineWine.name();
        System.out.println("�������� �������: " + ukraineWine.amount());
    }
}
