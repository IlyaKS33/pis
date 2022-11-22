package for_main;

public class Decorator implements Store{
    private Store store;
    private String name;
    private int amount;

    public Decorator(Store store, String name, int amount) {
        this.store = store;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void name() {
        System.out.println(name);
    }

    @Override
    public int amount() {
        return amount + store.amount();
    }
}
