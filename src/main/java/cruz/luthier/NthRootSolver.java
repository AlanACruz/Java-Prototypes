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
		return nthRoot( n, a, BigDecimal.valueOf( .1 ).movePointLeft( SCALE ) );
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
		if ( a.compareTo( BigDecimal.ZERO ) < 0 )
		{
			throw new IllegalArgumentException( "nth root can only be calculated for positive numbers" );
		}

		if ( a.equals( BigDecimal.ZERO ) )
		{
			return BigDecimal.ZERO;
		}

		BigDecimal xPrev = a;
		BigDecimal x     = a.divide( new BigDecimal( n ), SCALE, ROUNDING_MODE ); // starting "guessed" value...

		while ( x.subtract( xPrev ).abs().compareTo( p ) > 0 )
		{
			xPrev = x;
			x     = BigDecimal
				.valueOf( n - 1.0 )
				.multiply( x )
				.add( a.divide( x.pow( n - 1 ), SCALE, ROUNDING_MODE ) )
				.divide( new BigDecimal( n ), SCALE, ROUNDING_MODE );
		}
		return x;
	}
}
