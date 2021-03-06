package cruz.music.tone.scale.mode;

import cruz.music.interval.Interval;
import cruz.music.tone.scale.Diatonic;
import lombok.Getter;

@Getter
public class Mixolydian extends Diatonic {
	
	private final String feelingString = "Bluesy";
	private final String relativeTonicString = "V";
	private final String triSuffixString = "Major";
	private final String seventhSuffixString = "Dominant 7";
	
	private final int first = Interval.PERFECT_FIFTH;
	private final int second = Interval.MAJOR_SIXTH;
	private final int third = Interval.MAJOR_SEVENTH;
	private final int fourth = Interval.PERFECT_EIGHTH;
	private final int fifth = Interval.MAJOR_NINTH;
	private final int sixth = Interval.MAJOR_TENTH;
	private final int seventh = Interval.PERFECT_ELEVENTH;
	
	private final int eighth = Interval.PERFECT_TWELFTH;
	private final int ninth = Interval.MAJOR_THIRTENTH;
	private final int tenth = Interval.MAJOR_FOURTEENTH;
	private final int eleventh = Interval.PERFECT_FIFTEENTH;
	private final int twelfth = Interval.MAJOR_SIXTEENTH;
	private final int thirteenth = Interval.MAJOR_SEVENTEENTH;
	private final int fourteenth = Interval.PERFECT_EIGHTEENTH;
			
	private final int fifteenth = Interval.PERFECT_NINETEENTH;
}
