package cruz.music.tone.chords.dyad;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	4	8	
 * Diatonic Steps:		H	H
 * Semitone Interval:	5	12
 * 
 * @author CruzA
 */
public class DyadFourthInversion extends Chord {

	public int[] play()
	{
		return new int[] {
				
				Semitone.FIVE,
				Semitone.ZERO + Octave.ONE
		};
	}
}
