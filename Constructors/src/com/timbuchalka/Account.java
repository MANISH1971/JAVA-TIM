package com.timbuchalka;
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

// CONSTRUCTROR
 //public Account() { // blank
    public Account() {
        this("56789",2.50,"Default name","Default Addres","Default phone"); // after class
        System.out.println("Empty Constructer called");
    }


    public Account(String number,double balance,String customerName,String customerEmailAddress,String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
//        setNumber(number); // we can also do this while constructor
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999",100.55,customerName,customerEmailAddress,customerEmailAddress);
//        this.customerName = customerName; //default below is created by inellij
//        this.customerEmailAddress = customerEmailAddress;
//        this.customerPhoneNumber = customerPhoneNumber;
    }



    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Depost of "+depositAmount+" made. New balance is "+this.balance);
    }
    public void withdrawl(double withdrawlAmount) {
        if (this.balance - withdrawlAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawl not Processed");
        } else {
            this.balance -= withdrawlAmount;
            System.out.println("Withdrawl of "+withdrawlAmount+"processed. Remainning Balance Amount ="+this.balance);
        }
    }

// Getter & Setters

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        number = number;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double Balance) {
        balance = Balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }
    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
