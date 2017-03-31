package com.Imtiyaaz.Assignment4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Imtiyaaz on 2017/03/31.
 */
public class TestClientAcc {
    private ClientAcc cli;
    @Before
    public void setUp() throws Exception {
        cli = new ClientAcc();
    }

    @Test
    public void testSetClientName() throws Exception {
        cli.setCName("Someone");
        Assert.assertEquals("Someone","NoOne");
    }

    @Test
    public void testSetClientSurname() throws Exception {
        cli.setCSurname("NoOne");
        Assert.assertEquals("Anyone", "Anyone");
    }

    @Test
    public void testGetClientName() throws Exception {
        cli.setCName("saint");
        Assert.assertEquals("Bernard", cli.getCName());
    }

    @Test
    public void testGetClientSurname() throws Exception {
        cli.setCSurname("Anyone");
        Assert.assertEquals("Anyone",cli.getCSurname());
    }
}
