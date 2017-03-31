package com.Imtiyaaz.Assignment4;

/**
 * Created by Imtiyaaz on 2017/03/29.
 */
public class BankingAcc {

    private int AccountNumber;
    private String AccountType;
    private double balan;

    public BankingAcc()
    {

    }

    public BankingAcc(int acc, String accType, double balance)
    {

    }

    public void setAccountNumber(int acc)
    {
        AccountNumber = acc;
    }

    public int getAccountNumber()
    {
        return AccountNumber;
    }

    public void setAccountType(String accType)
    {
        AccountType = accType;
    }

    public String getAccountType()
    {
        return AccountType;
    }

    public void setBalan(double balance)
    {
        balan = balance;
    }

    public double getBalan()
    {
        return balan;
    }

    public double deposit(double amount)
    {
        return balan += amount;
    }

    public double withD(double amount)
    {
        return balan -= amount;
    }
}
