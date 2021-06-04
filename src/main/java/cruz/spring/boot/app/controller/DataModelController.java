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
package cruz.spring.boot.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cruz.spring.boot.app.domain.DataModel;
import cruz.spring.boot.app.exception.ModelNotFoundException;
import cruz.spring.boot.app.service.ModelService;

/**
 * DataModel Controller
 */
@RestController
@RequestMapping("DataModel")
public class DataModelController
{
	/**
	 * Service Layer
	 */
	private final ModelService modelService;

	/**
	 * Controller Constructor
	 * 
	 * @param modelService
	 */
	public DataModelController(ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * Get Mapping
	 * 
	 * @param modelName
	 * @return Data Model
	 */
	@GetMapping("/{modelName}")
	public DataModel getModel(@PathVariable String modelName)
	{
		DataModel modelDetails = modelService.findModel(modelName);

		if (modelDetails == null)
		{
			throw new ModelNotFoundException();
		}

		return modelDetails;
	}
}
