package cruz.music.mode;

import cruz.music.interval.IntervalConstants;
import lombok.Getter;

@Getter
public class Dorian extends Mode {
	
	private final String relativeTonic = "ii";
	
	private final int first = IntervalConstants.MAJOR_SECOND;
	private final int second = IntervalConstants.MAJOR_THIRD;
	private final int third = IntervalConstants.PERFECT_FOURTH;
	private final int fourth = IntervalConstants.PERFECT_FIFTH;
	private final int fifth = IntervalConstants.MAJOR_SIXTH;
	private final int sixth = IntervalConstants.MAJOR_SEVENTH;
	private final int seventh = IntervalConstants.PERFECT_EIGHTH;
}
