package cruz.music.tone.chords.dyad;

import cruz.music.interval.Octave;
import cruz.music.tone.chords.ChordVistitor;
import cruz.music.tone.scale.Diatonic;

/**
 * @author CruzA
 */
public class DyadThirdInversion extends ChordVistitor {

	public int[] play(Diatonic scale)
	{
		return new int[] {
				
				scale.getThird(),
				scale.getFirst() + Octave.ONE
		};
	}
}
