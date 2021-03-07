package cruz.music.tone.chords.dyad;

import cruz.music.interval.Semitone;
import cruz.music.tone.chords.ChordVistitor;

/**
 * @author CruzA
 */
public class DyadThird extends ChordVistitor {

	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.FOUR
		};
	}
}
