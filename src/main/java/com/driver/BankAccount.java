package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
        this.name=name;
        this.balance=balance;
        this.minBalance=minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception


        String s=Integer.toString(digits);
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'0' || s.charAt(i)>'9'){
                flag=false;
            }
        }
        int digitsSum=0;
        int digit=0;
        for(int i=0;i<s.length();i++){
            digit=digits%10;
            digitsSum+=digit;
            digits=digits/10;
        }

        if(flag==true && (digitsSum==sum) ){
            return s;
        }
       else
           throw new Exception("Account Number can not be generated");
    }

    public void deposit(double amount) {
        //add amount to balance
        this.balance=balance+amount;

    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        try{
            this.balance=balance-amount;
        }catch (Exception e){
            System.out.println("Insufficient Balance");
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinBalance() {
        return minBalance;
    }
}