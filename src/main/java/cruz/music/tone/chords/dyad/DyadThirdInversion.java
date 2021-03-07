package cruz.music.tone.chords.dyad;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	3	8
 * Diatonic Steps:		W	H
 * Semitone Steps:		4	12
 * 
 * @author CruzA
 */
public class DyadThirdInversion extends Chord {

	public int[] play()
	{
		return new int[] {
				
				Semitone.FOUR,
				Semitone.ZERO + Octave.ONE
		};
	}
}
