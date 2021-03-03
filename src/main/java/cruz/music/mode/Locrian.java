package cruz.music.mode;

import cruz.music.interval.IntervalConstants;
import lombok.Getter;

@Getter
public class Locrian extends Mode {
	
	private String relativeTonic = "viiø";
	
	private final int first = IntervalConstants.MAJOR_SEVENTH;
	private final int second = IntervalConstants.PERFECT_EIGHTH;
	private final int third = IntervalConstants.MAJOR_NINTH;
	private final int fourth = IntervalConstants.MAJOR_TENTH;
	private final int fifth = IntervalConstants.PERFECT_ELEVENTH;
	private final int sixth = IntervalConstants.PERFECT_TWELFTH;
	private final int seventh = IntervalConstants.MAJOR_THIRTENTH;
}
