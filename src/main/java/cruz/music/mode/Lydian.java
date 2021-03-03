package cruz.music.mode;

import cruz.music.interval.IntervalConstants;
import lombok.Getter;

@Getter
public class Lydian extends Mode {
	
	private final String relativeTonic = "IV";
	
	private final int first = IntervalConstants.PERFECT_FOURTH;
	private final int second = IntervalConstants.PERFECT_FIFTH;
	private final int third = IntervalConstants.MAJOR_SIXTH;
	private final int fourth = IntervalConstants.MAJOR_SEVENTH;
	private final int fifth = IntervalConstants.PERFECT_EIGHTH;
	private final int sixth = IntervalConstants.MAJOR_NINTH;
	private final int seventh = IntervalConstants.MAJOR_TENTH;
}
