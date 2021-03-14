/**
 * 
 */
package cruz.patterns.architectural.mvc;

import java.util.HashMap;

/**
 * @author Alan
 *
 */
public abstract class AbstractModel {
	
	private HashMap<String, String> data = new HashMap<String, String>();

	/**
	 * @return the data
	 */
	public HashMap<String, String> getData() {
		
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(HashMap<String, String> data) {
		
		this.data = data;
	}

}
