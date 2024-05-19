
public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    protected double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    // My getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal. ");
        } else {
            balance -= amount;
        }
    }

    public void accountSummary() {
        System.out.println("Your account info: ");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: " + balance);
    }
}