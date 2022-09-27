package com.techelevator;

public class CheckingAccount extends BankAccount{


    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }



    public int withdraw(int amountToWithdraw){
        int difference = 0;
        difference = (super.getBalance()-amountToWithdraw >= 0) ? amountToWithdraw : (super.getBalance()-amountToWithdraw > -100) ? amountToWithdraw  + 10: 0;
        super.withdraw(difference);
        return super.getBalance();
    }

}
