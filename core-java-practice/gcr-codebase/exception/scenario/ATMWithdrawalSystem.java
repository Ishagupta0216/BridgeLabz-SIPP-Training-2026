class InsufficientBalanceException extends Exception {
    private double balance;
    private double withdrawalAmount;

    public InsufficientBalanceException(double balance, double withdrawalAmount) {
        super("Insufficient Balance! Available: ₹" + balance +
              ", Requested: ₹" + withdrawalAmount);
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }
}

class ATM {
    private double balance = 5000;

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        balance -= amount;
        System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance: ₹" + balance);
    }
}

public class ATMWithdrawalSystem {
    public static void main(String[] args) {

        ATM atm = new ATM();

        try {
            atm.withdraw(8000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed!");
            System.out.println(e.getMessage());
        }

        System.out.println("ATM System continues running...");
    }
}