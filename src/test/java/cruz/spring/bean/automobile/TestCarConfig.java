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
package cruz.spring.bean.automobile;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import cruz.spring.bean.automobile.engine.EightCylinder;
import cruz.spring.bean.automobile.engine.FourCylinder;
import cruz.spring.bean.automobile.tire.LargeTire;
import cruz.spring.bean.automobile.tire.SmallTire;

/**
 * Configuration for testing Car's
 */
@TestConfiguration
public class TestCarConfig
{
	@Bean(name = "FamilyCar")
	public Car familyCar()
	{
		return new Car(new FourCylinder(), new SmallTire(), new SmallTire(), new SmallTire(), new SmallTire());
	}

	@Bean(name = "RaceCar")
	public Car raceCar()
	{
		return new Car(new EightCylinder(), new LargeTire(), new LargeTire(), new LargeTire(), new LargeTire());
	}
}
