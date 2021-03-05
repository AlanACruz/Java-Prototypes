package cruz.music.tone.mode;

import cruz.music.interval.IntervalConstants;
import lombok.Getter;

/**
 * @author CruzA
 */
@Getter
public class Locrian extends Mode {
	
	private String relativeTonicString = "viiø";
	
	private final int first = IntervalConstants.MAJOR_SEVENTH;
	private final int second = IntervalConstants.PERFECT_EIGHTH;
	private final int third = IntervalConstants.MAJOR_NINTH;
	private final int fourth = IntervalConstants.MAJOR_TENTH;
	private final int fifth = IntervalConstants.PERFECT_ELEVENTH;
	private final int sixth = IntervalConstants.PERFECT_TWELFTH;
	private final int seventh = IntervalConstants.MAJOR_THIRTENTH;
	
	private final int eighth = IntervalConstants.MAJOR_FOURTEENTH;
	private final int ninth = IntervalConstants.PERFECT_FIFTEENTH;
	private final int tenth = IntervalConstants.MAJOR_SIXTEENTH;
	private final int eleventh = IntervalConstants.MAJOR_SEVENTEENTH;
	private final int twelfth = IntervalConstants.PERFECT_EIGHTEENTH;
	private final int thirteenth = IntervalConstants.PERFECT_NINETEENTH;
	private final int fourteenth = IntervalConstants.MAJOR_TWENTIETH;
	
	private final int fifteenth = IntervalConstants.MAJOR_TWENTY_FIRST;
}
