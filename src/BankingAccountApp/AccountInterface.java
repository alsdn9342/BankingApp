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
public interface AccountInterface {
    public void deposit (double inMoney);
    public void withdraw (double outMoney);
    public void addInterest ();
    
}
