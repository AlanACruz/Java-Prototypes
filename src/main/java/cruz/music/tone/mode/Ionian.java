package cruz.music.tone.mode;

import cruz.music.interval.IntervalConstants;
import lombok.Getter;

/**
 * @author CruzA
 */
@Getter
public class Ionian extends Mode{

	private final String relativeTonicString = "I";
	
	private final int first = IntervalConstants.PERFECT_UNITY;
	private final int second = IntervalConstants.MAJOR_SECOND;
	private final int third = IntervalConstants.MAJOR_THIRD;
	private final int fourth = IntervalConstants.PERFECT_FOURTH;
	private final int fifth = IntervalConstants.PERFECT_FIFTH;
	private final int sixth = IntervalConstants.MAJOR_SIXTH;
	private final int seventh = IntervalConstants.MAJOR_SEVENTH;
	
	private final int eighth = IntervalConstants.PERFECT_EIGHTH;
	private final int ninth = IntervalConstants.MAJOR_NINTH;
	private final int tenth = IntervalConstants.MAJOR_TENTH;
	private final int eleventh = IntervalConstants.PERFECT_ELEVENTH;
	private final int twelfth = IntervalConstants.PERFECT_TWELFTH;
	private final int thirteenth = IntervalConstants.MAJOR_THIRTENTH;
	private final int fourteenth = IntervalConstants.MAJOR_FOURTEENTH;
	
	private final int fifteenth = IntervalConstants.PERFECT_FIFTEENTH;
}
