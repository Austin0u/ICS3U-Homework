public class PopMachine {
    double amountOfMoney;
    int numberOfCans;
    double price;

    double insertedMoney;

    public PopMachine(int numberOfCans, double amountOfMoney, double price) {
        this.numberOfCans = numberOfCans;
        this.amountOfMoney = amountOfMoney;
        this.price = price;
    }

    private void refund() {
        // assume a can has been purchased alr
        addMoney(-price);

        returnChange();
    }

    private void dispenseCan() {
        // assume can has alr been purchased and paid for
        if (numberOfCans >= 1) {
            numberOfCans--;
            System.out.println("1 Can dispensed. " + numberOfCans + " cans left.");
        } else {
            System.out.println("No cans left. All Sold Out");
            refund();
        }
    }

    private double calculateChange() {
        // assume only called when inserted > price
        return insertedMoney - price;
    }

    private void returnChange() {
        // assume price is paid
        double change = calculateChange();

        insertedMoney -= change;
        System.out.println("Returned: " + change);

    }

    private void addMoney(double money) {
        System.out.println("Money in Machine = $" + amountOfMoney + " " + ((money > 0) ? "+" : "-") + " $" + Math.abs(money) + " = $"
                + (amountOfMoney + money)); // debug
        amountOfMoney += money;
    }

    public void coinSlot(double money) {
        insertedMoney += money;

        if (insertedMoney >= price) {
            System.out.println("------------------------------");

            returnChange();
            addMoney(insertedMoney);
            insertedMoney = 0;

            // Output
            dispenseCan();
            System.out.println("------------------------------");

        } else {
            System.out.println("Not enough money inserted ($" + insertedMoney + "/" + price + ")");
        }

    }

    public static void main(String[] arg) {
        PopMachine popMachine = new PopMachine(5, 10, 1.5);
        // Inserts 5 dollars at once
        popMachine.coinSlot(5);

        // Inserts 1 dollar twice
        popMachine.coinSlot(1);
        popMachine.coinSlot(1);

        // Testing when no more cans
        popMachine.coinSlot(1.5);
        popMachine.coinSlot(1.5);
        popMachine.coinSlot(1.5);
        popMachine.coinSlot(1.5);

    }
}