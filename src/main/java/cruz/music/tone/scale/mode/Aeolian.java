package cruz.music.tone.scale.mode;

import cruz.music.interval.Interval;
import cruz.music.tone.scale.Diatonic;
import lombok.Getter;

/**
 * @author CruzA
 */
@Getter
public class Aeolian extends Diatonic {
	
	private final int scaleLength = 7;
	
	private final String feelingString = "Sad";
	private final String getScaleName = "vi";
	private final String triSuffixString = "minor";
	private final String seventhSuffixString = "minor 7";
	
	private final int first = Interval.MAJOR_SIXTH;
	private final int second = Interval.MAJOR_SEVENTH;
	private final int third = Interval.PERFECT_EIGHTH;
	private final int fourth = Interval.MAJOR_NINTH;
	private final int fifth = Interval.MAJOR_TENTH;
	private final int sixth = Interval.PERFECT_ELEVENTH;
	private final int seventh = Interval.PERFECT_TWELFTH;
	
	private final int eighth = Interval.MAJOR_THIRTENTH;
	private final int ninth = Interval.MAJOR_FOURTEENTH;
	private final int tenth = Interval.PERFECT_FIFTEENTH;
	private final int eleventh = Interval.MAJOR_SIXTEENTH;
	private final int twelfth = Interval.MAJOR_SEVENTEENTH;
	private final int thirteenth = Interval.PERFECT_EIGHTEENTH;
	private final int fourteenth = Interval.PERFECT_NINETEENTH;
	
	private final int fifteenth = Interval.MAJOR_TWENTIETH;
}
