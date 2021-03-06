package cruz.music.tone.chords.tri;

import cruz.music.tone.chords.ChordVistitor;
import cruz.music.tone.scale.Diatonic;

/**
 * @author CruzA
 */
public class TrichordSecondInversion extends ChordVistitor {

	@Override
	public int[] play(Diatonic mode)
	{
		return new int[] {
			mode.getFifth(),
			mode.getEighth(),
			mode.getTenth()
		};
	}
}
