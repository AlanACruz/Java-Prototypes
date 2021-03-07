package cruz.music.tone.chords.dyad;

import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	1	3
 * Diatonic Steps:		R	W
 * Semitone Steps:		0	4
 * 
 * @author CruzA
 */
public class DyadThird extends Chord {

	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.FOUR
		};
	}
}
