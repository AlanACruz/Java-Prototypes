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

import java.io.Serializable;

import cruz.spring.bean.automobile.engine.Engine;
import cruz.spring.bean.automobile.tire.Tire;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * TODO Auto-generated Comment
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public abstract class AbstractAutomobile implements Serializable
{
	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = -1974739912725011134L;

	/**
	 * Engine theEngine
	 */
	@NonNull
	private Engine theEngine;

	/**
	 * Tire frontLeft
	 */
	@NonNull
	private Tire frontLeft;

	/**
	 * Tire frontRight
	 */
	@NonNull
	private Tire frontRight;

	/**
	 * Tire backLeft
	 */
	@NonNull
	private Tire backLeft;

	/**
	 * Tire backRight
	 */
	@NonNull
	private Tire backRight;

	/**
	 * The speed of this automobile in a race. TODO should this be acceleration?
	 */
	public double getSpeed()
	{
		double torque = this.theEngine.torque();

		double wheel = this.frontLeft.size() + this.frontRight.size() + this.backLeft.size() + this.backRight.size();

		return torque * wheel;
	}
}
