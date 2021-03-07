package cruz.music.tone.chords.tetra;

import com.google.common.primitives.Ints;

import cruz.music.interval.Semitone;
import cruz.music.tone.chords.tri.Major;

/**
 * Diatonic Interval:	1	2	3	4	5	6	7	8	9	11	13	
 * Diatonic Steps:		R	W	W	H	W	W	W	H	W	W	2W
 * Semitone Steps:		0	2	4	5	7	9	11	12	14	17	21
 * 
 * @author CruzA
 */
public class Major7 extends Major {
	
	@Override
	public int[] play()
	{
		int[] superScale = super.play();
		int[] extendedNotes = { Semitone.ELEVEN };
		
		return Ints.concat(superScale, extendedNotes);
	}
}
