package cruz.music.tone.chords.dyad;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	6	8
 * Diatonic Steps:		W	H
 * Semitone Steps:		9	12
 * 
 * @author CruzA
 */
public class DyadSixthInversion extends Chord {

	public int[] play()
	{
		return new int[] {
				
				Semitone.NINE,
				Semitone.ZERO + Octave.ONE
		};
	}
}
