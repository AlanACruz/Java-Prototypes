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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import cruz.spring.boot.app.controller.DataModelController;
import cruz.spring.boot.app.domain.DataModel;
import cruz.spring.boot.app.service.ModelService;

/**
 * Model Controller Test
 */
@WebMvcTest(controllers = DataModelController.class)
public class DataModelControllerTest
{

	/**
	 * Service bean to go inside the controller
	 */
	@MockBean
	private ModelService service;

	/**
	 * Mocked client
	 */
	@Autowired
	private MockMvc mockMvc;

	/**
	 * Test for invalid name
	 * 
	 * @throws Exception
	 */
	@Test
	void whenInvalidInput_thenReturns404() throws Exception
	{

		// given
		String name = "testModelName";

		// when
		mockMvc
				.perform(get("/DataModel/{modelName}", name).contentType("application/json"))

				// then
				.andExpect(status().isNotFound()) //
				.andExpect(jsonPath("$.error").value("Model Not Found"));
	}

	/**
	 * Test for valid name
	 * 
	 * @throws Exception
	 */
	@Test
	void whenInvalidInput_thenReturns200() throws Exception
	{

		// given
		DataModel expected = new DataModel("testModelName");

		Mockito.when(service.findModel(expected.getModelName())).thenReturn(expected);

		// when
		mockMvc
				.perform(get("/DataModel/{modelName}", expected.getModelName()).contentType("application/json"))

				// then
				.andExpect(status().isOk()) //
				.andExpect(jsonPath("$.modelName").value(expected.getModelName()));
	}
}
