/**
 * 
 */
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
