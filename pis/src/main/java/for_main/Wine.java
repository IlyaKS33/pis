package for_main;

public class Wine implements Store{
    public String name;
    public int amount;

    public Wine(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public void name() {
        System.out.println(name);
    }

    @Override
    public int amount() {
        return amount;
    }
}
