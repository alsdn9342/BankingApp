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
public class Start {
    
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        bank.addAccount(new ChequeingAcct(1000));
        bank.addAccount(new SavingsAcct(2000));
        bank.addAccount(new InvestmentAcct(3000));
        
        bank.printOutAllAccounts();
        bank.depositInterestToAllAccounts();
        bank.printOutAllAccounts();
        bank.getAcctByAcctNumber(1).withdraw(1000);
        
        bank.printOutAllAccounts();
        
        bank.getAcctByAcctNumber(0).deposit(10000);
        bank.printOutAllAccounts();
        
    }
}
