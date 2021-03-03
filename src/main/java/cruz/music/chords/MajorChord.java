package cruz.music.chords;

import cruz.music.chords.abstracts.Trichord;
import cruz.music.chords.interfaces.AddFifth;
import cruz.music.chords.interfaces.AddThird;
import cruz.music.chords.interfaces.AddTonic;
import cruz.music.interval.IntervalConstants;

public class MajorChord extends Trichord implements AddTonic, AddThird, AddFifth {

	int tonic = IntervalConstants.PERFECT_UNITY;
	int third = IntervalConstants.MAJOR_THIRD;
	int fifth = IntervalConstants.PERFECT_FIFTH;

	@Override
	public int getTonic() {
		
		return tonic;
	}
	
	@Override
	public int getThird() {
		
		return third;
	}
	
	@Override
	public int getFifth() {
		
		return fifth;
	}

	@Override
	public int getThirdInversion() {
		
		return getThird() + IntervalConstants.OCTAVE;
	}

	@Override
	public int getTonicInversion() {

		return getFifth() + IntervalConstants.OCTAVE;
	}

	@Override
	public int[] play() {

		return null;
	}

	@Override
	public int[] playFirstInversion() {

		return null;
	}

	@Override
	public int[] playSecondInversion() {

		return null;
	}

}
