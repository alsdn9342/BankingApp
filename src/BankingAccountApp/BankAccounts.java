/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankingAccountApp;

/**
 *
 * @author Minwoo Park
 */
public abstract class BankAccounts implements AccountInterface {
    
    protected double balance;
    protected AccountsType accountType;
    protected int acctNumber;
    private static int nextAcctNum;

    public BankAccounts(double balance) {
        this.balance = balance;
        this.acctNumber = BankAccounts.nextAcctNum;
        BankAccounts.nextAcctNum++;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountsType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountsType accountType) {
        this.accountType = accountType;
    }

    public int getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(int acctNumber) {
        this.acctNumber = acctNumber;
    }
    
    @Override
    public void deposit(double inMoney) {
        this.balance += inMoney;
    }

    @Override
    public void withdraw(double outMoney) {
        this.balance -= outMoney;
    }

    @Override
    public String toString() {
        return "BankAccounts{" + "balance=" + balance + ", accountType=" + accountType + ", acctNumber=" + acctNumber + '}';
    }  
    
}
