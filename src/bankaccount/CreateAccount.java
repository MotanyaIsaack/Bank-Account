/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import static bankaccount.BankAccount.accountMap;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.ws.Service;

/**
 *
 * @author Isaack
 */

public class CreateAccount extends JFrame {
    static HashMap<Integer, Object> accountMap = new HashMap<>();
    
    public CreateAccount(){
        
        JFrame frame = new JFrame("Strathmore Bank");
        
        
        JPanel panel = new JPanel();
        panel.setSize(800,500);
        frame.add(panel);
        
        JLabel welcome = new JLabel();
        welcome.setText("ACCOUNT CREATION");
//        welcome.setSize(250, 50);
        welcome.setFont(new Font("Courier", Font.BOLD,25));
        JLabel accountNumber = new JLabel();
        accountNumber.setText("Account Number: ");
        accountNumber.setFont(new Font("Courier", Font.BOLD,15));
        
        JLabel firstName = new JLabel();
        firstName.setText("First Name: ");
        firstName.setFont(new Font("Courier", Font.BOLD,15));
        
        JLabel lastName = new JLabel();
        lastName.setText("Last Name: ");
        lastName.setFont(new Font("Courier", Font.BOLD,15));
        
        JLabel dob = new JLabel();
        dob.setText("DOB (Day/Date/Year)");
        dob.setFont(new Font("Courier", Font.BOLD,15));
        
        JLabel idNumber = new JLabel();
        idNumber.setText("ID Number: ");
        idNumber.setFont(new Font("Courier", Font.BOLD,15));
        
        JTextField txtFirstName,txtLastName,txtDOB,txtIdNumber,txtAccountnumber;
        txtAccountnumber = new JTextField(20);
        txtAccountnumber.setEditable(false);
        txtFirstName = new JTextField(20);
        txtLastName = new JTextField(20);
        txtDOB = new JTextField(20);
        txtIdNumber = new JTextField(20);
        
        JButton createAccount = new JButton("Create Account");
        createAccount.setText("Create Account");
        createAccount.setFont(new Font("Courier", Font.BOLD,15));
        createAccount.setSize(200, 250);
        
        
        
        
        
        panel.setLayout(null);
        welcome.setBounds(250, 30, 300, 70);
        accountNumber.setBounds(150, 100, 350, 30);
        txtAccountnumber.setBounds(300, 100, 350, 30);
        firstName.setBounds(150, 150, 350, 30);
        txtFirstName.setBounds(300, 150, 350, 30);
        lastName.setBounds(150, 200, 350, 30);
        txtLastName.setBounds(300, 200, 350, 30);
        dob.setBounds(150, 250, 350, 30);
        txtDOB.setBounds(300, 250, 350, 30);
        idNumber.setBounds(150,300, 350, 30);
        txtIdNumber.setBounds(300, 300, 350, 30);
        createAccount.setBounds(350, 350, 250, 40);
        
        panel.add(welcome);
        panel.add(accountNumber);
        panel.add(txtAccountnumber);
        panel.add(firstName);
        panel.add(txtFirstName);
        panel.add(lastName);
        panel.add(txtLastName);
        panel.add(dob);
        panel.add(txtDOB);
        panel.add(idNumber);
        panel.add(txtIdNumber);
        panel.add(createAccount);
        
        
        int iaccountNumber = accountMap.size()+1;
        String saccountNumber = (String.valueOf(iaccountNumber));
        txtAccountnumber.setText(saccountNumber);
        
        createAccount.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e) {
                
//                String saccountNumber = ("SB1"+String.valueOf(accountNumber));
                
                String firstName = txtFirstName.getText();
                String lastName = txtLastName.getText();
                String dob = txtDOB.getText();
                String idNumber = txtIdNumber.getText();
                if (firstName.length() == 0 || isInt(firstName)) {
                    JOptionPane.showMessageDialog(null, "Please Enter a Valid First Name");
                } else if(lastName.length() == 0 || isInt(lastName)) {
                     JOptionPane.showMessageDialog(null, "Please Enter a Valid Last Name");
                }else if(dob.length() == 0 || isInt(dob)){
                    JOptionPane.showMessageDialog(null, "Please Enter a Valid Date Of Birth");
                }else if(idNumber.length() == 0 || !isInt(idNumber)){
                    JOptionPane.showMessageDialog(null, "Please Enter a Valid Phone Number");
                }else{
//                     int accountNumber = accountMap.size()+1;
                    int balance = 0;
                    
                     accountMap.put(iaccountNumber, new AccountCreation(firstName, lastName, dob, idNumber));
                     AccountCreation tempObject = (AccountCreation) accountMap.get(iaccountNumber);
                     tempObject.setAccountNumber(saccountNumber);
                     tempObject.setBalance(String.valueOf(balance));
                     frame.setVisible(false);
                     frame.dispose();
                     Menu menu = new Menu();
                }
                
               
            }
        });
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        frame.setVisible(true);
        
    }
    public static boolean isInt(String s){
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
     
     public static void main(String[] args) {
         CreateAccount create = new CreateAccount();
    }
}


