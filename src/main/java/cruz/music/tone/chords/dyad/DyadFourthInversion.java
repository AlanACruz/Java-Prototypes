package cruz.music.tone.chords.dyad;

import cruz.music.tone.chords.ChordVistitor;
import cruz.music.tone.scale.Diatonic;

/**
 * @author CruzA
 */
public class DyadFourthInversion extends ChordVistitor {

	public int[] play(Diatonic mode)
	{
		return new int[] {
			mode.getFourth(),
			mode.getEighth()
		};
	}
}
