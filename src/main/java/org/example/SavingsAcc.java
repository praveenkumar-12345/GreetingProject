package org.example;

public class SavingsAcc {
    double balance;
    public SavingsAcc(double bal){
        this.balance=bal;
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            //balance-=1;
            System.out.println(amount+" is withdrwan and balance is"+balance);
        }
        else{
            System.out.println("withdrawn amount is less tahn the balance");
        }
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Acc deposited successfully with"+amount+" and now the balanace is "+balance);
    }
    public double getbalance(){
        System.out.println("Balance is "+balance);
        return balance;
    }
}
