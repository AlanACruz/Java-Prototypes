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
package cruz.spring.boot.app.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import cruz.spring.boot.app.domain.DataModel;

/**
 * Model Repo Slice Tests
 */
@DataJpaTest
class DataModelRepositoryTest
{
	/**
	 * Entity Manager
	 */
	@Autowired
	private TestEntityManager entityManager;

	/**
	 * Model Repo
	 */
	@Autowired
	private DataModelRepository DataModelRepo;

	/**
	 * Find By Name
	 */
	@Test
	public void whenFindByName_thenReturn_DataModel()
	{
		// given
		DataModel expected = new DataModel("testModelName");
		entityManager.persist(expected);
		entityManager.flush();

		// when
		DataModel actual = DataModelRepo.findByModelName(expected.getModelName());

		// then
		assertEquals(actual, expected);
	}

	/**
	 * Find By Name - Not Found
	 */
	@Test
	public void whenFindByName_Null_thenReturn_Null()
	{
		// given
		DataModel expected = null;

		// when
		DataModel actual = DataModelRepo.findByModelName("Not-Found-Name");

		// then
		assertEquals(expected, actual);
	}
}
