/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Isaack
 */
public class BankGUI {
    public static boolean RIGHT_TO_LEFT = false;
    
    public static void addComponentsToPane(Container pane) {
        
        if (!(pane.getLayout() instanceof BorderLayout)) {
            pane.add(new JLabel("Container doesn't use BorderLayout!"));
            return;
        }
        
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(
                    java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        }
        
        
        JLabel welcome= new JLabel("Welcome to Strathmore Bank");
        pane.add(welcome, BorderLayout.PAGE_START);
        
        //Make the center component big, since that's the
        //typical usage of BorderLayout.
        JButton buttonDeposit = new JButton("2. Deposit");
        buttonDeposit.setPreferredSize(new Dimension(200, 100));
        pane.add(buttonDeposit, BorderLayout.CENTER);
        
        JButton buttonAccCreate = new JButton("1. Account Creation");
        pane.add(buttonAccCreate, BorderLayout.LINE_START);
        
        JButton buttonStatusCheck = new JButton("5. Status Check");
        pane.add(buttonStatusCheck, BorderLayout.PAGE_END);
        
        JButton buttonWithdraw = new JButton("4. Withdraw");
        pane.add(buttonWithdraw, BorderLayout.LINE_END);
    }
    private static void createAndShowGUI() {
        
        //Create and set up the window.
        JFrame frame = new JFrame("Strathmore Bank");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        //Use the content pane's default BorderLayout. No need for
        //setLayout(new BorderLayout());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
   public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}
