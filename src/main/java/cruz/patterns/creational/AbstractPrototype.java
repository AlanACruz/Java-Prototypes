/**
 * 
 */
package cruz.patterns.creational;

/**
 * @author Alan
 *
 */
public abstract class AbstractPrototype implements Cloneable {

	// Reference to the prototype
	AbstractPrototype prototype = null;
	
	public AbstractPrototype(AbstractPrototype proto) {
		
		// maintain a reference to the prototype chain
		prototype = proto;
	}
	
	/** 
	 * Override of protected Object.clone().
	 */
	@Override
	public abstract Object clone();
}
