/*
- ID
- Name
- Quantity
- Cost
- Vending Machine ID

- Set/Get ID
- Set/Get Name
- Set/Get Cost
- Set/Get Vending Machine ID
- Get/Set Quantity
- Buy Snack when given amount
- Get total cost when given amount
 */

public class Snack {
    private static int maxID = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int machineID;

    public Snack(String name, int quantity, double cost, int machineID){
        maxID++;
        id = maxID;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineID = machineID;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setId(String name) { this.name = name; }

    public double getCost() { return cost; }

    public void setCost(double cost) { this.cost = cost; }

    public int getMachineID() { return machineID; }

    public void setMachineID(int id) { this.machineID = machineID; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int amount) { this.quantity += amount; }

    public void buySnack(int amount) { if(this.quantity > amount){ this.quantity -= amount; }}

    public double getTotal(int amount) { return this.cost * amount; }

    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
                "name: " + name + "\n" +
                "cost: $" + cost + "\n" +
                "quantity: " + quantity + "\n" +
                "machineID: " + machineID + "\n";
        return rtnStr;
    }
}
