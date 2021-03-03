package cruz.music.chords;

import cruz.music.chords.abstracts.Dyad;
import cruz.music.chords.interfaces.AddFifth;
import cruz.music.chords.interfaces.AddTonic;
import cruz.music.interval.IntervalConstants;

public class PowerChord extends Dyad implements AddTonic, AddFifth {

	int tonic = IntervalConstants.PERFECT_UNITY;
	int fifth = IntervalConstants.PERFECT_FIFTH;

	@Override
	public int getTonic() {
		
		return tonic;
	}

	@Override
	public int getFifth() {
		
		return fifth;
	}

	@Override
	public int getTonicInversion() {
		
		return getTonic() + IntervalConstants.OCTAVE;
	}

	@Override
	public int[] play() {

		return null;
	}

	@Override
	public int[] playFirstInversion() {
		// TODO Auto-generated method stub
		return null;
	}
}
