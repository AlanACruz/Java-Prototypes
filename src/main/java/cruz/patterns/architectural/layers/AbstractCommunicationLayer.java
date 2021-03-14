/**
 * 
 */
package cruz.patterns.architectural.layers;

import cruz.patterns.architectural.mvc.AbstractModel;

/**
 * @author Alan
 *
 */
public abstract class AbstractCommunicationLayer {

	/**
	 * SQL: INSERT
	 * @param model
	 * @return success
	 */
	public String doCreate( AbstractModel model ) {
		
		return create( model );
	}
	
	/**
	 * SQL: SELECT
	 * @param model
	 * @return success
	 */
	public String doRead( AbstractModel model ) {
		
		return select( model );
	}
	
	/**
	 * SQL: UPDATE
	 * @param model
	 * @return success
	 */
	public String doUpdate(AbstractModel model) {
		
		return update( model );
	}
	
	/**
	 * SQL: DELETE
	 * @param model
	 * @return success
	 */
	public String doDelete( AbstractModel model ){
		
		return delete( model );
	}

	public abstract String create( AbstractModel model );
	public abstract String select( AbstractModel model );
	public abstract String update( AbstractModel model );
	public abstract String delete( AbstractModel model );
}
