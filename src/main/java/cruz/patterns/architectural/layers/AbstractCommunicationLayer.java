/*******************************************************************************
 * Copyright (C) 2021 Alan Cruz
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
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
