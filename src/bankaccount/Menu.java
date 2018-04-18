/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu {
    public Menu(){
        JFrame frame = new JFrame("Strathmore Bank");
        
        JPanel panel = new JPanel();
        panel.setSize(800,500);
        panel.setLayout(null);
        frame.add(panel);
        
        JLabel createAccount = new JLabel("Create Account");
        createAccount.setSize(200, 200);
        createAccount.setFont(new Font("Courier", Font.BOLD,15));
        createAccount.setBackground(Color.red);
        
        createAccount.setBounds(150, 150, 150, 150);
        
        panel.add(createAccount);
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Menu menu = new Menu();
    }
}
