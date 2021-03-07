package cruz.music.tone.chords.tri;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	5	8	10
 * Diatonic Steps:		W	H	2W
 * Semitone Interval:	7	12	16
 * 
 * @author CruzA
 */
public class MajorSecondInversion extends Chord {

	@Override
	public int[] play()
	{
		return new int[] {
				
				Semitone.SEVEN,
				Semitone.ZERO + Octave.ONE,
				Semitone.FOUR + Octave.ONE
		};
	}
}
