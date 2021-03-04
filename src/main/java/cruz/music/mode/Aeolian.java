package cruz.music.mode;

import cruz.music.interval.IntervalConstants;
import lombok.Getter;

@Getter
public class Aeolian extends Mode {
	
	private final String relativeTonicString = "vi";
	
	private final int first = IntervalConstants.MAJOR_SIXTH;
	private final int second = IntervalConstants.MAJOR_SEVENTH;
	private final int third = IntervalConstants.PERFECT_EIGHTH;
	private final int fourth = IntervalConstants.MAJOR_NINTH;
	private final int fifth = IntervalConstants.MAJOR_TENTH;
	private final int sixth = IntervalConstants.PERFECT_ELEVENTH;
	private final int seventh = IntervalConstants.PERFECT_TWELFTH;
	
	private final int eighth = IntervalConstants.MAJOR_THIRTENTH;
	private final int ninth = IntervalConstants.MAJOR_FOURTEENTH;
	private final int tenth = IntervalConstants.PERFECT_FIFTEENTH;
	private final int eleventh = IntervalConstants.MAJOR_SIXTEENTH;
	private final int twelfth = IntervalConstants.MAJOR_SEVENTEENTH;
	private final int thirteenth = IntervalConstants.PERFECT_EIGHTEENTH;
	private final int fourteenth = IntervalConstants.PERFECT_NINETEENTH;
	
	private final int fifteenth = IntervalConstants.MAJOR_TWENTIETH;
}
