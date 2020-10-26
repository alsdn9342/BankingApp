/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankingAccountApp;

import java.util.ArrayList;

/**
 *
 * @author Minwoo Park
 */
public class Bank {
    private ArrayList<BankAccounts> accounts = new ArrayList<BankAccounts>();

    public void addAccount(BankAccounts account) {
        accounts.add(account);
    }

    public void depositInterestToAllAccounts() {
        for (int i = 0; i < accounts.size(); i++) {
            accounts.get(i).addInterest();
        }
    }

    public void printOutAllAccounts() {
        System.out.println("\nBank Statements: ");
        for (BankAccounts account : accounts) {
            System.out.println(account.toString());
        }
    }

    public BankAccounts getAcctByAcctNumber(int accountNumber) {
        for (BankAccounts account : accounts) {
            if (account.getAcctNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    
}
