package com.Imtiyaaz.Assignment4.Composition;

/**
 * Created by Imtiyaaz on 2017/03/30.
 */
public class BankAccount {

        private int AccountNumber;
        private String AccountType;
        private double balan;
        public BankAccount()
        {

        }

        public BankAccount(int number, String AccType, double balance)
        {

        }

        public void setAccountNumber(int number)
        {
            AccountNumber = number;
        }

        public void setAccountType(String AccType)
        {
            AccountType = AccType;
        }

        public void setAccountBalance(double balance)
        {
            balan = balance;
        }

        public int getAccountNumber()
        {
            return AccountNumber;
        }

        public String getAccountType()
        {
            return AccountType;
        }

        public double getAccountBalance()
        {
            return balan;
        }

        public double withD(double amount)
        {
            return balan -= amount;
        }

        public double deposit(double amount)
        {
            return balan += amount;
        }

        public String toString()
        {
            String message = String.format("Account Number: %s\nAccount Type: %s\nAccount Balance: R%s\n", getAccountNumber(), getAccountType(), getAccountBalance());
            return message;
        }
    }


