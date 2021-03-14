/**
 * 
 */
package cruz.patterns.architectural.layers;

import cruz.patterns.architectural.mvc.AbstractModel;

/**
 * @author Alan
 *
 */
public abstract class AbstractDataAccessObject {
	
	/**
	 * SQL: INSERT
	 * @param model
	 * @return success
	 */
	public abstract boolean create(AbstractModel model);
	
	/**
	 * SQL: SELECT
	 * @param model
	 * @return success
	 */
	public abstract boolean read(AbstractModel model);
	
	/**
	 * SQL: UPDATE
	 * @param model
	 * @return success
	 */
	public abstract boolean update(AbstractModel model);
	
	/**
	 * SQL: DELETE
	 * @param model
	 * @return success
	 */
	public abstract boolean delete(AbstractModel model);
}
