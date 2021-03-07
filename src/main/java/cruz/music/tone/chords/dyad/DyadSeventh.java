package cruz.music.tone.chords.dyad;

import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	1	7
 * Diatonic Steps:		R	W
 * Semitone Steps:		0	11
 * 
 * @author CruzA
 */
public class DyadSeventh extends Chord {

	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.ELEVEN
		};
	}
}
