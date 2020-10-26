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
public class InvestmentAcct extends BankAccounts{

    public InvestmentAcct(double balance) {
        super(balance);
        this.accountType = AccountsType.INVESTMENT;
    }

    @Override
    public void addInterest() {
        this.balance *= 1.30;
    }
    
}