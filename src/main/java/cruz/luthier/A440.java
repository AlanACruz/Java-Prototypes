package cruz.luthier;

import java.math.BigDecimal;

import lombok.Getter;

/**
 * https://en.wikipedia.org/wiki/Equal_temperament
 * https://en.wikipedia.org/wiki/12_equal_temperament
 * https://en.wikipedia.org/wiki/Scientific_pitch
 * https://en.wikipedia.org/wiki/A440_(pitch_standard)
 */
@Getter
public enum A440
{
	C0(new BigDecimal("16.352")), A4(new BigDecimal("440"));

	private BigDecimal pitchFreqHz;

	/**
	 * @param freq
	 */
	A440(BigDecimal freq)
	{
		this.pitchFreqHz = freq;
	}
}
