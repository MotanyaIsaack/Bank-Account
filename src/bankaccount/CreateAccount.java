/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

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
        welcome.setText("Welcome to Strathmore Bank");
        
        JLabel firstName = new JLabel();
        firstName.setText("First Name: ");
        
        JLabel lastName = new JLabel();
        lastName.setText("Last Name: ");
        
        JLabel dob = new JLabel();
        dob.setText("DOB (Day/Date/Year)");
        
        JLabel idNumber = new JLabel();
        idNumber.setText("ID Number: ");
        
        JTextField txtFirstName,txtLastName,txtDOB,txtIdNumber;
        txtFirstName = new JTextField();
        txtLastName = new JTextField();
        txtDOB = new JTextField();
        txtIdNumber = new JTextField();
        
        panel.setLayout(null);
        welcome.setBounds(300, 10, 300, 10);
        firstName.setBounds(300, 40, 300, 10);
        
        panel.add(welcome);
        panel.add(firstName);
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        frame.setVisible(true);
        
    }
     public static void main(String[] args) {
         CreateAccount create = new CreateAccount();
    }
}


