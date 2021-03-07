package cruz.music.tone.chords.hexa;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	1	2	3	4	5	6	7	8	9	11	13	
 * Diatonic Steps:		R	W	W	H	W	W	W	H	W	W	2W
 * Semitone Steps:		0	2	4	5	7	9	11	12	14	17	21
 * 
 * @author CruzA
 */
public class Hexachord extends Chord {
	
	@Override
	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.FOUR,
				Semitone.SEVEN,
				Semitone.ELEVEN,
				Semitone.TWO + Octave.ONE,
				Semitone.FIVE + Octave.ONE
		};
	}
}
