package cruz.music.tone.scale.mode;

import cruz.music.interval.Interval;
import cruz.music.tone.scale.Diatonic;
import lombok.Getter;

/**
 * @author CruzA
 */
@Getter
public class Locrian extends Diatonic {
	
	private final String feelingString = "Sinister";
	private final String relativeTonicString = "vii";
	private final String triSuffixString = "Half-Diminished";
	private final String seventhSuffixString = "Diminished";
	
	private final int first = Interval.MAJOR_SEVENTH;
	private final int second = Interval.PERFECT_EIGHTH;
	private final int third = Interval.MAJOR_NINTH;
	private final int fourth = Interval.MAJOR_TENTH;
	private final int fifth = Interval.PERFECT_ELEVENTH;
	private final int sixth = Interval.PERFECT_TWELFTH;
	private final int seventh = Interval.MAJOR_THIRTENTH;
	
	private final int eighth = Interval.MAJOR_FOURTEENTH;
	private final int ninth = Interval.PERFECT_FIFTEENTH;
	private final int tenth = Interval.MAJOR_SIXTEENTH;
	private final int eleventh = Interval.MAJOR_SEVENTEENTH;
	private final int twelfth = Interval.PERFECT_EIGHTEENTH;
	private final int thirteenth = Interval.PERFECT_NINETEENTH;
	private final int fourteenth = Interval.MAJOR_TWENTIETH;
	
	private final int fifteenth = Interval.MAJOR_TWENTY_FIRST;
}
