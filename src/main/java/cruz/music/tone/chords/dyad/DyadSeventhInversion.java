package cruz.music.tone.chords.dyad;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	7	8
 * Diatonic Steps:		W	H
 * Semitone Steps:		11	12
 * 
 * @author CruzA
 */
public class DyadSeventhInversion extends Chord {

	public int[] play()
	{
		return new int[] {
				
				Semitone.ELEVEN,
				Semitone.ZERO + Octave.ONE
		};
	}
}
