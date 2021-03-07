package cruz.music.tone.chords.dyad;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	5	8
 * Diatonic Steps:		W	H
 * Semitone Steps:		7	12
 * 
 * @author CruzA
 */
public class DyadFifthInversion extends Chord {

	public int[] play()
	{
		return new int[] {
				
				Semitone.SEVEN,
				Semitone.ZERO + Octave.ONE
		};
	}
}
