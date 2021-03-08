package cruz.music.tone.scale;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Diatonic Interval:	1	2	♭3	3	5	6	8 
 * Diatonic Steps:		R	1	½	½	1½	1	1½
 * Semitone Interval:	0	2	3	4	7	9	12
 * 
 * @author CruzA
 */
@Getter
@NoArgsConstructor
public class Blues extends Scale {
	
	private final int scaleLength = 6;
	
	private final int first = Semitone.ZERO;
	private final int second = Semitone.TWO;
	private final int third = Semitone.THREE;
	private final int fourth = Semitone.FOUR;
	private final int fifth = Semitone.SEVEN;
	private final int sixth = Semitone.NINE;
	
	/**
	 * Return all tones in a major scale.
	 * 
	 * @return scale array
	 */
	public int[] getMajor() {

		return new int[] {
				getFirst(),
				getSecond(),
				getThird(),
				getFourth(),
				getFifth(),
				getSixth()
		};
	}
	
	/**
	 * Return all tones in a minor scale.
	 * 
	 * @return scale array
	 */
	public int[] getMinor() {

		int modeOffset = getSixth();
		
		return new int[] {

			getSixth() - modeOffset,
			getFirst() - modeOffset + Octave.ONE,
			getSecond() - modeOffset + Octave.ONE,
			getThird() - modeOffset + Octave.ONE,
			getFourth() - modeOffset + Octave.ONE,
			getFifth() - modeOffset + Octave.ONE
		};
	}
	
	/**
	 * Return all tones in a scale.
	 * 
	 * @return scale array
	 */
	public int[] getScale() {

		return getMajor();
	}
}
