package cruz.music.tone.chords;

public class ChordTest
{
	public static String getNoteFromMidiNumber(int midiNote)
	{
		String[] note_names =
		{
				"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"
		};
		return note_names[midiNote % 12] + ((midiNote / 12) - 1);
	}
}
