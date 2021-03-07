package cruz.music.tone.chords.tri;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	1	2	3	4	5	6	7	8	9	11	13	
 * Diatonic Steps:		R	W	W	H	W	W	W	H	W	W	2H
 * Semitone Interval:	0	2	4	5	7	9	11	12	14	17	21
 * 
 * @author CruzA
 */
public class Suspended4SecondInversion extends Chord {

	@Override
	public int[] play()
	{
		return new int[] {
				
				Semitone.SEVEN,
				Semitone.ZERO + Octave.ONE,
				Semitone.FIVE + Octave.ONE
		};
	}
}
