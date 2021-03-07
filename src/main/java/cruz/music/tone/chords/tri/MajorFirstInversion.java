package cruz.music.tone.chords.tri;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	3	5	8
 * Diatonic Steps:		W	W	H
 * Semitone Steps:		4	7	12
 * 
 * @author CruzA
 */
public class MajorFirstInversion extends Chord {

	@Override
	public int[] play()
	{
		return new int[] {
				
				Semitone.FOUR,
				Semitone.SEVEN,
				Semitone.ZERO + Octave.ONE
		};
	}
}
