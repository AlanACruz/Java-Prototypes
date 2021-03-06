package cruz.music.tone.scale.mode;

import cruz.music.interval.Interval;
import cruz.music.tone.scale.Diatonic;
import lombok.Getter;

/**
 * @author CruzA
 */
@Getter
public class Lydian extends Diatonic {
	
	private final int scaleLength = 7;
	
	private final String feelingString = "Bright";
	private final String getScaleName = "IV";
	private final String triSuffixString = "Major";
	private final String seventhSuffixString = "Major 7";
	
	private final int first = Interval.PERFECT_FOURTH;
	private final int second = Interval.PERFECT_FIFTH;
	private final int third = Interval.MAJOR_SIXTH;
	private final int fourth = Interval.MAJOR_SEVENTH;
	private final int fifth = Interval.PERFECT_EIGHTH;
	private final int sixth = Interval.MAJOR_NINTH;
	private final int seventh = Interval.MAJOR_TENTH;
	
	private final int eighth = Interval.PERFECT_ELEVENTH;
	private final int ninth = Interval.PERFECT_TWELFTH;
	private final int tenth = Interval.MAJOR_THIRTENTH;
	private final int eleventh = Interval.MAJOR_FOURTEENTH;
	private final int twelfth = Interval.PERFECT_FIFTEENTH;
	private final int thirteenth = Interval.MAJOR_SIXTEENTH;
	private final int fourteenth = Interval.MAJOR_SEVENTEENTH;
	
	private final int fifteenth = Interval.PERFECT_EIGHTEENTH;
}
