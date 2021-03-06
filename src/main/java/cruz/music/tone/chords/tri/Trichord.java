package cruz.music.tone.chords.tri;

import cruz.music.tone.chords.ChordVistitor;
import cruz.music.tone.scale.Diatonic;

/**
 * @author CruzA
 */
public class Trichord extends ChordVistitor {

	@Override
	public int[] play(Diatonic scale)
	{
		return new int[] {
				
				scale.getFirst(),
				scale.getThird(),
				scale.getFifth()
		};
	}
}
