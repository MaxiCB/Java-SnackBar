public class Main {
    static Customer cust1;
    static Customer cust2;

    static Machine mach1;
    static Machine mach2;
    static Machine mach3;

    static Snack snack1;
    static Snack snack2;
    static Snack snack3;
    static Snack snack4;
    static Snack snack5;

    private static void createCustomer () {
        cust1 = new Customer("Jane", 45.25);
        cust2 = new Customer("Bob", 33.14);
    }

    private static void createMachine () {
        mach1 = new Machine("Food");
        mach2 = new Machine("Drink");
        mach3 = new Machine("Office");
    }

    private static void createSnacks () {
        snack1 = new Snack("Chips", 36, 1.75, mach1.getId());
        snack2 = new Snack("Chocolate Bar", 36, 1.00, mach1.getId());
        snack3 = new Snack("Pretzels", 30, 2.00, mach1.getId());
        snack4 = new Snack("Soda", 24, 2.50, mach2.getId());
        snack5 = new Snack("Water", 20, 2.75, mach2.getId());
    }

    private static void janeProcessing () {
        double sodaCost = snack4.getTotal(3);
        snack4.setQuantity(-3);
        cust1.buySnack(sodaCost);
        System.out.println("Jane Cash: " + cust1.getCash());
        System.out.println("Soda Quantity: " + snack4.getQuantity());

        System.out.println();

        double pretzelCost = snack3.getTotal(1);
        snack3.setQuantity(-1);
        cust1.buySnack(pretzelCost);
        System.out.println("Jane Cash: " + cust1.getCash());
        System.out.println("Pretzel Quantity: " + snack3.getQuantity());

        System.out.println();

        cust1.addCash(10);
        System.out.println("Jane Cash: " + cust1.getCash());

        System.out.println();

        double chocloateCost = snack2.getTotal(1);
        snack2.setQuantity(-1);
        cust1.buySnack(chocloateCost);
        System.out.println("Jane Cash: " + cust1.getCash());
        System.out.println("Chocolate Quantity: " + snack2.getQuantity());

        System.out.println();
    }

    private static void bobProcessing () {

        double sodaCost = snack4.getTotal(2);
        snack4.setQuantity(-2);
        cust1.buySnack(sodaCost);
        System.out.println("Bob Cash: " + cust1.getCash());
        System.out.println("Soda Quantity: " + snack4.getQuantity());

        System.out.println();

        double pretzelCost = snack3.getTotal(3);
        snack3.setQuantity(-3);
        cust1.buySnack(pretzelCost);
        System.out.println("Bob Cash: " + cust1.getCash());
        System.out.println("Pretzel Quantity: " + snack3.getQuantity());

        System.out.println();

    }

    private static void machineProcessing () {

        snack3.setQuantity(12);
        System.out.println("Pretzel Quantity: " + snack3.getQuantity());

        System.out.println();
    }

    private static void stretch () {
        System.out.println(snack1.toString());
        System.out.println(snack2.toString());
        System.out.println(snack3.toString());
        System.out.println(snack4.toString());
        System.out.println(snack5.toString());

    }

    public static void main(String[] args){
        createCustomer();
        createMachine();
        createSnacks();
        janeProcessing();
        bobProcessing();
        machineProcessing();
        stretch();
    }
}
