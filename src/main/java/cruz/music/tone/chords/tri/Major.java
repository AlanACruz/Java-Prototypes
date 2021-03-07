package cruz.music.tone.chords.tri;

import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	1	3	5
 * Diatonic Steps:		R	H	W
 * Semitone Interval:	0	5	7
 * 
 * @author CruzA
 */
public class Major extends Chord {

	@Override
	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.FOUR,
				Semitone.SEVEN
		};
	}
}
