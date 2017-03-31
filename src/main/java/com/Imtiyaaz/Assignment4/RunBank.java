package com.Imtiyaaz.Assignment4;
import javax.swing.*;

/**
 * Created by Imtiyaaz on 2017/03/30.
 */
public class RunBank {
    public static void main(String[]args)
    {



        ClientAcc cli = new ClientAcc();

       String firstName = JOptionPane.showInputDialog("Please enter your name: ");
        cli.setCName(firstName);
        String lastName = JOptionPane.showInputDialog("Please enter your Last Name: ");
        cli.setCSurname(lastName);
        String number = JOptionPane.showInputDialog("Please enter your Bank Acc number bro: ");
        int BankNum = Integer.parseInt(number);
        cli.setAccountNumber(BankNum);
        String ty = JOptionPane.showInputDialog("Please Enter the Account type ");
        cli.setAccountType(ty);
       String FBalance = JOptionPane.showInputDialog("Enter Account Balance: R");
        int accBal = Integer.parseInt(FBalance);
        cli.setBalan(accBal);
        String depo = JOptionPane.showInputDialog("Enter amount to deposit: R");
        int dep = Integer.parseInt(depo);
        cli.deposit(dep);
        if(accBal > 0) {
            String withraw = JOptionPane.showInputDialog("Enter amount to withdraw: R");
            int wDraw = Integer.parseInt(withraw);
            cli.withD(wDraw);
        }
        JOptionPane.showMessageDialog(null, "Account Number: " +cli.getAccountNumber() + "\nName " + cli.getCName()+ "\nSurname " + cli.getCSurname() + "\nAccount Type: " + cli.getAccountType() + "\nBalance: " + cli.getBalan());
    }

        





    }


