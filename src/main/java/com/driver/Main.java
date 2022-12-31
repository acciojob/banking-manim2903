package com.driver;

public class Main {
    public static void main(String[] args)throws Exception {

        BankAccount Mani=new BankAccount("Mani",5000,0);
        CurrentAccount Gani=new CurrentAccount("Gani",10000,"BAT");
        SavingsAccount mani=new SavingsAccount("mani",1000,3,5);
        System.out.println(mani.getBalance());
        mani.withdraw(500);
        System.out.println(mani.getBalance());
        System.out.println(mani.getSimpleInterest(2));
        System.out.println(mani.getCompoundInterest(2,2));

    }
}