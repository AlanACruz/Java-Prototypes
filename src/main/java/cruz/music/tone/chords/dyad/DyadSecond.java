package cruz.music.tone.chords.dyad;

import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	1	2
 * Diatonic Steps:		R	W
 * Semitone Steps:		0	2
 * 
 * @author CruzA
 */
public class DyadSecond extends Chord {

	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.TWO
		};
	}
}
