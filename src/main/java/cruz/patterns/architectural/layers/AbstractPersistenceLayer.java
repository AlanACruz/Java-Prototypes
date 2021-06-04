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
package cruz.patterns.architectural.layers;

import java.util.HashMap;

/**
 * @author Alan
 *
 */
public abstract class AbstractPersistenceLayer
{
	private HashMap<String, AbstractDataAccessObject> daoMap = new HashMap<String, AbstractDataAccessObject>();

	/**
	 * @return the daoMap
	 */
	public HashMap<String, AbstractDataAccessObject> getDaoMap()
	{
		return daoMap;
	}

	/**
	 * @param daoMap the daoMap to set
	 */
	public void setDaoMap(HashMap<String, AbstractDataAccessObject> daoMap)
	{
		this.daoMap = daoMap;
	}

}
