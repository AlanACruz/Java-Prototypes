package cruz.luthier;

/**
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
			LetterNames note,
			Octaves octave
	)
	{
		int noteOrdinal   = note.ordinal();
		int octaveOrdinal = octave.ordinal();

		return (12 * (octaveOrdinal + 1)) + noteOrdinal;
	}
}
