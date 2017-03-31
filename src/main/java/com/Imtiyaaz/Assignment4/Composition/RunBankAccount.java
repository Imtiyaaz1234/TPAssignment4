package com.Imtiyaaz.Assignment4.Composition;



import javax.swing.*;
/**
 * Created by Ameer on 2017/03/30.
 */
public class RunBankAccount {
    public static void main(String[] args) {
        ClientAccount client = new ClientAccount();
        BankAccount bankAc = new BankAccount();

        String firstName = JOptionPane.showInputDialog("Please enter your name: ");
        client.setClientFirstname(firstName);
        String lastName = JOptionPane.showInputDialog("Please enter your Last Name: ");
        client.setClientSurname(lastName);
        String number = JOptionPane.showInputDialog("Please enter your Bank Acc number bro: ");
        int BankNum = Integer.parseInt(number);
        bankAc.setAccountNumber(BankNum);
        String ty = JOptionPane.showInputDialog("Please Enter the Account type ");
        bankAc.setAccountType(ty);
        String FBalance = JOptionPane.showInputDialog("Enter Bank Account Balance: ");
        int accBal = Integer.parseInt(FBalance);
        bankAc.setAccountBalance(accBal);
        String depo = JOptionPane.showInputDialog("Enter amount to deposit in your Bank Account: ");
        int dep = Integer.parseInt(depo);
        bankAc.deposit(dep);
        if (accBal > 0) {
            String withraw = JOptionPane.showInputDialog("Enter amount to withdraw: R");
            int wDraw = Integer.parseInt(withraw);
            bankAc.withD(wDraw);
        }
        client.setBankAcc(bankAc);
        JOptionPane.showMessageDialog(null, client.toString());
    }
}
