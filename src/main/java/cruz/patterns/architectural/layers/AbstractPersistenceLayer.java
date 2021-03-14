/**
 * 
 */
package cruz.patterns.architectural.layers;

import java.util.HashMap;

/**
 * @author Alan
 *
 */
public abstract class AbstractPersistenceLayer {
	
	private HashMap<String, AbstractDataAccessObject> daoMap = new HashMap<String, AbstractDataAccessObject>();

	/**
	 * @return the daoMap
	 */
	public HashMap<String, AbstractDataAccessObject> getDaoMap() {
		
		return daoMap;
	}

	/**
	 * @param daoMap the daoMap to set
	 */
	public void setDaoMap(HashMap<String, AbstractDataAccessObject> daoMap) {
		
		this.daoMap = daoMap;
	}

}
