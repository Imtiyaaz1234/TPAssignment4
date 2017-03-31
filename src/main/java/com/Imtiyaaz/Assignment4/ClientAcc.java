package com.Imtiyaaz.Assignment4;

/**
 * Created by Imtiyaaz on 2017/03/30.
 */
public class ClientAcc extends BankingAcc {
    private String CName;
    private String CSurname;

    public ClientAcc()
    {

    }

    public ClientAcc(String name, String surname, BankingAcc acc)
    {

    }

    public void setCName(String name)
    {
        CName = name;
    }

    public String getCName()
    {
        return CName;
    }

    public void setCSurname(String surname)
    {
        CSurname = surname;
    }

    public String getCSurname()
    {
        return CSurname;
    }
}
