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
package cruz.spring.boot.app;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import cruz.spring.boot.app.domain.DataModel;
import cruz.spring.boot.app.repository.DataModelRepository;

/**
 * Rest Controller Integration Test
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootRestIntegrationTest
{
	/**
	 * Rest Template
	 */
	@Autowired
	private TestRestTemplate testRestTemplate;

	/**
	 * Model Repo
	 */
	@Autowired
	private DataModelRepository modelRepository;

	/**
	 * Found path test
	 */
	@Test
	public void testModelData_givenValidDataModel_returnsDataModel()
	{
		// given
		DataModel expected = new DataModel("testModelName");
		modelRepository.saveAndFlush(expected);

		String uri = "/DataModel/" + expected.getModelName();

		// when
		ResponseEntity<DataModel> result = testRestTemplate.getForEntity(uri, DataModel.class);
		DataModel                 actual = result.getBody();

		// then
		assertThat(result.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertEquals(expected, actual);
	}

	/**
	 * Not found path test
	 */
	@Test
	public void testModelData_givenInvalidDataModel_returns404()
	{
		// given
		String uri = "/DataModel/invalidModelName";

		// when
		ResponseEntity<DataModel> result = testRestTemplate.getForEntity(uri, DataModel.class);

		// then
		assertThat(result.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}
}
