/**
 * 
 */
package cruz.patterns.structural.singleton;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author Alan
 *
 */
public class SingletonTest {
	
	SingletonTemplate firstSingleton;
	SingletonTemplate secondSingleton;
	
    /**
     * Test 
     */
    @Test
    public void testSingleton() {
    	
    	firstSingleton = SingletonTemplate.getInstance();
    	secondSingleton = SingletonTemplate.getInstance();
    	
        assertTrue( firstSingleton == secondSingleton );
    }	// run SingletonExample
}
