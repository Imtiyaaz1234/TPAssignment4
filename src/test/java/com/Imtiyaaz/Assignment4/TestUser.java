package com.Imtiyaaz.Assignment4;

import com.Imtiyaaz.Assignment4.SingleResponsibilityPrinciple.Violation.UserFix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ameer on 2017/03/31.
 */
public class TestUser {
    UserFix fix = new UserFix();
    @Before
    public void setUp() throws Exception {
        fix = new UserFix();

    }

    @Test
    public void testSetSender() throws Exception {
        fix.setSender("JohnDoe@gmail.com");
        Assert.assertEquals("JohnDoe@gmail.com","JohnDoe@gmail.com");
    }

    @Test
    public void testSetReceiver() throws Exception {
        fix.setReceiver("JaneDoe@gmail.com");
        Assert.assertEquals("JaneDoe@gmail.com","JaneDoe@gmail.com");
    }

    @Test
    public void testSetMessage() throws Exception {
        fix.setContent("Hello World");
        Assert.assertEquals("Hello World", "Hello World");
    }
}
