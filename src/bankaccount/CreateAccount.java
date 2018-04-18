/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.ws.Service;

/**
 *
 * @author Isaack
 */

public class CreateAccount extends JFrame {
    
    public CreateAccount(){
        JFrame frame = new JFrame("Strathmore Bank");
        
        
        JPanel panel = new JPanel();
        panel.setSize(800,500);
        frame.add(panel);
        
        JLabel welcome = new JLabel();
        welcome.setText("ACCOUNT CREATION");
//        welcome.setSize(250, 50);
        welcome.setFont(new Font("Courier", Font.BOLD,25));
        
        
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
        
        JTextField txtFirstName,txtLastName,txtDOB,txtIdNumber;
        txtFirstName = new JTextField();
        txtLastName = new JTextField(20);
        txtDOB = new JTextField(20);
        txtIdNumber = new JTextField(20);
        
        JButton createAccount = new JButton("Create Account");
        createAccount.setText("Create Account");
        createAccount.setFont(new Font("Courier", Font.BOLD,15));
        createAccount.setSize(200, 250);
        
        
        
        panel.setLayout(null);
        welcome.setBounds(250, 30, 300, 70);
        firstName.setBounds(150, 100, 350, 30);
        txtFirstName.setBounds(300, 100, 350, 30);
        lastName.setBounds(150, 150, 350, 30);
        txtLastName.setBounds(300, 150, 350, 30);
        dob.setBounds(150, 200, 350, 30);
        txtDOB.setBounds(300, 200, 350, 30);
        idNumber.setBounds(150,250, 350, 30);
        txtIdNumber.setBounds(300, 250, 350, 30);
        createAccount.setBounds(350, 300, 250, 40);
        
        panel.add(welcome);
        panel.add(firstName);
        panel.add(txtFirstName);
        panel.add(lastName);
        panel.add(txtLastName);
        panel.add(dob);
        panel.add(txtDOB);
        panel.add(idNumber);
        panel.add(txtIdNumber);
        panel.add(createAccount);
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        frame.setVisible(true);
        
    }
     public static void main(String[] args) {
         CreateAccount create = new CreateAccount();
    }
}


