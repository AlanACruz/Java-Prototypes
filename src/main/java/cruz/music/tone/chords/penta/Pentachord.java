package cruz.music.tone.chords.penta;

import cruz.music.tone.chords.ChordVistitor;
import cruz.music.tone.mode.Mode;

/**
 * @author CruzA
 */
public class Pentachord extends ChordVistitor {
	
	@Override
	public int[] play(Mode mode)
	{
		return new int[] {
			mode.getFirst(),
			mode.getThird(),
			mode.getFifth(),
			mode.getSeventh(),
			mode.getNinth()
		};
	}
}
