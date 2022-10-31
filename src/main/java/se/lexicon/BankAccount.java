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
    private int balanceNumber;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private String customerPhone;

    //Constructors

    public BankAccount() {
        this.accountNumber = ++sequencer;
    }

    public BankAccount(int accountNumber, int balanceNumber, String customerFirstName, String customerLastName,
                       String customerEmail, String customerPhone) {
        this();
        this.accountNumber = accountNumber;
        this.balanceNumber = balanceNumber;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public BankAccount(int balanceNumber, String customerFirstName, String customerLastName, String customerEmail,
                       String customerPhone) {
        this.balanceNumber = balanceNumber;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public BankAccount(String customerFirstName, String customerLastName, String customerEmail, String customerPhone) {
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerEmail= customerEmail;
        this.customerPhone = customerPhone;
    }

    public BankAccount(String customerFirstName, String customerLastName) {
        //this();
        //setBrand(brand);
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
    }


    //Methods
    public String getCustomerInformation(){
        return "Account Number: "+ accountNumber +"\n" + "Customers Name: " + customerFirstName + " " +
                "Customers Last Name: " + customerLastName;

    }

    public String getCustomerInformationL(){
        return "Account Number: "+ accountNumber +"\n" + "Customers Name: " + customerFirstName + " " + "Customers Last Name: " +
                customerLastName + "Customer Email:" + customerEmail + "Customer Phone: " + customerPhone;
    }


    //Getters & Setters
    public int getAccountNo() {

        return accountNumber;
    }

    /*public void setAccountNo(int accountNumber) {
        this.accountNumber = accountNumber;
    }*/

    public int getBalanceNo() {

        return balanceNumber;
    }

    public void setBalancNo(int balanceNumber) {

        this.balanceNumber = balanceNumber;
    }

    public String getFirstName() {

        return customerFirstName;
    }

    public void setFirstName(String customerFirstName) {

        this.customerFirstName = customerFirstName;
    }

    public String getLastName() {

        return customerLastName;
    }

    public void setLastName(String customerLastName) {

        this.customerLastName = customerLastName;
    }

    public String getEmail() {

        return customerEmail;
    }

    public void setEmail(String customerEmail) {

        this.customerEmail = customerEmail;
    }

    public String getPhone() {

        return customerPhone;
    }

    public void setPhone(String customerPhone) {

        this.customerPhone = customerPhone;
    }

}
