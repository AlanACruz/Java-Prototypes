package cruz.music.tone.scale;

import cruz.music.interval.Semitone;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Diatonic Interval:	1	2	♭3	4	5	6	7	8
 * Diatonic Steps:		R	1	½	1	1	1	1	½
 * Semitone Interval:	0	2	3	5	7	9	11	12
 * 
 * @author CruzA
 */
@Getter
@NoArgsConstructor
public class MelodicMinor extends Scale {
	
	private final int scaleLength = 7;
	
	private final int first = Semitone.ZERO;
	private final int second = Semitone.TWO;
	private final int third = Semitone.THREE;
	private final int fourth = Semitone.FIVE;
	private final int fifth = Semitone.SEVEN;
	private final int sixth = Semitone.NINE;
	private final int seventh = Semitone.ELEVEN;
	
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
				getFifth(),
				getSixth(),
				getSeventh()
		};
	}
}
