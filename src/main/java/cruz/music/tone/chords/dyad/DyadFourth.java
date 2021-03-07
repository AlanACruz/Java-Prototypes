package cruz.music.tone.chords.dyad;

import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	1	4
 * Diatonic Steps:		R	H
 * Semitone Interval:	0	5
 * 
 * @author CruzA
 */
public class DyadFourth extends Chord {

	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.FIVE
		};
	}
}
