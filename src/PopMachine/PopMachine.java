package PopMachine;

public class PopMachine {
    double priceOfPop;
    double amountOfMoney;
    int numberOfPop;

    double insertedMoney;

    public PopMachine(int numberOfPop, double amountOfMoney, double priceOfPop) {
        this.numberOfPop = numberOfPop;
        this.amountOfMoney = amountOfMoney;
        this.priceOfPop = priceOfPop;
        this.insertedMoney = 0;
    }

    public void coinSlot(double money) {
        insertedMoney += money;
        System.out.println("> Inserted: $" + money + " (total inserted: " + insertedMoney + "/$" + priceOfPop + ")");
    }

    public void popButton() {
        if (numberOfPop == 0) { // No pop left
            System.out.println("No pop left. All Sold Out.");
            System.out.println("> Returning money: $" + coinReturn());
        } else if (insertedMoney < priceOfPop) { // Not enough money
            System.out.println("Insufficient funds. Please insert $" + (priceOfPop - insertedMoney) + " more.");
        } else { // Enough money and pop available
            numberOfPop--; // Dispenses a can
            amountOfMoney += priceOfPop; // Adds the price of the pop to the machine's balance
            double change = insertedMoney - priceOfPop; // Calculate change
            insertedMoney = 0; // Reset inserted money after purchase

            System.out.println("> 1 pop dispensed. " + numberOfPop + " cans left.");
            System.out.println("> Returning change: $" + change);
        }
        System.out.println("===================================");
    }

    public double coinReturn() {
        double change = insertedMoney;
        if (change == 0) {
            System.out.println("> No change to return.");
        } else {
            insertedMoney = 0; // Reset the inserted money after returning it
        }
        return change;
    }

    public void displayMachineInfo() {
        System.out.println("===============INFO===============");
        System.out.println("> balance = $" + amountOfMoney);
        System.out.println("> pop amount = " + numberOfPop);
        System.out.println("> price = $" + priceOfPop);
        System.out.println("===================================");
    }

    public static void main(String[] args) {
        PopMachine popMachine = new PopMachine(5, 10, 1.5);
        popMachine.displayMachineInfo();

        System.out.println("Test Case: Insert more money than the price of pop and receive change.\n");
        popMachine.coinSlot(2.0);
        popMachine.popButton();

        System.out.println("Test Case: Insert less money than the price, attempt to receive, then adding more.\n");
        popMachine.coinSlot(1.0);
        popMachine.popButton();
        popMachine.coinSlot(0.5);
        popMachine.popButton();

        System.out.println("Test Case: Try to get free pop without paying.\n");
        popMachine.popButton();

        System.out.println("Test Case: Attempt to get free money.\n");
        popMachine.coinReturn();

        System.out.println("===================================");
        System.out.println("Test Case: Try to empty machine. Return money if sold out.\n");
        for (int i = 0; i < 5; i++) {
            popMachine.coinSlot(2.0);
            popMachine.popButton();
        }

        System.out.println("Test Case: Pay, but don't click pop.\n");
        popMachine.coinSlot(5.0);

        System.out.println("Returning remaining unused money: $" + popMachine.coinReturn());
        popMachine.displayMachineInfo();
    }
}