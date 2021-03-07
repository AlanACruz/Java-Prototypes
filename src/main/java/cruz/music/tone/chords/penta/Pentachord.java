package cruz.music.tone.chords.penta;

import cruz.music.interval.Octave;
import cruz.music.interval.Semitone;
import cruz.music.tone.chords.ChordVistitor;

/**
 * @author CruzA
 */
public class Pentachord extends ChordVistitor {
	
	@Override
	public int[] play()
	{
		return new int[] {
				
				Semitone.ZERO,
				Semitone.FOUR,
				Semitone.SEVEN,
				Semitone.ELEVEN,
				Semitone.TWO + Octave.ONE
		};
	}
}
