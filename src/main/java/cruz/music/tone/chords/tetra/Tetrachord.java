package cruz.music.tone.chords.tetra;

import cruz.music.interval.Semitone;
import cruz.music.tone.chords.ChordVistitor;

/**
 * @author CruzA
 */
public class Tetrachord extends ChordVistitor {
	
	@Override
	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.FOUR,
				Semitone.SEVEN,
				Semitone.ELEVEN
		};
	}
}
