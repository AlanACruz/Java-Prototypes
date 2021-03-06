package cruz.music.tone.scale;

import cruz.music.interval.Interval;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author CruzA
 */
@Getter
@NoArgsConstructor
public class Pentatonic extends Scale {
	
	private final int scaleLength = 5;
	
	private final int first = Interval.PERFECT_UNITY;
	private final int second = Interval.MAJOR_SECOND;
	private final int third = Interval.MAJOR_THIRD;
	private final int fourth = Interval.PERFECT_FIFTH;
	private final int fifth = Interval.MAJOR_SIXTH;
	
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
