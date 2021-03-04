package cruz.music.mode;

import cruz.music.interval.IntervalConstants;
import lombok.Getter;

@Getter
public class Lydian extends Mode {
	
	private final String relativeTonicString = "IV";
	
	private final int first = IntervalConstants.PERFECT_FOURTH;
	private final int second = IntervalConstants.PERFECT_FIFTH;
	private final int third = IntervalConstants.MAJOR_SIXTH;
	private final int fourth = IntervalConstants.MAJOR_SEVENTH;
	private final int fifth = IntervalConstants.PERFECT_EIGHTH;
	private final int sixth = IntervalConstants.MAJOR_NINTH;
	private final int seventh = IntervalConstants.MAJOR_TENTH;
	
	private final int eighth = IntervalConstants.PERFECT_ELEVENTH;
	private final int ninth = IntervalConstants.PERFECT_TWELFTH;
	private final int tenth = IntervalConstants.MAJOR_THIRTENTH;
	private final int eleventh = IntervalConstants.MAJOR_FOURTEENTH;
	private final int twelfth = IntervalConstants.PERFECT_FIFTEENTH;
	private final int thirteenth = IntervalConstants.MAJOR_SIXTEENTH;
	private final int fourteenth = IntervalConstants.MAJOR_SEVENTEENTH;
	
	private final int fifteenth = IntervalConstants.PERFECT_EIGHTEENTH;
}
