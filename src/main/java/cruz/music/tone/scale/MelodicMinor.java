package cruz.music.tone.scale;

import cruz.music.interval.Interval;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author CruzA
 */
@Getter
@NoArgsConstructor
public class MelodicMinor extends Scale {
	
	private final int scaleLength = 7;
	
	private final int first = Interval.PERFECT_UNITY;
	private final int second = Interval.MAJOR_SECOND;
	private final int third = Interval.MINOR_THIRD;
	private final int fourth = Interval.PERFECT_FOURTH;
	private final int fifth = Interval.PERFECT_FIFTH;
	private final int sixth = Interval.MAJOR_SIXTH;
	private final int seventh = Interval.MAJOR_SEVENTH;
	
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
