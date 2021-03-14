/**
 * 
 */
package cruz.patterns.structural.singleton;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author Alan
 *
 */
public class SingletonTest extends TestCase {
	
	SingletonTemplate firstSingleton;
	SingletonTemplate secondSingleton;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SingletonTest( String testName ) {
    	
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
    	
        return new TestSuite( SingletonTest.class );
    }

    /**
     * Test 
     */
    public void testSingleton() {
    	
    	firstSingleton = SingletonTemplate.getInstance();
    	secondSingleton = SingletonTemplate.getInstance();
    	
        assertTrue( firstSingleton == secondSingleton );
    }	// run SingletonExample
}
