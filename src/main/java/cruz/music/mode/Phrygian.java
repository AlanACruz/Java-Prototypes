package cruz.music.mode;

import cruz.music.interval.IntervalConstants;
import lombok.Getter;

@Getter
public class Phrygian extends Mode {
	
	private final String relativeTonicString = "iii";
	
	private final int first = IntervalConstants.MAJOR_THIRD;
	private final int second = IntervalConstants.PERFECT_FOURTH;
	private final int third = IntervalConstants.PERFECT_FIFTH;
	private final int fourth = IntervalConstants.MAJOR_SIXTH;
	private final int fifth = IntervalConstants.MAJOR_SEVENTH;
	private final int sixth = IntervalConstants.PERFECT_EIGHTH;
	private final int seventh = IntervalConstants.MAJOR_NINTH;
	
	private final int eighth = IntervalConstants.MAJOR_TENTH;
	private final int ninth = IntervalConstants.PERFECT_ELEVENTH;
	private final int tenth = IntervalConstants.PERFECT_TWELFTH;
	private final int eleventh = IntervalConstants.MAJOR_THIRTENTH;
	private final int twelfth = IntervalConstants.MAJOR_FOURTEENTH;
	private final int thirteenth = IntervalConstants.PERFECT_FIFTEENTH;
	private final int fourteenth = IntervalConstants.MAJOR_SIXTEENTH;
	
	private final int fifteenth = IntervalConstants.MAJOR_SEVENTEENTH;
}
