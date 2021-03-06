package cruz.music.tone.scale.mode;

import cruz.music.interval.Interval;
import cruz.music.tone.scale.Diatonic;
import lombok.Getter;

/**
 * @author CruzA
 */
@Getter
public class Ionian extends Diatonic{

	private final String feelingString = "Happy";
	private final String relativeTonicString = "I";
	private final String triSuffixString = "Major";
	private final String seventhSuffixString = "Major 7";
	
	private final int first = Interval.PERFECT_UNITY;
	private final int second = Interval.MAJOR_SECOND;
	private final int third = Interval.MAJOR_THIRD;
	private final int fourth = Interval.PERFECT_FOURTH;
	private final int fifth = Interval.PERFECT_FIFTH;
	private final int sixth = Interval.MAJOR_SIXTH;
	private final int seventh = Interval.MAJOR_SEVENTH;
	
	private final int eighth = Interval.PERFECT_EIGHTH;
	private final int ninth = Interval.MAJOR_NINTH;
	private final int tenth = Interval.MAJOR_TENTH;
	private final int eleventh = Interval.PERFECT_ELEVENTH;
	private final int twelfth = Interval.PERFECT_TWELFTH;
	private final int thirteenth = Interval.MAJOR_THIRTENTH;
	private final int fourteenth = Interval.MAJOR_FOURTEENTH;
	
	private final int fifteenth = Interval.PERFECT_FIFTEENTH;
}
