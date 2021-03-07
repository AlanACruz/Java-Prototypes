package cruz.music.tone.chords.dyad;

import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	1	6
 * Diatonic Steps:		R	W
 * Semitone Interval:	0	9
 * 
 * @author CruzA
 */
public class DyadSixth extends Chord {

	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.NINE
		};
	}
}
