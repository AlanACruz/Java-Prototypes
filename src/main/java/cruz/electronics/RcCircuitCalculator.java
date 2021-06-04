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
package cruz.electronics;

import java.math.BigDecimal;
import java.math.MathContext;

public class RcCircuitCalculator
{
	/**
	 * The equation for the characteristic frequency f of the RC circuit
	 *
	 * @implSpec C = 1 / ( 2π * R * f )
	 *
	 * @param ohms is the resistance of the resistor (in Ohms)
	 * @param hz   is the characteristic frequency (in Hertz)
	 *
	 * @return the capacitance of the capacitor (in Farads)
	 */
	public static BigDecimal findCapacitance(
			BigDecimal ohms,
			BigDecimal hz
	)
	{
		MathContext context = MathContext.DECIMAL128;

		BigDecimal two   = BigDecimal.valueOf(2d);
		BigDecimal pi    = BigDecimal.valueOf(Math.PI);
		BigDecimal twoPi = two.multiply(pi);

		BigDecimal divisor = twoPi.multiply(ohms).multiply(hz);

		return (BigDecimal.ONE).divide(divisor, context);
	}

	/**
	 * The equation for the characteristic frequency f of the RC circuit
	 *
	 * @implSpec f = 1 / (2π * R * C)
	 *
	 * @param ohms   is the resistance of the resistor (in Ohms)
	 * @param farads is the capacitance of the capacitor (in Farads)
	 *
	 * @return the characteristic frequency (in Hertz)
	 */
	public static BigDecimal findFrequency(
			BigDecimal ohms,
			BigDecimal farads
	)
	{
		MathContext context = MathContext.DECIMAL128;

		BigDecimal two   = BigDecimal.valueOf(2d);
		BigDecimal pi    = BigDecimal.valueOf(Math.PI);
		BigDecimal twoPi = two.multiply(pi);

		BigDecimal divisor = twoPi.multiply(ohms).multiply(farads);

		return (BigDecimal.ONE).divide(divisor, context);
	}
}
