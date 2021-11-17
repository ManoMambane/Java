package com.mano;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount > 0){
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        }else{
            System.out.println("Can't deposit negetive funds");
        }
    }
    public void withdraw(int amount){
        int withdrawal = -amount;
        if(withdrawal < 0){
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        }else{
            System.out.println("No funds to withdraw");
        }
    }
    public void calculatedBalance(){
        this.balance = 0;
        for(int i : this.transactions){
            this.balance += 1;
        }
        System.out.println("Calculated balance is " + this.balance);
    }
}
