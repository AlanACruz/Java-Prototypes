package cruz.music.tone.chords.tri;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.ChordVistitor;

/**
 * @author CruzA
 */
public class Suspended4SecondInversion extends ChordVistitor {

	@Override
	public int[] play()
	{
		return new int[] {
				
				Semitone.SEVEN,
				Semitone.ZERO + Octave.ONE,
				Semitone.FIVE + Octave.ONE
		};
	}
}
