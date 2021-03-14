/**
 * 
 */
package cruz.patterns.structural.singleton;

/**
 * @author Alan
 *
 */
public final class SingletonTemplate {
	
	// Singleton object to be returned by getSingletonInstance
	private static final SingletonTemplate singleton = new SingletonTemplate ();

	// private constructor prevents instantiation by clients
	private SingletonTemplate () {
		
		// System.err.println("Singleton objects created.");
	}
	
	// return static Singleton object
	public static SingletonTemplate getInstance() {
		
		return singleton;
	}
}
