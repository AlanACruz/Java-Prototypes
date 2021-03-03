package cruz.music.mode;

import cruz.music.interval.IntervalConstants;
import lombok.Getter;

@Getter
public class Mixolydian extends Mode {
	
	private final String relativeTonic = "V";
	
	private final int first = IntervalConstants.PERFECT_FIFTH;
	private final int second = IntervalConstants.MAJOR_SIXTH;
	private final int third = IntervalConstants.MAJOR_SEVENTH;
	private final int fourth = IntervalConstants.PERFECT_EIGHTH;
	private final int fifth = IntervalConstants.MAJOR_NINTH;
	private final int sixth = IntervalConstants.MAJOR_TENTH;
	private final int seventh = IntervalConstants.PERFECT_ELEVENTH;
}
