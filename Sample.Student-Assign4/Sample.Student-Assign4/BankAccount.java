
/** 
 * This class represents a bank account.  The account may be a current account or
 * a savings account.  Current accounts must maintain a minimum balance of GHC 6.00,
 * while savings accounts must maintain a minimum balance of 30.00.
 * Current accounts have a monthly maintenance fee of GHC 2.00, whereas savings
 * accounts have no monthly maintenance fee.  Savings accounts have an interest rate
 * of 6%, but current accounts have no interest.  Lastly, withdrawals from savings
 * accounts may only be be made 2 times a month, whereas there is no limit
 * on withdrawals from current accounts.
 */
public class BankAccount
{
  // Defined enumeration specifying the valid types of accounts
  public enum AccountType {CURRENT, SAVINGS}

  private AccountType acctType;   // The type of account (CURRENT or SAVINGS)
  private String acctID;          // The account's identifier
  
  private double balance;         // The current balance on the account
  private int numWithdrawals;     // The number of withdrawals that have been made
                                  // in the current month.
  private boolean inTheRed;       // Whether or not this account is "in the red"
                                  // (i.e. whether its balance is less than the
                                  //  minimum required balance.)
 
  private double minBalance;      // This account's minimum balance requirement
  private double interestRate;    // This account's annual interest rate
  private double maintenanceFee;  // This account's maintenance fee
  private int withdrawalLimit;    // The maximum number of withdrawals per month.

  // Defined constants
  public static final int MONTHS_PER_YEAR = 12;
  public static final double SAVINGS_ACCT_MIN_BALANCE = 30.0;
  public static final double CURRENT_ACCT_MIN_BALANCE = 6.00;
  public static final double SAVINGS_ACCT_INTEREST_RATE = 0.06;
  public static final double CURRENT_ACCT_MAINTENANCE_FEE = 2.00;
  public static final int SAVINGS_WITHDRAWAL_LIMIT = 2;
 
  // A constructor that takes the account type and id
  public BankAccount(AccountType type, String id){
    acctType = type;
    acctID = id;
    balance = 0;
    numWithdrawals = 0;
    
    if (acctType == AccountType.CURRENT){
      minBalance = CURRENT_ACCT_MIN_BALANCE;
      interestRate = 0;
      maintenanceFee = CURRENT_ACCT_MAINTENANCE_FEE;
      withdrawalLimit = -1;
    }
    else {
      minBalance = SAVINGS_ACCT_MIN_BALANCE;
      interestRate = SAVINGS_ACCT_INTEREST_RATE;
      maintenanceFee = 0;
      withdrawalLimit = SAVINGS_WITHDRAWAL_LIMIT;
    }
    
    inTheRed = (balance < minBalance);
  }
  
  // TO DO: Define a constructor that takes the account type, id,
  // and opening balance

  // TO DO: Define the getBalance() method
  
  // TO DO: Define the getAccountType() method
  
  // TO DO: Define the getAccountID() method
  
  // TO DO: Define the getMinBalance() method
  
  // TO DO: Define the withdraw() method
  
  // TO DO: Define the deposit() method
  
  // TO DO: Define the performMonthlyMaintenance() method
  
  // TO DO: Define the transfer() method
}