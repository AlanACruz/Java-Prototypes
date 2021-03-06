package cruz.music.tone.chords;

import cruz.music.tone.scale.Diatonic;

/**
 * @author CruzA
 */
public abstract class ChordVistitor {

	public abstract int[] play(Diatonic scale);
}
