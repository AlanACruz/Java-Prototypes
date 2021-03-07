package cruz.music.tone.chords.dyad;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.Chord;

/**
 * Diatonic Interval:	1	8
 * Diatonic Steps:		R	H
 * Semitone Steps:		0	12
 * 
 * @author CruzA
 */
public class DyadOctave extends Chord {

	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.ZERO + Octave.ONE
		};
	}
}
