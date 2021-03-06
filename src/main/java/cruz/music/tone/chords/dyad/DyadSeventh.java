package cruz.music.tone.chords.dyad;

import cruz.music.tone.chords.ChordVistitor;
import cruz.music.tone.mode.Mode;

/**
 * @author CruzA
 */
public class DyadSeventh extends ChordVistitor {

	public int[] play(Mode mode)
	{
		return new int[] {
			mode.getFirst(),
			mode.getSeventh()
		};
	}
}
