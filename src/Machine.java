/*
- ID
- Name

- Set/Get ID
- Set/Get Name
 */

public class Machine {
    private static int maxID = 0;
    private int id;
    private String name;

    public Machine(String name){
        maxID++;
        id = maxID;

        this.name = name;
    }
//    ID getter
    public int getId() { return id; }
//    ID setter
    public void setId(int id) { this.id = id; }
//    Name getter
    public int getName() { return id; }
//    Name setter
    public void setName(String name) { this.name = name; }
//    Return string formatting
    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
                "name: " + name + "\n";
        return rtnStr;
    }
}
