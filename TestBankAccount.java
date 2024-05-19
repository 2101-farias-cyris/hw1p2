
public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setFirstName("Jelly");
        bankAccount.setLastName("Santos");
        bankAccount.setAccountID(152344);
        bankAccount.deposit(1000.0);
        bankAccount.withdrawal(200.0);
        bankAccount.accountSummary();
        System.out.println("-------------------------------------------------------                    ");
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setFirstName("Cyris");
        checkingAccount.setLastName("Farias");
        checkingAccount.setAccountID(342234);
        checkingAccount.setInterestRate(1.5);
        checkingAccount.deposit(500.0);
        checkingAccount.processWithdrawal(600.0);
        checkingAccount.displayAccount();
    }
}