/**
 * Copyright (c) 2019 Alan Cruz
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.cruz.automobile;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cruz.automobile.engine.EightCylinder;
import com.cruz.automobile.engine.FourCylinder;
import com.cruz.automobile.tire.LargeTire;
import com.cruz.automobile.tire.SmallTire;

/**
 * Test for demonstrating Lombok Builder vs Spring Beans
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class CarTest
{
	/**
	 * Lombok built car Car a
	 */
	Car a;

	/**
	 * Lombok Built Car Car b
	 */
	Car b;

	/**
	 * Spring Car Bean Car c
	 */
	@Autowired
	@Qualifier("raceCar")
	Car c;

	/**
	 * Spring Car Bean Car d
	 */
	@Qualifier("familyCar")
	@Autowired
	Car d;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception
	{
	}

	/**
	 * Lombok Race Test Test to see if a v8 engine with small tires can beat a inline 4 engine with
	 * large tires
	 */
	@Test
	void lombokRaceTest()
	{
		// Lombok Builder
		a = Car.builder().theEngine(new EightCylinder()).frontLeft(new SmallTire()).frontRight(new SmallTire())
				.backLeft(new SmallTire()).backRight(new SmallTire()).build();

		b = Car.builder().theEngine(new FourCylinder()).frontLeft(new LargeTire()).frontRight(new LargeTire())
				.backLeft(new LargeTire()).backRight(new LargeTire()).build();

		assertTrue(a.getSpeed() > b.getSpeed());

		assertNotEquals(a, b, "Cars are equal and should not be!");
	}

	/**
	 * Spring Race Test Test to see if a race car is faster then a family car
	 */
	@Test
	void springRaceTest()
	{
		// Spring Bean
		assertTrue(c.getSpeed() > d.getSpeed());

		assertNotEquals(c, d, "Cars are equal and should not be!");
	}

}
