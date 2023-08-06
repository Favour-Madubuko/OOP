
/**
 * This class tests the BankAccount class.
 * You will need to add to it incrementally as you implement
 * the methods of the BankAccount class.
 */
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount myCurrentAccount, mySavingsAccount, yourCurrentAccount;

        myCurrentAccount = new BankAccount(BankAccount.AccountType.CURRENT,
                "003456CURRENT");
        mySavingsAccount = new BankAccount(BankAccount.AccountType.SAVINGS,
                "003456SAVINGS");
        yourCurrentAccount = new BankAccount(BankAccount.AccountType.CURRENT,
                "003457CURRENT");

        // Testing the new constructor
        BankAccount favourAccount = new BankAccount(BankAccount.AccountType.SAVINGS, "003458SAVINGS", 10000);

        // Testing the Accessor methods
        System.out.println("Favour Account details: ");
        System.out.println("Account Balance: " + favourAccount.getBalance());
        System.out.println("Account type: " + favourAccount.getAccountType());
        System.out.println("Account ID: " + favourAccount.getAccountID());
        System.out.println("Account Minimum Balance: " + favourAccount.getMinBalance() + "\n");

        // Testing the withdraw method
        System.out.println("Withdrawing 100 from mySavingsAccount is successful: " + mySavingsAccount.withdraw(100));
        System.out.println("Withdrawing 100 from favourAccount is successful: " + favourAccount.withdraw(100));
        System.out.println("Withdrawing 50 from favourAccount is successful: " + favourAccount.withdraw(50));
        System.out.println("Withdrawing 200 from favourAccount is successful: " + favourAccount.withdraw(200));

        // Testing the deposit method
        System.out.println("\nDeposited 200 into mySavingsAccount");
        mySavingsAccount.deposit(200);

        System.out.println("\nDeposited 100 into myCurrentAccount");
        myCurrentAccount.deposit(100);

        // Testing the performMonthlyMaintenance method
        System.out.println("\nPerforming monthly maintainance on myCurrentAccount");
        myCurrentAccount.performMonthlyMaintenance();

        System.out.println("\nPerforming monthly maintainance on mySavingsAccount");
        mySavingsAccount.performMonthlyMaintenance();

        System.out.println("\nPerforming monthly maintainance on yourCurrentAccount");
        yourCurrentAccount.performMonthlyMaintenance();

        System.out.println("\nPerforming monthly maintainance on favourAccount");
        favourAccount.performMonthlyMaintenance();

        // Testing the transfer method
        System.out.println("\nTransferred 200 from mySavingsAccount to favourAccount: "
                + mySavingsAccount.transfer(true, favourAccount, 150));
        System.out.println("Transferred 50 from myCurrentAccount to favourAccount: "
                + favourAccount.transfer(false, myCurrentAccount, 300));

    }
}