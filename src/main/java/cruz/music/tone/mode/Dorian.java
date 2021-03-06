package cruz.music.tone.mode;

import cruz.music.interval.IntervalConstants;
import lombok.Getter;

/**
 * @author CruzA
 */
@Getter
public class Dorian extends Mode {
	
	private final String feelingString = "Soulful";
	private final String relativeTonicString = "ii";
	private final String triSuffixString = "minor";
	private final String seventhSuffixString = "minor 7";
	
	private final int first = IntervalConstants.MAJOR_SECOND;
	private final int second = IntervalConstants.MAJOR_THIRD;
	private final int third = IntervalConstants.PERFECT_FOURTH;
	private final int fourth = IntervalConstants.PERFECT_FIFTH;
	private final int fifth = IntervalConstants.MAJOR_SIXTH;
	private final int sixth = IntervalConstants.MAJOR_SEVENTH;
	private final int seventh = IntervalConstants.PERFECT_EIGHTH;
	
	private final int eighth = IntervalConstants.MAJOR_NINTH;
	private final int ninth = IntervalConstants.MAJOR_TENTH;
	private final int tenth = IntervalConstants.PERFECT_ELEVENTH;
	private final int eleventh = IntervalConstants.PERFECT_TWELFTH;
	private final int twelfth = IntervalConstants.MAJOR_THIRTENTH;
	private final int thirteenth = IntervalConstants.MAJOR_FOURTEENTH;
	private final int fourteenth = IntervalConstants.PERFECT_FIFTEENTH;
	
	private final int fifteenth = IntervalConstants.MAJOR_SIXTEENTH;
}
