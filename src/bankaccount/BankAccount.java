/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;


import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaack
 */
public class BankAccount {

    /**
     * @param args the command line arguments
     */
   static HashMap<Integer, Object> accountMap = new HashMap<>();
    public static void main(String[] args) {
        // TODO code application logic here
         int option;
        
        do {  
            menu();

           
            Scanner input = new Scanner(System.in);
            option = input.nextInt();

            switch(option){
                case 1: 
                    clearScreen();
                    accountFill();               
                    break;
                case 2:
                    clearScreen();
                    withdrawals();
                    break;
                case 3:
                    clearScreen();
                    deposit();
                    break;
                case 4:
                    clearScreen();
                    statusCheck();
                    break;
                default:
                     System.out.println("Enter a valid Input");
                     break;

            }
        } while (option!=0);
        
            
        
    }
     public static void menu(){
          System.out.println("Welcome to Strath Bank of Kenya. \n Please choose"
                    + "an option:");
            System.out.println("1. Account Creation");
            System.out.println("2. Withdrawals");
            System.out.println("3. Deposits");
            System.out.println("4. Status Check (Account Balance)");
            System.out.println("0. Exit");
            System.out.println("Option: ");          
            
     }
     
     public static void accountFill(){
        Scanner accFill = new Scanner(System.in);
        System.out.println("1. Enter your First Name");
        String firstName = accFill.next();
        System.out.println("2. Enter your Last Name");
        String lastName = accFill.next();
        System.out.println("3. Enter your Day/Date/Year of birth in that sequence");
        String dob = accFill.next();
        System.out.println("4. Enter your ID number");
        String idNumber = accFill.next();
        
         int accountNumber = accountMap.size() + 1;
        accountMap.put(accountNumber, new AccountCreation(firstName, lastName, dob, idNumber));
        AccountCreation tempObject = (AccountCreation) accountMap.get(accountNumber);
        tempObject.setAccountNumber(Integer.toString(accountNumber));
        tempObject.setBalance(Integer.toString(0));
        
         clearScreen();
         
         tempObject.showDetails();
        
    }
     
    public static void clearScreen() {        
     
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    public static void withdrawals(){
        
        System.out.println("------------------------Withdrawal----------------");
        System.out.println("Enter your Account Number");
        Scanner withdraw = new Scanner(System.in);
        String accountNumber = withdraw.next();
        
        if (!accountMap.containsKey(Integer.parseInt(accountNumber))) {
            System.out.println("The Account Number does not exist");
            withdrawals();
        } else{
            int amount =0;
            AccountCreation tempObjectWithdraw = (AccountCreation) accountMap.get(Integer.parseInt(accountNumber));
            System.out.println("Account Number: " + tempObjectWithdraw.getAccountNumber());
            System.out.println("Current Balance: "+tempObjectWithdraw.getBalance());

            System.out.println("Amount: ");
            amount = withdraw.nextInt();
            int balance =  Integer.parseInt(tempObjectWithdraw.getBalance());

            if ( amount < balance) {
                balance = balance - amount;
                tempObjectWithdraw.setBalance(Integer.toString(balance));
                System.out.println("Withdrawal Succesful");
            } else {
                System.out.println("Insufficient Balance");

            }
         }
    }
    
    public static void deposit(){
         System.out.println("------------------------Deposits----------------");
        System.out.println("Enter your Account Number");
        Scanner deposit = new Scanner(System.in);
        String accountNumber = deposit.next();
        
        if (!accountMap.containsKey(Integer.parseInt(accountNumber))) {
            System.out.println("The Account Number does not exist");
            deposit();
        }else{
             int amount =0;
            AccountCreation tempObjectWithdraw = (AccountCreation) accountMap.get(Integer.parseInt(accountNumber));
            System.out.println("Account Number: " + tempObjectWithdraw.getAccountNumber());
            System.out.println("Current Balance: "+tempObjectWithdraw.getBalance());

            System.out.println("Amount: ");
            amount = deposit.nextInt();
            int balance =  Integer.parseInt(tempObjectWithdraw.getBalance());
            balance = balance+amount;
            tempObjectWithdraw.setBalance(Integer.toString(balance));
            System.out.println("Deposit Succesful");
            
        }
    }
    
    public static void statusCheck(){
         System.out.println("------------------------Mini-statement----------------");
        System.out.println("Enter your Account Number");
        Scanner status = new Scanner(System.in);
        String accountNumber = status.next();
        
        if (!accountMap.containsKey(Integer.parseInt(accountNumber))) {
            System.out.println("The Account Number does not exist");
            statusCheck();
        } else{
             AccountCreation tempObjectWithdraw = (AccountCreation) accountMap.get(Integer.parseInt(accountNumber));
             System.out.println("Account Number: " + tempObjectWithdraw.getAccountNumber());
             System.out.println("Current Balance: "+tempObjectWithdraw.getBalance());
        }
    }
}
