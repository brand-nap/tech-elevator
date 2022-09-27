package com.techelevator;

public class SavingsAccount extends BankAccount{


    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }



    public int withdraw(int amountToWithdraw){
        int difference = 0;
        difference =  (super.getBalance()-amountToWithdraw >= 150) ? amountToWithdraw : (super.getBalance()-amountToWithdraw-2 >= 0) ? amountToWithdraw + 2 : 0;
        super.withdraw(difference);
        return super.getBalance();
    }

}
