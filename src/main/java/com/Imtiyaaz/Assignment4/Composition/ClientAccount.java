package com.Imtiyaaz.Assignment4.Composition;

/**
 * Created by Ameer on 2017/03/30.
 */
public class ClientAccount {
    private String ClientFirstname;
    private String ClientSurname;
    private BankAccount bankAcc;

    public ClientAccount()
    {

    }

    public ClientAccount(String FirstName, String Surname, BankAccount bank)
    {

    }

    public void setClientFirstname(String Firstname)
    {
        ClientFirstname = Firstname;
    }

    public String getClientFirstname()
    {
        return ClientFirstname;
    }

    public void setClientSurname(String Surname)
    {
        ClientSurname = Surname;
    }

    public String getClientSurname()
    {
        return ClientSurname;
    }

    public void setBankAcc(BankAccount bank)
    {
        bankAcc = bank;
    }

    public BankAccount getBankAcc()
    {
        return bankAcc;
    }

    public String toString()
    {
        String message = String.format("Client Name: %s\nClient Surname: %s\n%s\n", getClientFirstname(), getClientSurname(), getBankAcc());
        return message;
    }

}
