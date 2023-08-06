
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
    
    // Add various method calls to test you bank account class as you
    // implement it.
    System.out.println("This program doesn't really do anything yet.  You have to add to it.");
  }
}