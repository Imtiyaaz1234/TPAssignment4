package com.Imtiyaaz.Assignment4;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Imtiyaaz on 2017/03/31.
 */
public class TestBankingAcc {
    private  BankingAcc accObject;
    @Before
    public void setUp() throws Exception {
        accObject = new BankingAcc();
    }

    @Test
    public void testSetAccountNumber() throws Exception {
        accObject.setAccountNumber(987654321);
        Assert.assertEquals(987654321,987654321);
    }

    @Test
    public void testSetAccountType() throws Exception {
        accObject.setAccountType("Cheque Account");
        Assert.assertEquals("Cheque Account", "Cheque Account");
    }

    @Test
    public void testSetAccountBalance() throws Exception {
        accObject.setBalan(939393);
        Assert.assertEquals(939393,939393);
    }

    @Test
    public void testGetAccountNumber() throws Exception {
        accObject.setAccountNumber(123456789);
        Assert.assertEquals(accObject.getAccountNumber(),123456789);
    }

    @Test
    public void testGetAccountType() throws Exception {
        accObject.setAccountType("Cheque Account");
        Assert.assertEquals(accObject.getAccountType(),"Cheque Account");
    }

    @Test
    public void testGetAccountBalance() throws Exception {
        accObject.setBalan(7000000);
        Assert.assertEquals(accObject.getBalan(),7000000,0);
    }

    @Test
    public void testWithdraw() throws Exception {
        accObject.setBalan(7000000);
        accObject.withD(1000000);
        Assert.assertEquals(6000000,6000000);
    }

    @Test
    public void testDeposit() throws Exception {
        accObject.setBalan(7000000);
        accObject.deposit(500000);
        Assert.assertEquals(7500000,7500000);
    }
}
