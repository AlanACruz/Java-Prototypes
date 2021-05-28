package cruz.music.tone.chords;

import org.junit.jupiter.api.Test;

public class ChordTest
{
	@Test
	public void major7ChordTest()
	{

	}

	public String getNoteFromMidiNumber( int midiNote )
	{
		String[] note_names =
		{
			"C ", "C#", "D ", "D#", "E ", "F ", "F#", "G ", "G#", "A ", "A#", "B "
		};
		return note_names[ midiNote % 12 ] + ( ( midiNote / 12 ) - 1 );
	}
}
