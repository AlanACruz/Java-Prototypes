package cruz.music.tone.scale;

import cruz.music.interval.Semitone;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Diatonic Interval:	1	2	3	5	6	8
 * Diatonic Steps:		R	W	W	H½	W	H½
 * Semitone Interval:	0	2	4	7	9	12
 * 
 * @author CruzA
 */
@Getter
@NoArgsConstructor
public class Pentatonic extends Scale {
	
	private final int scaleLength = 5;
	
	private final int first = Semitone.ZERO;
	private final int second = Semitone.TWO;
	private final int third = Semitone.FOUR;
	private final int fourth = Semitone.SEVEN;
	private final int fifth = Semitone.NINE;
	
	/**
	 * Return all tones in a scale.
	 * 
	 * @return scale array
	 */
	public int[] getScale() {

		return new int[] {
				getFirst(),
				getSecond(),
				getThird(),
				getFourth(),
				getFifth()
		};
	}
}
