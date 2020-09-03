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
			BigDecimal.valueOf(1e3d),
			BigDecimal.valueOf(2.5e5d),
			BigDecimal.valueOf(0.6366e-9)
	);

	private final RcRelationship b = new RcRelationship(
			BigDecimal.valueOf(20d),
			BigDecimal.valueOf(2.5e5d),
			BigDecimal.valueOf(31.83e-9)
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
	void test()
	{
		BigDecimal expectedFarads = a.getFarads();
		BigDecimal ohms           = a.getOhms();
		BigDecimal hz             = a.getHz();

		BigDecimal actualFarads = RcCircuitCalculator.findCapacitance(ohms, hz);

		BigDecimal expectedRescaledFloored = expectedFarads.setScale(-3, RoundingMode.FLOOR);
		BigDecimal actualResacledFloored   = actualFarads.setScale(-3, RoundingMode.FLOOR);
		assertEquals(expectedRescaledFloored, actualResacledFloored);

		assertEquals(expectedFarads, actualFarads);

		assertEquals(expectedFarads.unscaledValue(), actualFarads.unscaledValue());
	}

	@Test
	void test_250k_R_1k_Hz()
	{
		BigDecimal expectedHz = a.getHz();

		BigDecimal ohms   = a.getOhms();
		BigDecimal farads = a.getFarads();

		BigDecimal actualHz = RcCircuitCalculator.findFrequency(ohms, farads);

		assertEquals(expectedHz.longValue(), actualHz.longValue());
	}

	@Test
	void test_250k_R_20_Hz()
	{
		BigDecimal expectedHz = b.getHz();

		BigDecimal ohms   = b.getOhms();
		BigDecimal farads = b.getFarads();

		BigDecimal actualHz = RcCircuitCalculator.findFrequency(ohms, farads);

		assertEquals(expectedHz.longValue(), actualHz.longValue());
	}

	@Test
	void test_250k_R_20k_Hz()
	{
		BigDecimal expectedHz = c.getHz();

		BigDecimal ohms   = c.getOhms();
		BigDecimal farads = c.getFarads();

		BigDecimal actualHz = RcCircuitCalculator.findFrequency(ohms, farads);

		assertEquals(expectedHz.longValue(), actualHz.longValue());
	}

	@Test
	void test_500k_R_1k_Hz()
	{
		BigDecimal expectedHz = d.getHz();

		BigDecimal ohms   = d.getOhms();
		BigDecimal farads = d.getFarads();

		BigDecimal actualHz = RcCircuitCalculator.findFrequency(ohms, farads);

		assertEquals(expectedHz.longValue(), actualHz.longValue());
	}

	@Test
	void test_500k_R_20_Hz()
	{
		BigDecimal expectedHz = e.getHz();

		BigDecimal ohms   = e.getOhms();
		BigDecimal farads = e.getFarads();

		BigDecimal actualHz = RcCircuitCalculator.findFrequency(ohms, farads);

		assertEquals(expectedHz.longValue(), actualHz.longValue());
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
