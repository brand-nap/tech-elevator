package com.techelevator;

public class CreditCardAccount implements Accountable{
    private String accountHolder;
    private String accountNumber;
    private int debt;

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }

    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    @Override
    public int getBalance() {
        return 0-debt;
    }

    public int pay(int amountToPay){
        debt-=amountToPay;
        return getBalance();
    }

    public int charge(int amountToCharge){
        debt+=amountToCharge;
        return getBalance();
    }
}
