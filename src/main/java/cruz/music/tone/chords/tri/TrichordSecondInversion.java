package cruz.music.tone.chords.tri;

import cruz.music.interval.Octave;
import cruz.music.tone.chords.ChordVistitor;
import cruz.music.tone.scale.Diatonic;

/**
 * @author CruzA
 */
public class TrichordSecondInversion extends ChordVistitor {

	@Override
	public int[] play(Diatonic scale)
	{
		return new int[] {
				
				scale.getFifth(),
				scale.getFirst() + Octave.ONE,
				scale.getThird() + Octave.ONE
		};
	}
}
