package com.Imtiyaaz.Assignment4;

import com.Imtiyaaz.Assignment4.Composition.BankAccount;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Imtiyaaz on 2017/03/31.
 */
public class TestBankAccount {
    private BankAccount bankObject;

    @Before
    public void setUp() throws Exception {
        bankObject = new BankAccount();
    }

    @Test
    public void testSetAccountNumber() throws Exception {
        bankObject.setAccountNumber(987654321);
        Assert.assertEquals(987654321,987654321);
    }

    @Test
    public void testSetAccountType() throws Exception {
        bankObject.setAccountType("Cheque Account");
        Assert.assertEquals("Cheque Account", "Cheque Account");
    }

    @Test
    public void testSetAccountBalance() throws Exception {
        bankObject.setAccountBalance(939393);
        Assert.assertEquals(939393,939393);
    }

    @Test
    public void testGetAccountNumber() throws Exception {
        bankObject.setAccountNumber(123456789);
        Assert.assertEquals(bankObject.getAccountNumber(),123456789);
    }

    @Test
    public void testGetAccountType() throws Exception {
        bankObject.setAccountType("Cheque Account");
        Assert.assertEquals(bankObject.getAccountType(),"Cheque Account");
    }

    @Test
    public void testGetAccountBalance() throws Exception {
        bankObject.setAccountBalance(7000000);
        Assert.assertEquals(bankObject.getAccountBalance(),7000000,0);
    }

    @Test
    public void testWithdraw() throws Exception {
        bankObject.setAccountBalance(8000000);
        bankObject.withD(2000000);
        Assert.assertEquals(9000000,6000000);
    }

    @Test
    public void testDeposit() throws Exception {
        bankObject.setAccountBalance(5000000);
        bankObject.deposit(800000);
        Assert.assertEquals(3500000,6500000);
    }
}
