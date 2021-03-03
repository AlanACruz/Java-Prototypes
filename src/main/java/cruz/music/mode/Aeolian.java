package cruz.music.mode;

import cruz.music.interval.IntervalConstants;
import lombok.Getter;

@Getter
public class Aeolian extends Mode {
	
	private final String relativeTonic = "vi";
	
	private final int first = IntervalConstants.MAJOR_SIXTH;
	private final int second = IntervalConstants.MAJOR_SEVENTH;
	private final int third = IntervalConstants.PERFECT_EIGHTH;
	private final int fourth = IntervalConstants.MAJOR_NINTH;
	private final int fifth = IntervalConstants.MAJOR_TENTH;
	private final int sixth = IntervalConstants.PERFECT_ELEVENTH;
	private final int seventh = IntervalConstants.PERFECT_TWELFTH;
}
