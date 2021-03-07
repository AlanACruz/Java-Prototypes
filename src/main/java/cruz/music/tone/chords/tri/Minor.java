package cruz.music.tone.chords.tri;

import cruz.music.interval.Semitone;
import cruz.music.tone.chords.ChordVistitor;

/**
 * @author CruzA
 */
public class Minor extends ChordVistitor {

	@Override
	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.FIVE,
				Semitone.SEVEN
		};
	}
}
