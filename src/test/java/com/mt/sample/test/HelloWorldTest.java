package com.mt.sample.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for HelloWorld.
 */
public class HelloWorldTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HelloWorldTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HelloWorldTest.class );
    }

    /**
     * Rigourous test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}


