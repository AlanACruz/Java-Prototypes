package cruz.music.tone.scale.mode;

import cruz.music.interval.Interval;
import cruz.music.tone.scale.Diatonic;
import lombok.Getter;

/**
 * @author CruzA
 */
@Getter
public class Dorian extends Diatonic {
	
	private final int scaleLength = 8;
	
	private final String feelingString = "Soulful";
	private final String relativeTonicString = "ii";
	private final String triSuffixString = "minor";
	private final String seventhSuffixString = "minor 7";
	
	private final int first = Interval.MAJOR_SECOND;
	private final int second = Interval.MAJOR_THIRD;
	private final int third = Interval.PERFECT_FOURTH;
	private final int fourth = Interval.PERFECT_FIFTH;
	private final int fifth = Interval.MAJOR_SIXTH;
	private final int sixth = Interval.MAJOR_SEVENTH;
	private final int seventh = Interval.PERFECT_EIGHTH;
	
	private final int eighth = Interval.MAJOR_NINTH;
	private final int ninth = Interval.MAJOR_TENTH;
	private final int tenth = Interval.PERFECT_ELEVENTH;
	private final int eleventh = Interval.PERFECT_TWELFTH;
	private final int twelfth = Interval.MAJOR_THIRTENTH;
	private final int thirteenth = Interval.MAJOR_FOURTEENTH;
	private final int fourteenth = Interval.PERFECT_FIFTEENTH;
	
	private final int fifteenth = Interval.MAJOR_SIXTEENTH;
}
