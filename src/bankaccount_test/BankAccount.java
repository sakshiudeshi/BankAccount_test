/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount_test;

/**
 *
 * @author sakshi
 */
public class BankAccount {

    private double balance;
    private boolean accountExists;
    private long numberOfTransactions = 0;
    private long accountNumber;
    static long last_number = 180020131111L;
    LastTransaction lastTransaction = new LastTransaction();
    PersonalDetails personalDetails = new PersonalDetails();

    /**
     * Bank Account constructor
     *
     * @param initBalance initial balance in the account
     * @param name name of account holder
     * @param address address of account holder
     */
    public BankAccount(double initBalance, String name, String address) {
        if (initBalance >= 0) {
            accountNumber = ++last_number;
            personalDetails.name = name;
            personalDetails.address = address;
            balance = initBalance;
            accountExists = true;
            //numberOfTransactions++;
            print("Hello " + this.personalDetails.name + ". Your account number is " + accountNumber + ". Your balance is " + balance);

        } else {
            print("Please enter a positive number");
        }


    }

    /**
     * tells if the account exists or not
     *
     * @return accountExists
     */
    public boolean accountExists() {
        return accountExists;
    }

    /**
     * Deposits money to the Bank Account
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        if (accountExists) {
            if (amount > 0) {
                balance += amount;
            } else {
                print("Enter Positive number!!!!");
            }
            numberOfTransactions++;
            getBalance();
            lastTransaction.modifyLast("Deposit");
        } else {
            print("Account does not exist");
        }
    }

    /**
     * Withdraws money from the Bank Account
     *
     * @param amount the amount to withdraw
     * @return whether or not the withdrawal was successful
     */
    public boolean withdraw(double amount) {
        if (accountExists) {
            if (balance >= amount && amount > 0) {
                balance -= amount;
                lastTransaction.modifyLast("Withdraw");
                getBalance();
            } else {
                System.out.println("Transaction failed. Insufficient Funds");
                return false;
            }
            numberOfTransactions++;
            return true;
        } else {
            print("Account does not exist");
            return false;
        }

    }

    /**
     * Gets the balance of the Bank Account
     *
     * @return the current balance
     */
    public double getBalance() {
        if (accountExists) {
            return balance;

        } else {
            print("Account does not exist");
            return balance;
        }
    }

    /**
     * Prints balance
     *
     */
    public void printBalance() {
        if (accountExists) {
            System.out.println("Balance of Account " + accountNumber + " is " + balance);

        } else {
            print("Account does not exist");
        }
    }

    /**
     * gets the account number
     *
     * @return accountNumber
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Transfers money from one account to another.
     *
     * @param acc the name of the account
     * @param accNum the account number
     * @param amount the amount to be transferred
     */
    public void transferTo(BankAccount acc, long accNum, double amount) {
        if (acc != this) {
            print("Transfer Initiated!!");
            if (acc.accountNumber == accNum) {
                if (withdraw(amount)) {
                    acc.deposit(amount);
                    System.out.println("Transfer Succesful!");
                    lastTransaction.modifyLast("Transfer");

                }
                this.numberOfTransactions++;
                acc.numberOfTransactions++;

                //this.getBalance();
                //acc.getBalance();
            } else {
                System.out.println("Account Number does not match.");
            }
        } else {
            System.out.println("Please mention different accounts.");
        }
    }

    /**
     * gets number of transactions
     *
     * @return numberOfTransactions
     */
    public long getNumberOfTransactions() {
        return numberOfTransactions;
    }

    private static void print(String s) {
        System.out.println(s);
    }

    private static void print(long longNum) {
        System.out.println(longNum);
    }

    private static void print(double doubleNum) {
        System.out.println(doubleNum);
    }

    private static void print(Object obj) {
        System.out.println(obj);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}