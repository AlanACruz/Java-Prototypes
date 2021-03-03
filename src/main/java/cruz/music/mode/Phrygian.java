package cruz.music.mode;

import cruz.music.interval.IntervalConstants;
import lombok.Getter;

@Getter
public class Phrygian extends Mode {
	
	private final String relativeTonic = "iii";
	
	private final int first = IntervalConstants.MAJOR_THIRD;
	private final int second = IntervalConstants.PERFECT_FOURTH;
	private final int third = IntervalConstants.PERFECT_FIFTH;
	private final int fourth = IntervalConstants.MAJOR_SIXTH;
	private final int fifth = IntervalConstants.MAJOR_SEVENTH;
	private final int sixth = IntervalConstants.PERFECT_EIGHTH;
	private final int seventh = IntervalConstants.MAJOR_NINTH;
}
