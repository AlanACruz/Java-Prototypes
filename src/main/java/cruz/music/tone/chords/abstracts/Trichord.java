package cruz.music.tone.chords.abstracts;

import cruz.music.tone.chords.dyad.Dyad;

/**
 * @author CruzA
 */
public abstract class Trichord extends Dyad {
	
	public abstract int[] playFirstInversion();
	
	public abstract int[] playSecondInversion();
}
