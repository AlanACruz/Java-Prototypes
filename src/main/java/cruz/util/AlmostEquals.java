package cruz.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Deprecated
public class AlmostEquals
{
	public static boolean check(
			BigDecimal a,
			BigDecimal b
	)
	{
		int scale = Math.min(a.scale(), b.scale()) - 1;

		a = a.setScale(scale, RoundingMode.HALF_UP);
		b = b.setScale(scale, RoundingMode.HALF_UP);

		return a.compareTo(b) == 0;

	}
}
