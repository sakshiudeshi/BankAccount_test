/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount_test;

/**
 *
 * @author sakshi
 */
public class Bank {

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

    public static void main(String[] args) {
        BankAccount sakshiAccount;
        sakshiAccount = new BankAccount(5000, "Sakshi", "Vashi");
        BankAccount sunilAccount;
        sunilAccount = new BankAccount(2000, "Sunil", "Mumbai");
        /*sakshiAccount.withdraw(200);
         print(sakshiAccount.lastTransaction.toString());
         print(sakshiAccount.personalDetails.toString());
         sunilAccount.withdraw(200);
         print(sunilAccount.lastTransaction.toString());
         print(sunilAccount.personalDetails.toString());
         sakshiAccount.deposit(-1000);
         print(sakshiAccount.lastTransaction.toString());
         print(sakshiAccount.personalDetails.toString());
         sunilAccount.deposit(1000);
         print(sunilAccount.lastTransaction.toString());
         print(sunilAccount.personalDetails.toString());
         sakshiAccount.transferTo(sunilAccount, 180020131113L, 300);*/
        print(sakshiAccount.getBalance());
        sakshiAccount.deposit(500);
        sakshiAccount.withdraw(450);
        print(sakshiAccount.lastTransaction.toString());
        print(sunilAccount.lastTransaction.toString());
        print(sunilAccount.getNumberOfTransactions());
        
        SavingsAccount rahilAccount;
        rahilAccount = new SavingsAccount(5000, "Rahil", "Andheri", 7.5);
        rahilAccount.addInterest();
        rahilAccount.getBalance();
        rahilAccount.printBalance();

        // TODO code application logic here
    }
}
