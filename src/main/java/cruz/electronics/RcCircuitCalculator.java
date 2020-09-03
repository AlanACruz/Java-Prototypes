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
