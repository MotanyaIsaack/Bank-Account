/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Isaack
 */
public class AccountCreation {
    public String firstName;
    public String lastName;
    public String dob;
    public String idNumber;
    public String accountNumber;
    public String balance;
    
   
    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

   

    public AccountCreation(String firstName, String lastName, String dob, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.dob = dob;
        
    }
    public AccountCreation(){
        
    }
    
    public void showDetails(){
        System.out.println("-----------------Account Details--------------------- ");
        System.out.println("First Name: "+getFirstName());
        System.out.println("Last Name: "+getLastName());
        System.out.println("ID Number"+getIdNumber());
        System.out.println("Date Of Birth: "+getDob());
        System.out.println("Accout Number: "+getAccountNumber());
    }
    
    
    
}
