package cruz.music.tone.chords.dyad;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.ChordVistitor;

/**
 * @author CruzA
 */
public class DyadSixthInversion extends ChordVistitor {

	public int[] play()
	{
		return new int[] {
				
				Semitone.NINE,
				Semitone.ZERO + Octave.ONE
		};
	}
}
