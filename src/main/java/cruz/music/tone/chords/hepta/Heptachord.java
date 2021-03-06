package cruz.music.tone.chords.hepta;

import cruz.music.tone.chords.ChordVistitor;
import cruz.music.tone.scale.Diatonic;

/**
 * @author CruzA
 */
public class Heptachord extends ChordVistitor {
	
	@Override
	public int[] play(Diatonic mode)
	{
		return new int[] {
			mode.getFirst(),
			mode.getThird(),
			mode.getFifth(),
			mode.getSeventh(),
			mode.getNinth(),
			mode.getEleventh(),
			mode.getThirteenth()
		};
	}
}
