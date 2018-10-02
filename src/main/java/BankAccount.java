import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    public void setAccountNumber(int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public void setAccountBalance(double setAccountBalance) {
        this.accountBalance = setAccountBalance;
    }
    public double getAccountBalance() {
        return this.accountBalance;
    }
    public void setOwnerName(String setOwnerName) {
        this.ownerName = setOwnerName;
    }
    public String getOwnerName() {
        return this.ownerName;
    }
}
