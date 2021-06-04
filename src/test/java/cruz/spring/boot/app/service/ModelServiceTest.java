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
package cruz.spring.boot.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import cruz.spring.boot.app.domain.DataModel;
import cruz.spring.boot.app.repository.DataModelRepository;
import cruz.spring.boot.app.service.ModelService;

/**
 * Service Layer Test
 */
class ModelServiceTest
{

	/**
	 * Mocked Model Repo
	 */
	@Mock
	DataModelRepository mockRepository;

	/**
	 * Class Under Test
	 */
	@InjectMocks
	ModelService serviceUnderTest;

	/**
	 * Setup for Before
	 */
	@BeforeEach
	void setup()
	{

		MockitoAnnotations.openMocks(this);
	}

	/**
	 * Make sure service layer calls the correct repo, passing in good data
	 */
	@Test
	public void testModelService_givenValidDataModel_returnsDataModel()
	{

		// given
		DataModel expected = new DataModel("testModelName");

		Mockito.when(mockRepository.findByModelName(expected.getModelName())).thenReturn(expected);

		// when
		DataModel actual = serviceUnderTest.findModel(expected.getModelName());

		// then
		assertEquals(actual, expected);
	}

	/**
	 * Make sure service layer calls the correct repo, passes in bad data
	 */
	@Test
	public void testModelService_givenInvalidDataModel_returnsNull()
	{

		// given
		DataModel expected        = null;
		String    nonExsitantName = "testModelName";

		Mockito.when(mockRepository.findByModelName(nonExsitantName)).thenReturn(null);

		// when
		DataModel actual = serviceUnderTest.findModel(nonExsitantName);

		// then
		assertEquals(actual, expected);
	}
}
