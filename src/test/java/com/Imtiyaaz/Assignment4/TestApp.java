package com.Imtiyaaz.Assignment4;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

/**
 * Created by Ameer on 2017/03/31.
 */
public class TestApp extends TestCase {
    public TestApp( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return  (Test) new TestSuite( TestApp.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
