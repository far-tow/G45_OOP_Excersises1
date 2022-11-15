/******************************************************************************
 * Copyright (c) Farhad Towfighian 2022.                                      *
 * https://github.com/far-tow                                                 *
 ******************************************************************************/

package se.lexicon;

public class BankAccount {

    //Sequencer for account number
    private static int sequencer = 12345;

    //Fields
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //Constructors

    public BankAccount(int balance, String customerName, String customerEmail, String customerPhone) {
        this.accountNumber= ++sequencer;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }



    //Methods
    public void deposit (double amount){
        if (amount < 0){
            throw new IllegalArgumentException("Amount has to be more than 0");

        }
        balance = balance + amount;
    }
    public double withDraw (double amount){
        if (amount < 0){
            throw new IllegalArgumentException("Amount has to be more than 0");
        }
        if (amount > balance){
            throw new IllegalArgumentException("Amount is greater than the balance!!");
        }
        balance = balance - amount;
        return balance;
    }




    //Getters & Setters


    public int getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {

        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                '}';
    }
}
