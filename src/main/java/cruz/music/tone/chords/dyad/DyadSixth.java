package cruz.music.tone.chords.dyad;

import cruz.music.tone.chords.abstracts.ChordVistitor;
import cruz.music.tone.mode.Mode;

/**
 * @author CruzA
 */
public class DyadSixth extends ChordVistitor {

	public int[] play(Mode mode)
	{
		return new int[] {
			mode.getFirst(),
			mode.getSixth()
		};
	}
}
