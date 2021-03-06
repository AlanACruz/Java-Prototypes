package cruz.luthier;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author CruzA
 * 
 * https://stackoverflow.com/questions/22695654/computing-the-nth-root-of-p-using-bigdecimals
 */
public class NthRootSolver
{
	private static final int          SCALE         = 10;
	private static final RoundingMode ROUNDING_MODE = RoundingMode.DOWN;

	/**
	 * @param n
	 * @param a
	 *
	 * @return
	 */
	public static BigDecimal nthRoot(
			final int n,
			final BigDecimal a
	)
	{
		return nthRoot(n, a, BigDecimal.valueOf(.1).movePointLeft(SCALE));
	}

	/**
	 * @param n
	 * @param a
	 * @param p
	 *
	 * @return
	 */
	private static BigDecimal nthRoot(
			final int n,
			final BigDecimal a,
			final BigDecimal p
	)
	{
		if (a.compareTo(BigDecimal.ZERO) < 0)
		{
			throw new IllegalArgumentException("nth root can only be calculated for positive numbers");
		}

		if (a.equals(BigDecimal.ZERO))
		{
			return BigDecimal.ZERO;
		}

		BigDecimal xPrev = a;
		BigDecimal x     = a.divide(new BigDecimal(n), SCALE, ROUNDING_MODE); // starting "guessed" value...

		while (x.subtract(xPrev).abs().compareTo(p) > 0)
		{
			xPrev = x;
			x     = BigDecimal
					.valueOf(n - 1.0)
					.multiply(x)
					.add(a.divide(x.pow(n - 1), SCALE, ROUNDING_MODE))
					.divide(new BigDecimal(n), SCALE, ROUNDING_MODE);
		}
		return x;
	}
}
