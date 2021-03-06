package cruz.luthier;

import cruz.music.note.value.LetterNames;
import cruz.music.interval.Octave;

/**
 * @author CruzA
 * 
 * https://en.wikipedia.org/wiki/Scientific_pitch_notation
 */
public class MidiPitchNotation
{
	/**
	 * @implNote C-sub(0) = MIDI note 12
	 *
	 * @param note
	 * @param octave
	 *
	 * @return
	 */
	public static int getMidiNoteNumber(
			int note,
			int octave
	)
	{
		int noteOrdinal   = LetterNames.C;
		int octaveOrdinal = Octave.ZERO;

		return (12 * (octaveOrdinal)) + noteOrdinal;
	}
}