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

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

class RcCircuitCalculatorTest
{
	@Getter
	@RequiredArgsConstructor
	private class RcRelationship
	{
		private final BigDecimal hz, ohms, farads;
	}

	private final RcRelationship a = new RcRelationship(
			new BigDecimal("1e3"),
			new BigDecimal("2.5e5"),
			new BigDecimal("0.6366e-9")
	);

	private final RcRelationship b = new RcRelationship(
			new BigDecimal("20"),
			new BigDecimal("2.5e5"),
			new BigDecimal("31.83e-9")
	);

	private final RcRelationship c = new RcRelationship(
			BigDecimal.valueOf(20e3d),
			BigDecimal.valueOf(2.5e5d),
			BigDecimal.valueOf(0.03183e-9)
	);

	private final RcRelationship d = new RcRelationship(
			BigDecimal.valueOf(1e3d),
			BigDecimal.valueOf(5e5d),
			BigDecimal.valueOf(0.3183e-9)
	);

	private final RcRelationship e = new RcRelationship(
			BigDecimal.valueOf(20d),
			BigDecimal.valueOf(5e5d),
			BigDecimal.valueOf(15.915e-9)
	);

	private final RcRelationship f = new RcRelationship(
			BigDecimal.valueOf(20e3d),
			BigDecimal.valueOf(5e5d),
			BigDecimal.valueOf(0.015915e-9)
	);

	@BeforeEach
	void setUp() throws Exception
	{
	}

	@AfterEach
	void tearDown() throws Exception
	{
	}

	@Test
	void test_250k_R_1k_Hz_For_Farads()
	{
		BigDecimal expectedFarads = a.getFarads();

		BigDecimal ohms = a.getOhms();
		BigDecimal hz   = a.getHz();

		BigDecimal actualFarads = RcCircuitCalculator.findCapacitance(ohms, hz);

		BigDecimal expectedRescaledFloored = expectedFarads.setScale(-3, RoundingMode.FLOOR);
		BigDecimal actualResacledFloored   = actualFarads.setScale(-3, RoundingMode.FLOOR);

		assertEquals(expectedRescaledFloored, actualResacledFloored);
	}

	@Test
	void test_250k_R_1k_Hz_For_Hz()
	{
		BigDecimal expectedHz = a.getHz();

		BigDecimal ohms   = a.getOhms();
		BigDecimal farads = a.getFarads();

		BigDecimal actualHz = RcCircuitCalculator.findFrequency(ohms, farads);

		assertEquals(expectedHz.longValue(), actualHz.longValue());
	}

	@Test
	void test_250k_R_20_Hz_For_Farads()
	{
		BigDecimal expectedFarads = b.getFarads();

		BigDecimal ohms = b.getOhms();
		BigDecimal hz   = b.getHz();

		BigDecimal actualFarads = RcCircuitCalculator.findCapacitance(ohms, hz);

		BigDecimal expectedRescaledFloored = expectedFarads.setScale(-3, RoundingMode.FLOOR);
		BigDecimal actualResacledFloored   = actualFarads.setScale(-3, RoundingMode.FLOOR);

		assertEquals(expectedRescaledFloored, actualResacledFloored);
	}

	@Test
	void test_250k_R_20_Hz_For_Hz()
	{
		BigDecimal expectedHz = b.getHz();

		BigDecimal ohms   = b.getOhms();
		BigDecimal farads = b.getFarads();

		BigDecimal actualHz = RcCircuitCalculator.findFrequency(ohms, farads);

		assertEquals(expectedHz.longValue(), actualHz.longValue());
	}

	@Test
	void test_250k_R_20k_Hz_For_Farads()
	{
		BigDecimal expectedFarads = c.getFarads();

		BigDecimal ohms = c.getOhms();
		BigDecimal hz   = c.getHz();

		BigDecimal actualFarads = RcCircuitCalculator.findCapacitance(ohms, hz);

		BigDecimal expectedRescaledFloored = expectedFarads.setScale(-3, RoundingMode.FLOOR);
		BigDecimal actualResacledFloored   = actualFarads.setScale(-3, RoundingMode.FLOOR);

		assertEquals(expectedRescaledFloored, actualResacledFloored);
	}

	@Test
	void test_250k_R_20k_Hz_For_Hz()
	{
		BigDecimal expectedHz = c.getHz();

		BigDecimal ohms   = c.getOhms();
		BigDecimal farads = c.getFarads();

		BigDecimal actualHz = RcCircuitCalculator.findFrequency(ohms, farads);

		assertEquals(expectedHz.longValue(), actualHz.longValue());
	}

	@Test
	void test_500k_R_1k_Hz_For_Farads()
	{
		BigDecimal expectedFarads = d.getFarads();

		BigDecimal ohms = d.getOhms();
		BigDecimal hz   = d.getHz();

		BigDecimal actualFarads = RcCircuitCalculator.findCapacitance(ohms, hz);

		BigDecimal expectedRescaledFloored = expectedFarads.setScale(-3, RoundingMode.FLOOR);
		BigDecimal actualResacledFloored   = actualFarads.setScale(-3, RoundingMode.FLOOR);

		assertEquals(expectedRescaledFloored, actualResacledFloored);
	}

	@Test
	void test_500k_R_1k_Hz_For_Hz()
	{
		BigDecimal expectedHz = d.getHz();

		BigDecimal ohms   = d.getOhms();
		BigDecimal farads = d.getFarads();

		BigDecimal actualHz = RcCircuitCalculator.findFrequency(ohms, farads);

		assertEquals(expectedHz.longValue(), actualHz.longValue());
	}

	@Test
	void test_500k_R_20_Hz_For_Farads()
	{
		BigDecimal expectedFarads = e.getFarads();

		BigDecimal ohms = e.getOhms();
		BigDecimal hz   = e.getHz();

		BigDecimal actualFarads = RcCircuitCalculator.findCapacitance(ohms, hz);

		int expectedRescaledFloored = expectedFarads.setScale(4, RoundingMode.FLOOR).intValue();
		int actualResacledFloored   = actualFarads.setScale(-4, RoundingMode.FLOOR).intValue();

		assertEquals(expectedRescaledFloored, actualResacledFloored);
	}

	@Test
	void test_500k_R_20_Hz_For_Hz()
	{
		BigDecimal expectedHz = e.getHz();

		BigDecimal ohms   = e.getOhms();
		BigDecimal farads = e.getFarads();

		BigDecimal actualHz = RcCircuitCalculator.findFrequency(ohms, farads);

		assertEquals(expectedHz.longValue(), actualHz.longValue());
	}

	@Test
	void test_500k_R_20k_For_Farads()
	{
		BigDecimal expectedFarads = f.getFarads();

		BigDecimal ohms = f.getOhms();
		BigDecimal hz   = f.getHz();

		BigDecimal actualFarads = RcCircuitCalculator.findCapacitance(ohms, hz);

		BigDecimal expectedRescaledFloored = expectedFarads.setScale(-3, RoundingMode.FLOOR);
		BigDecimal actualResacledFloored   = actualFarads.setScale(-3, RoundingMode.FLOOR);

		assertEquals(expectedRescaledFloored, actualResacledFloored);
	}

	@Test
	void test_500k_R_20k_Hz()
	{
		BigDecimal expectedHz = f.getHz();

		BigDecimal ohms   = f.getOhms();
		BigDecimal farads = f.getFarads();

		BigDecimal actualHz = RcCircuitCalculator.findFrequency(ohms, farads);

		assertEquals(expectedHz.longValue(), actualHz.longValue());
	}
}
