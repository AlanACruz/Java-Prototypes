package cruz.music.tone.chords.dyad;

import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	1	5
 * Diatonic Steps:		R	W
 * Semitone Steps:		0	7
 * 
 * @author CruzA
 */
public class DyadFifth extends Chord {

	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.SEVEN
		};
	}
}
