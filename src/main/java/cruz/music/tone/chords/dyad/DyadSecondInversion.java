package cruz.music.tone.chords.dyad;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	2	8
 * Diatonic Steps:		W	H
 * Semitone Interval:	2	12
 * 
 * @author CruzA
 */
public class DyadSecondInversion extends Chord {

	public int[] play()
	{
		return new int[] {
				
				Semitone.TWO,
				Semitone.ZERO + Octave.ONE
		};
	}
}
