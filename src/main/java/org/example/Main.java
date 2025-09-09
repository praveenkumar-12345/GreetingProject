package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SavingsAcc savacc=new SavingsAcc(4000);
        savacc.getbalance();
        savacc.withdraw(2000);
        savacc.getbalance();
        savacc.deposit(3000);
        savacc.getbalance();
    }
}