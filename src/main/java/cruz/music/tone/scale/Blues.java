package cruz.music.tone.scale;

import cruz.music.interval.Interval;
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
	
	private final int first = Interval.PERFECT_UNITY;
	private final int second = Interval.MAJOR_SECOND;
	private final int third = Interval.MINOR_THIRD;
	private final int fourth = Interval.MAJOR_THIRD;
	private final int fifth = Interval.PERFECT_FIFTH;
	private final int sixth = Interval.MAJOR_SIXTH;
	
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
				getSixth()
		};
	}
}
