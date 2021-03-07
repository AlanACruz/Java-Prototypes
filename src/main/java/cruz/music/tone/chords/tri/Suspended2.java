package cruz.music.tone.chords.tri;

import cruz.music.interval.Semitone;
import cruz.music.tone.chords.ChordVistitor;

/**
 * @author CruzA
 */
public class Suspended2 extends ChordVistitor {

	@Override
	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.TWO,
				Semitone.SEVEN
		};
	}
}
