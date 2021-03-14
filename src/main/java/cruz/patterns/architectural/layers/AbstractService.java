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

import cruz.patterns.architectural.mvc.AbstractModel;

/**
 * @author Alan
 *
 */
public abstract class AbstractService {

	private AbstractCommunicationLayer communicationLayer = null;
	private AbstractBusinessLayer businessLayer = null;
	private AbstractPersistenceLayer persistenceLayer = null;
	private AbstractModel model = null;

	/**
	 * @param communicationLayer
	 * @param businessLayer
	 * @param persistenceLayer
	 */
	public AbstractService(AbstractCommunicationLayer communicationLayer, 
			               AbstractBusinessLayer businessLayer, 
			               AbstractPersistenceLayer persistenceLayer) {
		
		super();
		this.communicationLayer = communicationLayer;
		this.businessLayer = businessLayer;
		this.persistenceLayer = persistenceLayer;
	}

	/**
	 * @return the communicationLayer
	 */
	public AbstractCommunicationLayer getCommunicationLayer() {
		
		return communicationLayer;
	}

	/**
	 * @param communicationLayer the communicationLayer to set
	 */
	public void setCommunicationLayer(AbstractCommunicationLayer communicationLayer) {
		
		this.communicationLayer = communicationLayer;
	}

	/**
	 * @return the businessLayer
	 */
	public AbstractBusinessLayer getBusinessLayer() {
		
		return businessLayer;
	}

	/**
	 * @param businessLayer the businessLayer to set
	 */
	public void setBusinessLayer(AbstractBusinessLayer businessLayer) {
		
		this.businessLayer = businessLayer;
	}

	/**
	 * @return the persistenceLayer
	 */
	public AbstractPersistenceLayer getPersistenceLayer() {
		
		return persistenceLayer;
	}

	/**
	 * @param persistenceLayer the persistenceLayer to set
	 */
	public void setPersistenceLayer(AbstractPersistenceLayer persistenceLayer) {
		
		this.persistenceLayer = persistenceLayer;
	}

	/**
	 * @return the model
	 */
	public AbstractModel getModel() {
		
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(AbstractModel model) {
		
		this.model = model;
	}
	
}
