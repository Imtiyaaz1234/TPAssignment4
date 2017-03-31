package com.Imtiyaaz.Assignment4;

import com.Imtiyaaz.Assignment4.PrincipleLeastKnowledge.InvoiceFix;
import com.Imtiyaaz.Assignment4.PrincipleLeastKnowledge.RunPLKViolation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ameer on 2017/03/31.
 */
public class TestPLK {
    private RunPLKViolation plk;
    private InvoiceFix orderObect;
    private  boolean test = false;
    @Before
    public void setUp() throws Exception {
        plk = new RunPLKViolation();
        orderObect = new InvoiceFix();
    }

    @Test
    public void testProcess() throws Exception {
        try{

            test = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(test);
    }

    @Test
    public void testNormalise() throws Exception
    {
        try {
            orderObect.normalize();
            test = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(test);
    }
}
