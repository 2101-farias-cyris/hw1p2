
public class CheckingAccount extends BankAccount {
    private double interestRate;
    private static final double OVERDRAFT_FEE = 30.0;

    public CheckingAccount() {
        super();
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double amount) {
        if (amount > balance) {
            balance -= (amount + OVERDRAFT_FEE);
            System.out.println("Not Enough.... Overdraft! Fee of $" + OVERDRAFT_FEE + " applied. Contact your bank.");
        } else {
            balance -= amount;
        }
    }

    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate);
    }
}