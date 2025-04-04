package PopMachine;

public class Main {
    public static void main(String[] args) {
        PopMachine popMachine = new PopMachine(5, 10, 1.5);
        popMachine.displayMachineInfo();

        System.out.println(
                "Test Case: Insert more money than the price of pop and receive change. Will reject if machine can't pay back\n");
        popMachine.coinSlot(2.0);
        popMachine.popButton();

        System.out.println("Test Case: Insert less money than the price, attempt to receive, then adding more.\n");
        popMachine.coinSlot(1.0);
        popMachine.popButton();
        popMachine.coinSlot(0.5);
        popMachine.popButton();

        System.out.println("Test Case: Try to get free pop without paying.\n");
        popMachine.popButton(); // fixed (did >= instead of >)

        System.out.println("Test Case: Attempt to get free money.\n");
        popMachine.coinReturn();

        System.out.println("-----------------------------------"); // Divider after each purchase
        System.out.println("Test Case: Try to empty machine. Return money if sold out\n");
        for (int i = 0; i < 5; i++) {
            popMachine.coinSlot(2.0);
            popMachine.popButton();
        }

        System.out.println("Test Case: Pay, but don't click pop.\n");
        popMachine.coinSlot(5.0);

        System.out.println("Returning remaining unused money: $" + popMachine.coinReturn()); // Return any leftover
                                                                                             // money
        popMachine.displayMachineInfo(); // End display balance
    }
}