/*
- ID
- Name
- Cash on hand

- Can add cash
- Buy based on cash
- Get/Set name
- Get cash total
 */

public class Customer {
    private static int maxID = 0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash){
        maxID++;
        id = maxID;

        this.name = name;
        this.cash = cash;
    }

    public int getId() { return id; }

    public void addCash(double cash) { this.cash += cash; }

    public void buySnack(double cost) { if(cost < cash){ this.cash -= cost; }}

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public double getCash() { return this.cash; }

    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
                "name: " + name + "\n" +
                "cash: $" + cash + "\n";
        return rtnStr;
    }
}
