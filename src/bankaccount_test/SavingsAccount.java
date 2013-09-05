/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount_test;

/**
 *
 * @author sakshi
 */
public class SavingsAccount extends BankAccount {

    double interest;

    /**
     * Savings Account constructor
     *
     * @param initBalance initial balance in the account
     * @param name name of owner
     * @param address address of owner
     * @param rate interest rate of savings account
     */
    public SavingsAccount(double initBalance, String name, String address, double rate) {
        super(initBalance, name, address);
        interest = rate;
    }

    /**
     * adds interest to the account
     *
     * @return amount
     */
    public double addInterest() {
        double amount;
        amount = 0;
        if (super.accountExists()) {
            amount = (super.getBalance() * interest) / 100;
            super.deposit(amount);
            print("Interest of " + amount + " added to account number " + super.getAccountNumber());
            return amount;
        } else {
            print("Account does not exist");
            return amount;
        }
    }

    private static void print(String str) {
        System.out.println(str);
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
}
