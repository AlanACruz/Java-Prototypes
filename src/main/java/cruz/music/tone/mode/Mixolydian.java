package cruz.music.tone.mode;

import cruz.music.interval.IntervalConstants;
import lombok.Getter;

@Getter
public class Mixolydian extends Mode {
	
	private final String relativeTonicString = "V";
	
	private final int first = IntervalConstants.PERFECT_FIFTH;
	private final int second = IntervalConstants.MAJOR_SIXTH;
	private final int third = IntervalConstants.MAJOR_SEVENTH;
	private final int fourth = IntervalConstants.PERFECT_EIGHTH;
	private final int fifth = IntervalConstants.MAJOR_NINTH;
	private final int sixth = IntervalConstants.MAJOR_TENTH;
	private final int seventh = IntervalConstants.PERFECT_ELEVENTH;
	
	private final int eighth = IntervalConstants.PERFECT_TWELFTH;
	private final int ninth = IntervalConstants.MAJOR_THIRTENTH;
	private final int tenth = IntervalConstants.MAJOR_FOURTEENTH;
	private final int eleventh = IntervalConstants.PERFECT_FIFTEENTH;
	private final int twelfth = IntervalConstants.MAJOR_SIXTEENTH;
	private final int thirteenth = IntervalConstants.MAJOR_SEVENTEENTH;
	private final int fourteenth = IntervalConstants.PERFECT_EIGHTEENTH;
			
	private final int fifteenth = IntervalConstants.PERFECT_NINETEENTH;
}
