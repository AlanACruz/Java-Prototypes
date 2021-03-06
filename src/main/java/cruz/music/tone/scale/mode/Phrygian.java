package cruz.music.tone.scale.mode;

import cruz.music.interval.Interval;
import cruz.music.tone.scale.Diatonic;
import lombok.Getter;

/**
 * @author CruzA
 */
@Getter
public class Phrygian extends Diatonic {
	
	private final String feelingString = "Flamenco";
	private final String relativeTonicString = "iii";
	private final String triSuffixString = "minor";
	private final String seventhSuffixString = "minor 7";
	
	private final int first = Interval.MAJOR_THIRD;
	private final int second = Interval.PERFECT_FOURTH;
	private final int third = Interval.PERFECT_FIFTH;
	private final int fourth = Interval.MAJOR_SIXTH;
	private final int fifth = Interval.MAJOR_SEVENTH;
	private final int sixth = Interval.PERFECT_EIGHTH;
	private final int seventh = Interval.MAJOR_NINTH;
	
	private final int eighth = Interval.MAJOR_TENTH;
	private final int ninth = Interval.PERFECT_ELEVENTH;
	private final int tenth = Interval.PERFECT_TWELFTH;
	private final int eleventh = Interval.MAJOR_THIRTENTH;
	private final int twelfth = Interval.MAJOR_FOURTEENTH;
	private final int thirteenth = Interval.PERFECT_FIFTEENTH;
	private final int fourteenth = Interval.MAJOR_SIXTEENTH;
	
	private final int fifteenth = Interval.MAJOR_SEVENTEENTH;
}
