package cruz.music.tone.chords.dyad;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.ChordVistitor;

/**
 * @author CruzA
 */
public class DyadOctave extends ChordVistitor {

	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.ZERO + Octave.ONE
		};
	}
}
