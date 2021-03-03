package cruz.music.mode;

import cruz.music.interval.IntervalConstants;
import lombok.Getter;

@Getter
public class Ionian extends Mode{

	private final String relativeTonic = "I";
	
	private final int first = IntervalConstants.PERFECT_UNITY;
	private final int second = IntervalConstants.MAJOR_SECOND;
	private final int third = IntervalConstants.MAJOR_THIRD;
	private final int fourth = IntervalConstants.PERFECT_FOURTH;
	private final int fifth = IntervalConstants.PERFECT_FIFTH;
	private final int sixth = IntervalConstants.MAJOR_SIXTH;
	private final int seventh = IntervalConstants.MAJOR_SEVENTH;
}
