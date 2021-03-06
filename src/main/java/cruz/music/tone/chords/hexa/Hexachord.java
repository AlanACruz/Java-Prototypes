package cruz.music.tone.chords.hexa;

import cruz.music.interval.Octave;
import cruz.music.tone.chords.ChordVistitor;
import cruz.music.tone.scale.Diatonic;

/**
 * @author CruzA
 */
public class Hexachord extends ChordVistitor {
	
	@Override
	public int[] play(Diatonic scale)
	{
		return new int[] {
				
				scale.getFirst(),
				scale.getThird(),
				scale.getFifth(),
				scale.getSeventh(),
				scale.getSecond() + Octave.ONE,
				scale.getFourth() + Octave.ONE
		};
	}
}
